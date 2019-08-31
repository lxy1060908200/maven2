package com.itheima.factory;

import com.itheima.dao.Impl.UserDaoImpl;
import com.itheima.dao.UserDao;

/*
* 工厂的概念：Spring容器就是一个巨大的工厂。Spring容器使用Ioc管理所有组成应用系统的组件
* */
public class StaticFactory {

    //工厂的静态方法
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
