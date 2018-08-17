package com.pengsong.servicehi.dao;

import com.pengsong.servicehi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author pengsong
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
