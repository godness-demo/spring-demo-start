package org.wsa.controller;

import org.junit.Test;
import org.wsa.pojo.User;
import org.wsa.service.UserService;

public class UserController {
    private UserService userService;
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    public void insert(){
        User user = new User();
        System.out.println("controller层代码被执行了");
        userService.insert(user);
    }
}
