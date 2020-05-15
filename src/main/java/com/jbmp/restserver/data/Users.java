package com.jbmp.restserver.data;

import java.util.List;

/**
 * Kvuli obejiti JBPM, kde nelze jako result data type zadat list uzivatelu
 */
public class Users {
    private final List<User> users;

    public Users(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }
}
