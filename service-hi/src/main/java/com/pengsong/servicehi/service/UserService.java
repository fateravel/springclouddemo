package com.pengsong.servicehi.service;

import com.pengsong.servicehi.model.User;

/**
 * @author pengsong
 */
public interface UserService {

    User create(String username, String password);

}
