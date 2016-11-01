package com.chandan.service;

import com.chandan.dao.UserRepository;
import com.chandan.entity.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.ldap.query.LdapQueryBuilder.query;

/**
 * Created by rc_chandan on 01/11/16.
 */

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<AppUser> getAllUsers() {
        return userRepository.findAll();
    }


    public AppUser getUserByName(String name) {
        return userRepository.findOne(query().base("ou=users").where("cn").is(name));
    }
}
