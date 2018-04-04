package com.youxiang.dynamic4proxy;

import com.youxiang.IUserDao;
import org.junit.Test;

/**
 * @author: Rivers
 * @date: 2018/4/4
 */
public class DynamicProxyTest {

    @Test
    public void testDynamicProxy() {
        IUserDao userDao = new UserDao();
        System.out.println(userDao.getClass());
        ProxyFactory proxyFactory = new ProxyFactory(userDao);
        IUserDao userDaoProxy = (IUserDao) proxyFactory.getProxyInstance();
        System.out.println(userDaoProxy.getClass());
        userDaoProxy.saveUser();
    }
}
