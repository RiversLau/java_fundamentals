package com.youxiang.static4proxy;

import org.junit.Test;

/**
 * @author: Rivers
 * @date: 2018/4/4
 */
public class StaticProxyTest {

    @Test
    public void testStaticProxy() {
        UserDaoImpl userDao = new UserDaoImpl();
        UserDaoProxy proxy = new UserDaoProxy(userDao);
        proxy.saveUser();
    }
}
