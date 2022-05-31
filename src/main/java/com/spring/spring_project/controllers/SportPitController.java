package com.spring.spring_project.controllers;

import com.spring.spring_project.models.SportPit;
import com.spring.spring_project.repo.SportPitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class SportPitController {

    @Autowired SportPitRepository sportPitRepository;

    @GetMapping("/sportPit")
    public String sportPit(Model model){
        Iterable<SportPit> sportPit = sportPitRepository.findAll();
        model.addAttribute("sportPit", sportPit);
        return "sportPit";
    }
    @GetMapping("/sportPit/{id}")
    public String sportPitfull(@PathVariable(value="id")long id, Model model){
        Optional<SportPit> sportPit = sportPitRepository.findById(id);
        ArrayList<SportPit> sportPitArrayList = new ArrayList<>();
        sportPit.ifPresent(sportPitArrayList::add);
        model.addAttribute("sportPit", sportPitArrayList);
        return "sportPitPage";
    }
}
