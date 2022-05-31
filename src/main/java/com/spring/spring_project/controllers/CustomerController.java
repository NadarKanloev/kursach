package com.spring.spring_project.controllers;

import com.spring.spring_project.models.Customer;
import com.spring.spring_project.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/zayavka")
    public String Zayavka(Model model){return "zayavka";}
    @PostMapping("/zayavka")
    public String PostZayavka(@RequestParam String full_name, @RequestParam String number,@RequestParam String email, @RequestParam String section, Model model){

        Customer customer = new Customer(full_name, number, email, section);
        customerRepository.save(customer);
        return "Spasibo";
    }
}
