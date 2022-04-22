package com.codeup.SpringBlog.ZexerciesNoutUsedInApp;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    public String landing() {
        return "roll-dice";
    }


    @GetMapping("/roll-dice/{pick}")
    public String rollDice(@PathVariable Integer pick, Model model) {
        model.addAttribute("pick", pick);
        model.addAttribute("random", (int)(Math.random()*((6-1)+1))+1);
        return "roll-dice";
    }










}
