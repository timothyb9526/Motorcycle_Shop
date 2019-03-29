package com.timothy.Shop.controllers;

import com.timothy.Shop.model.Bike;
import com.timothy.Shop.repository.PostgresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class landingController {

    PostgresRepository repository;

    @Autowired
    public landingController(PostgresRepository repo){
        repository = repo;

    }

    @GetMapping("/")
    public String index() {
        return "landing";
    }

    @GetMapping("/BikeForSale")
    public String bikeForSale() {
        return "newBike";
    }

    @GetMapping("/inventory")
    public String inventory(Model model) {
        model.addAttribute("bikes", repository.findAll());
        return "inventory";
    }

    @PostMapping("/inventory")
    public String inventoryPost(Bike bike, Model model) {
        repository.save(bike);
        model.addAttribute("bikes", repository.findAll());
        return "inventory";
    }


}
