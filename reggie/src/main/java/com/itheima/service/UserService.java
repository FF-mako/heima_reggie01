package com.itheima.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.User;

public interface UserService extends IService<User> {
    User findUser(String phone);
}
