package com.codeup.SpringBlog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    private final PostRepository postDao;
    private final UserRepository userDao;

    public PostController(PostRepository postDao, UserRepository userDao){
        this.postDao = postDao;
        this.userDao = userDao;
    }


    //    MAKE INDEX THAT WILL SHOW ALL POSTS
    @GetMapping("/posts")
    public String postsIndex(Model model) {
        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }

    //    MAKE /SHOW THAT WILL SHOW INDIVIDUAL POSTS
    @GetMapping("/posts/show/{title}")
    public String postsShow(@PathVariable String title, Model model) {
        model.addAttribute("post", postDao.findByTitle(title));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String postsCreate(Model model){
        model.addAttribute("post", new Post());
        return "posts/create";
    }


    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post){
        User user = userDao.findByUsername("User1");
        post.setOwner(user);
        postDao.save(post);
        return "redirect:/posts";
    }


    @GetMapping("/posts/{id}/edit}")
    public String postsEdit(@PathVariable String title, Post post){
        postDao.findByTitle(title);
        return "posts/edit";
    }


}

