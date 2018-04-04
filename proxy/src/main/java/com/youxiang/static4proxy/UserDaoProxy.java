package com.youxiang.static4proxy;

import com.youxiang.IUserDao;

/**
 * @author: Rivers
 * @date: 2018/4/4
 */
public class UserDaoProxy implements IUserDao {

    private IUserDao userDao;

    public UserDaoProxy(IUserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser() {
        System.out.println("静态代理--事务开始");
        this.userDao.saveUser();
        System.out.println("静态代理--事务结束");
    }
}
