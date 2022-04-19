package com.codeup.SpringBlog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {
    private final PostRepository postDao;

    public PostController(PostRepository postDao){
        this.postDao = postDao;
    }


    //    MAKE INDEX THAT WILL SHOW ALL POSTS
    @GetMapping("/posts/index")
    public String postsIndex(Model model) {
        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }

    //    MAKE SHOW THAT WILL SHOW INDIVIDUAL POSTS
//    WHEN POST IS PICKED FROM VIEW (give href with integer in .html), REDIRECT TO POSTS/SHOW, THEN display post info on .html
    @GetMapping("/posts/{search}")
    public String postsShow(@PathVariable String search, Model model) {
        model.addAttribute("search", search);
        model.addAttribute("post", postDao.findByTitle(search));
        return "posts/show";
    }


}

