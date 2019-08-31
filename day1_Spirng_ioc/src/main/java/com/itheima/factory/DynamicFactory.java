package com.itheima.factory;

import com.itheima.dao.Impl.UserDaoImpl;
import com.itheima.dao.UserDao;

public class DynamicFactory {

    //工厂的实例化方法
    public  UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
