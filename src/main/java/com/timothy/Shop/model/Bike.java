package com.timothy.Shop.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public class Bike {

    public UUID id;
    @NotNull
    public String brand;
    @NotNull
    public String type;
    @NotNull
    public String image;
    @NotNull
    public Integer price;
    @NotNull
    public String name;
    @NotNull
    public String description;
    @NotNull
    public String date;


    public Bike(UUID id, String brand, String type, String image, Integer price, String name, String description, String date) {

        String pattern = "dd-MM-yyyy";
        String dateInString = new SimpleDateFormat(pattern).format(new Date());

        this.id = id;
        this.brand = brand;
        this.type = type;
        this.image = image;
        this.price = price;
        this.name = name;
        this.description = description;
        this.date = dateInString;
    }





}
