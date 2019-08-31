package com.itheima.tset;

import com.itheima.dao.UserDao;

import java.util.HashMap;
import java.util.Map;

public class UserTest {

    private static Map<String,Object> container;

    //模拟配置文件
    private static String id ="userDao";
    private static String class_ = "com.itheima.dao.Impl.UserDaoImpl";

    //容器加载
    static {
        //自身容器初始化
        container = new HashMap<String, Object>();

        //容器创建对象
        try {
            Object userDao = Class.forName(class_).newInstance();
            //放进容器
            container.put(id,userDao);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UserDao userDao = (UserDao) container.get("userDao");
        System.out.println(userDao);
    }

}
