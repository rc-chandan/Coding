package com.chandan.entity;

import org.springframework.ldap.odm.annotations.*;

import javax.naming.Name;
import java.util.Set;

/**
 * Created by rc_chandan on 01/11/16.
 */

@Entry(base = "ou=groups",
        objectClasses = {"groupOfUniqueNames", "top"})
public class Role {

    @Id
    private Name id;

    @Attribute(name = "cn")
    @DnAttribute(value = "cn", index = 1)
    private String name;

    @Attribute(name = "description")
    private String description;

    @Transient
    private Set<AppUser> users;
}
