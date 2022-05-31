package com.spring.spring_project.controllers;

import com.spring.spring_project.models.Trenera;
import com.spring.spring_project.repo.TreneraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

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
    public String PostTrener(@RequestParam String name, @RequestParam String program, @RequestParam String imgsrc, @RequestParam String description,  Model model){
        Trenera trenera = new Trenera(name, program, imgsrc, description);
        treneraRepository.save(trenera);
        return "index";
    }
    @GetMapping("/trenera/{id}")
    public String TrenerFull(@PathVariable(value = "id") long id, Model model){
        Optional<Trenera> trenera = treneraRepository.findById(id);
        ArrayList<Trenera> treneraArrayList = new ArrayList<>();
        trenera.ifPresent(treneraArrayList::add);
        model.addAttribute("trenera", treneraArrayList);
        return "Trener";
    }
}
