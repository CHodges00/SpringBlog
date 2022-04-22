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
    private final EmailService emailService;

    public PostController(PostRepository postDao, UserRepository userDao, EmailService emailService){
        this.postDao = postDao;
        this.userDao = userDao;
        this.emailService = emailService;
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
        emailService.prepareAndSend(post, "Email about post creation", "Your Post has been created");
        postDao.save(post);
        return "redirect:/posts";
    }


    @GetMapping("/posts/{id}/edit")
    public String postsEdit(@PathVariable long id, Model model){
        model.addAttribute("post", postDao.getById(id));
        return "posts/edit";
    }


    @PostMapping("/posts/edit")
    public String updatePost(@ModelAttribute Post post){
        User user = userDao.findByUsername("User1");
        post.setOwner(user);
        postDao.save(post);
        return "redirect:/posts";
    }


}

