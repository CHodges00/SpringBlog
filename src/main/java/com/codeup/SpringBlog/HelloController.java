package com.codeup.SpringBlog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

//    ON VISIT TO /HELLO = RUN STRING HELL()
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello from Spring!";
    }


//    GET FROM RESPONSE NAME AND AGE AND INPUT INTO METHOD  LOCALHOST:8080/HELLO/CODY/AND/27 WILL RUN METHOD
    @RequestMapping(path = "/hello/{name}/and/{age}", method = RequestMethod.GET)
    @ResponseBody
    public String helloNameAge(@PathVariable String name, @PathVariable int age){
        return "Name: " + name + ", Age: " + age;
    }

//  GET FROM RESPONSE NUMBER NAD RUN METHOD WITH THAT NUMBER AS PARAMETER // NUMBER + 1 = ?
    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus one is " + (number + 1) + "!";
    }






}
