package com.codeup.SpringBlog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {


    //    MAKE INDEX THAT WILL SHOW ALL POSTS
    @GetMapping("/posts/index")
    public String postsIndex(Model model) {
        List<Post> posts = new ArrayList<>();
        model.addAttribute("posts", posts);
        posts.add(new Post(
                "Post Title1",
                "Post Body1"));
        posts.add(new Post(
                "Post Title2",
                "Post Body2"));
        return "posts/index";
    }

    //    MAKE SHOW THAT WILL SHOW INDIVIDUAL POSTS
//    WHEN POST IS PICKED FROM VIEW (give href with integer in .html), REDIRECT TO POSTS/SHOW, THEN display post info on .html
    @GetMapping("/posts/show")
    public String postsShow(Model model) {
        model.addAttribute("post1", new Post(
                "Individual Post Title",
                "individual Post Body")
        );
        return "posts/show";
    }
}

