package com.chandan.entity;

import org.springframework.ldap.odm.annotations.*;

import javax.naming.Name;
import java.util.Set;

/**
 * Created by rc_chandan on 01/11/16.
 */

@Entry(base = "ou=users",
        objectClasses = {"inetOrgPerson", "person", "organizationalPerson", "top"})
public class AppUser {

    @Id
    private Name id;

    @Attribute(name = "uid")
    @DnAttribute(value = "uid", index = 1)
    private String uid;

    @Attribute(name = "cn")
    private String name;

    @Attribute(name = "userPassword")
    private String password;

    @Transient
    private boolean enabled;

    @Transient
    private Set<Role> roles;

    public Name getId() {
        return id;
    }

    public void setId(Name id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
