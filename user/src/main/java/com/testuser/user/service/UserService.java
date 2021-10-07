package com.testuser.user.service;

import com.testuser.user.entity.User;

public interface UserService {

    User saveUserDetails(User user);
    User getUserDetails(Long userId);
}
