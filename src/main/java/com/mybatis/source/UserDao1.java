package com.mybatis.source;

/**
 * date  2019/1/20
 * author liuwillow
 **/
public interface UserDao1 {
    @Select("SELECT * FROM `user1`")
    Object query();
}
