package com.pengsong.authservice.dao;

import com.pengsong.authservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author pengsong
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
