package com.chandan.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;

/**
 * Created by rc_chandan on 01/11/16.
 */

@Configuration
public class LdapConfig {

    @Bean
    public LdapTemplate ldapTemplate() {
        LdapTemplate ldapTemplate = new LdapTemplate();

        LdapContextSource contextSource = new LdapContextSource();
        contextSource.setUrl("ldap://localhost:10389");
        contextSource.setBase("o=vizexperts,dc=example,dc=com");
        contextSource.afterPropertiesSet();
        ldapTemplate.setContextSource(contextSource);

        return ldapTemplate;
    }

}
