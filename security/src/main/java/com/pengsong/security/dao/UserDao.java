package com.pengsong.security.dao;

import com.pengsong.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author pengsong
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
