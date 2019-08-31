package com.itheima.service.Impl;

import com.itheima.dao.UserDao;
import com.itheima.service.Userservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserService implements Userservice {

    private UserDao userDao;

    public UserService() {

    }

    public void UserService(UserDao userDao) {
        this.userDao = userDao;
    }

  /*   public UserService(String s) {
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
*/

    public void save() {
        userDao.save();
    }
}
