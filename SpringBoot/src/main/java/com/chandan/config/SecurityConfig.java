package com.chandan.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.util.Arrays;

/**
 * Created by rc_chandan on 26/10/16.
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception{

        http.authorizeRequests()
                .antMatchers("/students/**")
                    .authenticated()
                    .and()
                .formLogin()
                    .permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.ldapAuthentication()
                .userSearchBase("ou=users,o=vizexperts,dc=example,dc=com")
                .userSearchFilter("(uid={0})")
                .groupSearchBase("cn=Admin,ou=groups,o=vizexperts,dc=example,dc=com")
                .groupRoleAttribute("Admin")
                .contextSource().url("ldap://localhost:10389");
    }
}
