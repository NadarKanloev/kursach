package com.spring.spring_project.controllers;

import com.spring.spring_project.models.Edin;
import com.spring.spring_project.repo.EdinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EdinController {
    @Autowired
    private EdinRepository edinRepository;

    @GetMapping("/edin")
    public String edMain(Model model){
        Iterable<Edin> edin = edinRepository.findAll();
        model.addAttribute("edin", edin);
        return "edin";
    }

}
