package com.youxiang.dynamic4proxy;

import com.youxiang.IUserDao;

/**
 * @author: Rivers
 * @date: 2018/4/4
 */
public class UserDao implements IUserDao {

    @Override
    public void saveUser() {
        System.out.println("保存用户信息");
    }
}
