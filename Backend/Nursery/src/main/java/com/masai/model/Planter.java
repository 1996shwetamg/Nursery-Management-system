package com.masai.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Planter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer planterId;

    @NotNull(message =  "planter hight is mandatory")
    @Min(value=1 , message = "Planter height should not be less than 1")
    private Double planterHeight;

    @NotNull(message =  "planter capcity is mandatory")
    @Min(value=1 , message = "Planter capacity should not be less than 1")
    private Double planterCapacity;

    @Min(value=1 , message = "Drainage holes should not be less than1")
    private Integer drainageHoles;

    @NotBlank(message = "blank space is not allowed must have character")
    @NotEmpty(message = "empty string is not allowed")
    @Size(min=3, max = 12, message="planter color must contain 3 to 12 characters")
    private String planterColor;

    @NotBlank(message = "blank space is not allowed must have character")
    @NotEmpty(message = "empty string is not allowed")
    @Size(min=3, max = 12, message="planter shape must contain 3 to 12 characters")
    private String planterShape;

    @Min(value=0 , message = "Planter stock should not be negative less than 0")
    private Integer planterStock;

    @Min(value=1 , message = "Planter cost should not be less than 1")
    private Double planterCost;


    private List<Plant> plants;
//    private List<Seed> seeds;

}