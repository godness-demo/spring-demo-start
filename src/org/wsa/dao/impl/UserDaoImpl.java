package org.wsa.dao.impl;

import org.wsa.dao.UserDao;
import org.wsa.pojo.User;

public class UserDaoImpl implements UserDao {
    public void insert(User user){
        System.out.println("插入方法执行了");
    }
}
