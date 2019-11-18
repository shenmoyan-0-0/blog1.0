package com.scs.web.blog.service;

import com.scs.web.blog.domain.UserDto;
import com.scs.web.blog.entity.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface UserService {

    Map<String,Object> signIn(UserDto userDto);
}


