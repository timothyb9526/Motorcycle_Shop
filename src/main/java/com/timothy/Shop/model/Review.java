package com.timothy.Shop.model;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Data
@RequiredArgsConstructor

public class Review {

    public UUID id;
    @NotNull
    public String name;
    @NotNull
    public String date;
    @NotNull
    public String review;
    public float rating;

    public Review(UUID id, String name, String date, float rating, String review) {

        String pattern = "dd-MM-yyyy";
        String dateInString = new SimpleDateFormat(pattern).format(new Date());

        this.id = id;
        this.name = name;
        this.review = review;
        this.rating = rating;
        this.date = date;

    }
}
