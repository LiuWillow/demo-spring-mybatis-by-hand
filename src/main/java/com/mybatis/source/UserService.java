package com.mybatis.source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * date  2019/1/19
 * author liuwillow
 **/
@Service
public class UserService {
    @Autowired
    private UserDao1 userDao1;
    Object query(){
        return userDao1.query();
    }
}
