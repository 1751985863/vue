package cn.nanfeng.service;

import cn.nanfeng.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Integer userId);
    void update(User user);
}
