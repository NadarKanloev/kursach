package com.spring.spring_project.controllers;

import com.spring.spring_project.models.Trenera;
import com.spring.spring_project.repo.TreneraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InstructorController {
    @Autowired
    private TreneraRepository treneraRepository;

    @GetMapping("/trenera")
    public String TrenMain(Model model){
        Iterable<Trenera> trenera = treneraRepository.findAll();
        model.addAttribute("trenera", trenera);
        return "trenera";
    }
    @GetMapping("/addTrener")
    public String addTrener(Model model){
        return "addTrener";
    }
    @PostMapping("/addTrener")
    public String PostTrener(@RequestParam String name, @RequestParam String program, @RequestParam String imgsrc,  Model model){
        Trenera trenera = new Trenera(name, program, imgsrc);
        treneraRepository.save(trenera);
        return "trenera";
    }

}
