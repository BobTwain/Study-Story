package com.itheima.dao;
/*用户持久层接口*/

import com.itheima.domain.User;

import java.util.List;

public interface IUserDao {
    /*用户持久层接口*/
    List<User> findAll();
}
