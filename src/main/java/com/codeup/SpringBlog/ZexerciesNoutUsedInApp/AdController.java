package com.codeup.SpringBlog.ZexerciesNoutUsedInApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AdController {
    private final AdRepository adDao;

    public AdController(AdRepository adDao){
        this.adDao = adDao;
    }

    @GetMapping("/ad")
    public String getAd(Model model){
        model.addAttribute("ads", adDao.findAll());
        return "ads/adPage";
    }

    @GetMapping("/ad/{search}")
    public String getIndividual(@PathVariable String search,  Model model){
        model.addAttribute("search", search);
        model.addAttribute("ad", adDao.findByTitle(search));
        return "ads/each";
    }





}
