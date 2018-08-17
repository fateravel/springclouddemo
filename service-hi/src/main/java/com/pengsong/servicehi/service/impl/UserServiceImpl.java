package com.pengsong.servicehi.service.impl;

import com.pengsong.servicehi.dao.UserDao;
import com.pengsong.servicehi.model.User;
import com.pengsong.servicehi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author pengsong
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserDao userDao;

    @Override
    public User create(String username, String password) {
        String pwd = passwordEncoder.encode(password);
        User user = new User();
        user.setUsername(username);
        user.setPassword(pwd);
        return userDao.save(user);
    }
}
