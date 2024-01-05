package org.wsa.service.impl;

import org.wsa.dao.UserDao;
import org.wsa.pojo.User;
import org.wsa.service.UserService;


public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void insert(User user) {
        System.out.println("service层方法被执行了");
        userDao.insert(user);
    }
}
