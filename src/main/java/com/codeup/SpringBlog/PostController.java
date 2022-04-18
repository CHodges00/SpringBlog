package com.codeup.SpringBlog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @RequestMapping(path = "/posts", method = RequestMethod.GET)
    @ResponseBody
    public String postsIndex() {
        return "Posts index page";
    }

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String individualPost() {
        return "View individual post";
    }


    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String viewForm() {
        return "View form for creating post";
    }


    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String createPost(){return "Create new post";}
    {

    }
}
