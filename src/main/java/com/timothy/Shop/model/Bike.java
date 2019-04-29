package com.timothy.Shop.model;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import javax.validation.constraints.NotNull;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
    @NotNull
    public String year;
    @NotNull
    public String city;
    @NotNull
    public String state;
    @NotNull
    public String color;
    @NotNull
    public Integer mileage;
    @NotNull
    public String condition;
    @NotNull
    public String email;
    @NotNull
    public String phone;
    public Bike(UUID id, String brand, String type, String image, Integer price, String name, String description, String email, String phone, String date, String year, String city, String state, String color, int mileage, String condition) {
        String number = phone.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
        this.id = id;
        this.brand = brand.toLowerCase();
        this.type = type;
        this.image = image;
        this.price = price;
        this.name = name;
        this.description = description;
        this.email = email;
        this.phone = number;
        this.date = date;
        this.year = year;
        this.city = city;
        this.state = state;
        this.color = color;
        this.mileage = mileage;
        this.condition = condition;
    }
}
