package com.chandan.controller;

import com.chandan.dao.UserRepository;
import com.chandan.entity.AppUser;
import com.chandan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Iterator;

/**
 * Created by rc_chandan on 01/11/16.
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public String getAllUsers() {

        // Get all users
        Iterable<AppUser> usersItr = userService.getAllUsers();

        Iterator<AppUser> itr = usersItr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().getName());
        }

        System.out.println(userService.getUserByName("chandan rana").getId());

        return "users";
    }
}
