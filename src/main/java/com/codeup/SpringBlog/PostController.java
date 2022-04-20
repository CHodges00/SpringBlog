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
    @GetMapping("/posts")
    public String postsIndex(Model model) {
        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }

    //    MAKE /SHOW THAT WILL SHOW INDIVIDUAL POSTS
    @GetMapping("/posts/show/{title}")
    public String postsShow(@PathVariable String title, Model model) {
        model.addAttribute("search", title);
        model.addAttribute("post", postDao.findByTitle(title));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String postsCreate(Model model){
        model.addAttribute("post", new Post());
        return "posts/create";
    }


    @PostMapping("/posts/create")
    public String createPost(@RequestParam String body, @RequestParam String title, Model model){
        postDao.save(new Post(body, title));
        return "redirect:/posts";
    }

}

