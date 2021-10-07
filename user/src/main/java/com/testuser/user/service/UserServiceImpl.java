package com.testuser.user.service;

import com.testuser.user.dao.UserDao;
import com.testuser.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public User saveUserDetails(User user) {
        return userDao.save(user);
    }

    @Override
    public User getUserDetails(Long userId) {
        List<User> userList = userDao.findAll();
        return userList.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElse(null);
    }
}
