package com.itheima.tset;

import com.itheima.dao.UserDao;
import com.itheima.service.Impl.UserService;
import com.itheima.service.Userservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTset {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();

   /*     Userservice userservice = new UserService();
        userservice.save();*/
    }
}
