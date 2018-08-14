package com.pengsong.security.Service;

import com.pengsong.security.model.Blog;

import java.util.List;

/**
 * @author pengsong
 */
public interface IBlogService {
    List<Blog> getBlogs();
    void deleteBlog(long id);
}
