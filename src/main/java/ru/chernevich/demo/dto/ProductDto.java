package ru.chernevich.demo.dto;

import lombok.Data;

@Data
public class ProductDto {

    private String name;
    private Short amount;
    private  Long categoryId;

}
