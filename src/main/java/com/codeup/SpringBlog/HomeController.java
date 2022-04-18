package com.codeup.SpringBlog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    //    ON VISIT TO /landing = RUN METHOD LANDING()
    @GetMapping("/landing")
    @ResponseBody
    public String landing(){
        return "This is the landing page!";
    }





}
