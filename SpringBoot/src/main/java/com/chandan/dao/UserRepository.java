package com.chandan.dao;

import com.chandan.entity.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;
import org.springframework.ldap.query.LdapQuery;
import org.springframework.ldap.repository.LdapRepository;
import org.springframework.stereotype.Repository;

import javax.naming.Name;

/**
 * Created by rc_chandan on 01/11/16.
 */

@Repository
public class UserRepository implements LdapRepository<AppUser>{

    private final LdapTemplate ldapTemplate;

    @Autowired
    public UserRepository(LdapTemplate ldapTemplate) {
        this.ldapTemplate = ldapTemplate;
    }

    @Override
    public AppUser findOne(LdapQuery ldapQuery) {
        return ldapTemplate.findOne(ldapQuery, AppUser.class);
    }

    @Override
    public Iterable<AppUser> findAll(LdapQuery ldapQuery) {
        return null;
    }

    @Override
    public <S extends AppUser> S save(S s) {
        return null;
    }

    @Override
    public <S extends AppUser> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public AppUser findOne(Name name) {
        return null;
    }

    @Override
    public boolean exists(Name name) {
        return false;
    }

    @Override
    public Iterable<AppUser> findAll() {
        return ldapTemplate.findAll(AppUser.class);
    }

    @Override
    public Iterable<AppUser> findAll(Iterable<Name> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Name name) {

    }

    @Override
    public void delete(AppUser appUser) {

    }

    @Override
    public void delete(Iterable<? extends AppUser> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
