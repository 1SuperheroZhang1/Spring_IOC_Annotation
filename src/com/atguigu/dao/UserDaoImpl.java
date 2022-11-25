package com.atguigu.dao;

import org.springframework.stereotype.Repository;

/**
 * @author superherozhang
 * @create 2022-09-30 9:52
 */
@Repository(value = "userDaoImpl")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao add.......");
    }
}
