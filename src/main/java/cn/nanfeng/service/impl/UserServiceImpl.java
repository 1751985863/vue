package cn.nanfeng.service.impl;

import cn.nanfeng.dao.UserDao;
import cn.nanfeng.domain.User;
import cn.nanfeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(Integer userId) {
        return userDao.findById(userId);
    }

    @Override
    public void update(User user) {
        userDao.update(user);

    }
}
