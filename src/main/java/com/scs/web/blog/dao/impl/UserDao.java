package com.scs.web.blog.dao.impl;

import com.scs.web.blog.entity.User;

import java.sql.SQLException;
import java.util.List;
public interface UserDao {

    int[] batchInsert(List<User> userList) throws SQLException;
    User findUserByMobile(String mobile) throws SQLException;

}
