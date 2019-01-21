package com.mybatis.source;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * date  2019/1/20
 * author liuwillow
 **/
public class UserService2 {
    @Autowired
    private UserDao2 userDao2;
    Object query(){
        return userDao2.query();
    }
}
