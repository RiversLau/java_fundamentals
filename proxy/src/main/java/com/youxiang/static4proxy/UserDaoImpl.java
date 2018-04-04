package com.youxiang.static4proxy;

import com.youxiang.IUserDao;

/**
 * @author: Rivers
 * @date: 2018/4/4
 */
public class UserDaoImpl implements IUserDao {

    public void saveUser() {
        System.out.println("保存用户信息");
    }
}
