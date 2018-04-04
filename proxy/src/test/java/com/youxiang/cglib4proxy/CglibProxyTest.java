package com.youxiang.cglib4proxy;

import org.junit.Test;

/**
 * @author: Rivers
 * @date: 2018/4/4
 */
public class CglibProxyTest {

    @Test
    public void testCglibProxy() {
        UserDao userDao = new UserDao();
        System.out.println(userDao.getClass());
        ProxyFactory proxyFactory = new ProxyFactory(userDao);
        UserDao userDaoProxy = (UserDao) proxyFactory.getProxyInstance();
        System.out.println(userDaoProxy.getClass());
        userDaoProxy.saveUser();
    }
}
