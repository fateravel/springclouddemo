package com.pengsong.security.service.impl;

import com.pengsong.security.service.IBlogService;
import com.pengsong.security.model.Blog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author pengsong
 */
@Service
public class BlogService implements IBlogService {

    private List<Blog> list = new ArrayList<>();

    public BlogService() {
        list.add(new Blog(1L, " spring in action", "good!"));
        list.add(new Blog(2L, " spring boot in action", "nice!"));
    }

    @Override
    public List<Blog> getBlogs() {
        return list;
    }

    @Override
    public void deleteBlog(long id) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Blog blog = (Blog) iterator.next();
            if (blog.getId() == id) {
                iterator.remove();
            }
        }
    }
}
