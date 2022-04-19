package com.codeup.SpringBlog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {


    //    MAKE INDEX THAT WILL SHOW ALL POSTS
    @GetMapping("/posts")
    public String postsIndex() {

        return "posts/index";
    }

    //    MAKE SHOW THAT WILL SHOW INDIVIDUAL POSTS
//    WHEN POST IS PICKED FROM VIEW (give href with integer in .html), REDIRECT TO POSTS/SHOW, THEN display post info on .html
    @GetMapping( "/posts/{post}")
    public String postsShow(@PathVariable String post, Model model) {
        model.addAttribute("post", post);
        model.addAttribute("post1", new Post(
                "Individual Post Title",
                "individual Post Body")
        );
        return "posts/show";
    }
}


//    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
//    @ResponseBody
//    public String viewForm() {
//        return "View form for creating post";
//    }
//
//
//    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
//    @ResponseBody
//    public String createPost(){return "Create new post";}
//    {

//    }

