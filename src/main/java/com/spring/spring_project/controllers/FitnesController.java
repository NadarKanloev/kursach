package com.spring.spring_project.controllers;

import com.spring.spring_project.models.Fitnes;
import com.spring.spring_project.repo.FitnesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

@Controller
public class FitnesController {
    @Autowired
    private FitnesRepository fitnesRepository;

    @GetMapping("/fitnes")
    public String FitnesMain(Model model){
        Iterable<Fitnes> fitnes = fitnesRepository.findAll();
        model.addAttribute("fitnes", fitnes);
        return "fitnes";
    }
    @GetMapping("/fitnes/{id}")
    public String fitnesPage(@PathVariable(value="id") long id, Model model){
        Optional<Fitnes> fitnes = fitnesRepository.findById(id);
        ArrayList<Fitnes> fitnesArrayList = new ArrayList<>();
        fitnes.ifPresent(fitnesArrayList::add);
        model.addAttribute("fitnes", fitnesArrayList);
        return "fitnesPage";
    }
}
