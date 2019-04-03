package com.timothy.Shop.controllers;

import com.timothy.Shop.model.Bike;
import com.timothy.Shop.repository.PostgresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

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

    @GetMapping("/newShowcase")
    public String newShowcase(Model model) {
        model.addAttribute("bikes", repository.sortByDate());
        return "newShowcase";
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

    @GetMapping("/inventory/{brand}")
    public String findByBrand(Model model, @PathVariable(value = "brand") String brand) {
        model.addAttribute("bikes", repository.findByBrand(brand));
        return "inventory";
    }

    @GetMapping("/inventory/2/{type}")
    public String findBytype(Model model, @PathVariable(value = "type") String type) {
        model.addAttribute("bikes", repository.findByType(type));
        return "inventory";
    }

    @GetMapping("/Honda")
    public String findHonda(Model model) {
        model.addAttribute("bikes", repository.findByBrand("Honda"));
        return "Honda";
    }

    @GetMapping("/Kawasaki")
    public String findKawasaki(Model model) {
        model.addAttribute("bikes", repository.findByBrand("Kawasaki"));
        return "Kawasaki";
    }
    @GetMapping("/Harley")
    public String findHarley(Model model) {
        model.addAttribute("bikes", repository.findByBrand("Harley"));
        return "Harley";
    }
    @GetMapping("/Yamaha")
    public String findYamaha(Model model) {
        model.addAttribute("bikes", repository.findByBrand("Yamaha"));
        return "Yamaha";
    }

    @GetMapping("/Honda/{type}")
    public String findBybrandType(Model model, @PathVariable(value = "type") String type) {
        model.addAttribute("bikes", repository.findByBrandType("Honda", type));
        return "Honda";
    }
    @GetMapping("/Kawasaki/{type}")
    public String findByKawasakiType(Model model, @PathVariable(value = "type") String type) {
        model.addAttribute("bikes", repository.findByBrandType("Kawasaki", type));
        return "Kawasaki";
    }
    @GetMapping("/Harley/{type}")
    public String findByHarleyType(Model model, @PathVariable(value = "type") String type) {
        model.addAttribute("bikes", repository.findByBrandType("Harley", type));
        return "Harley";
    }
    @GetMapping("/Yamaha/{type}")
    public String findByYamahaType(Model model, @PathVariable(value = "type") String type) {
        model.addAttribute("bikes", repository.findByBrandType("Yamaha", type));
        return "Yamaha";
    }

    @GetMapping("/Honda/2/{price}")
    public String findPriceByHonda(Model model, @PathVariable(value = "price") String price) {
        model.addAttribute("bikes", repository.findByBrandPrice("Honda", price));
        return "Honda";
    }
    @GetMapping("/Kawasaki/2/{price}")
    public String findPriceByKawasaki(Model model, @PathVariable(value = "price") String price) {
        model.addAttribute("bikes", repository.findByBrandPrice("Kawasaki", price));
        return "Kawasaki";
    }@GetMapping("/Harley/2/{price}")
    public String findPriceByHarley(Model model, @PathVariable(value = "price") String price) {
        model.addAttribute("bikes", repository.findByBrandPrice("Harley", price));
        return "Harley";
    }@GetMapping("/Yamaha/2/{price}")
    public String findPriceByYamaha(Model model, @PathVariable(value = "price") String price) {
        model.addAttribute("bikes", repository.findByBrandPrice("Yamaha", price));
        return "Yamaha";
    }

    @GetMapping("/inventory/3/{price}")
    public String findByPrice(Model model, @PathVariable(value = "price") String price) {
        model.addAttribute("bikes", repository.findByPrice(price));
        return "inventory";
    }

}
