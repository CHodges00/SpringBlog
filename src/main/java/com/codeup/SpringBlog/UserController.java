package com.codeup.SpringBlog;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private final UserRepository userDao;

    public UserController(UserRepository userDao){
        this.userDao = userDao;
    }

}
