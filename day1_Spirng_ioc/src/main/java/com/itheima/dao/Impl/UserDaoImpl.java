package com.itheima.dao.Impl;

import com.itheima.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public UserDaoImpl(){
        System.out.println("我是无参构造....");
    }

    public void save() {
        System.out.println("save......");
    }

    public void init(){
        System.out.println("初始化方法...");
    }

    public void destory(){
        System.out.println("销毁方法.....");
    }
}
