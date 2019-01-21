package com.mybatis.source;

/**
 * date  2019/1/20
 * author liuwillow
 **/
public interface UserDao2 {
    @Select("SELECT * FROM `user2`")
    Object query();
}
