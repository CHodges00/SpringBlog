package com.codeup.SpringBlog;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    public String welcome() {
        return "roll-dice";
    }

    @PostMapping("/roll-dice")
    public String diceNumber(@RequestParam(name = "numberGuess") String numberGuess, Model model) {
        model.addAttribute("numberGuess", "You guessed " + numberGuess + "!");
        return "roll-dice";
    }

}
