package com.pengsong.security.controller;

import com.pengsong.security.service.impl.BlogService;
import com.pengsong.security.model.Blog;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author pengsong
 */
@RestController
@RequestMapping("/blogs")
public class BlogController {

    BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping
    public ModelAndView list(Model model) {
        List<Blog> list = blogService.getBlogs();
        model.addAttribute("blogsList", list);
        return new ModelAndView("blogs/list", "blogModel", model);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/{id}/delete")
    public ModelAndView delete(@PathVariable("id") Long id, Model model) {
        blogService.deleteBlog(id);
        model.addAttribute("blogsList", blogService.getBlogs());
        return new ModelAndView("blogs/list", "blogModel", model);
    }
}
