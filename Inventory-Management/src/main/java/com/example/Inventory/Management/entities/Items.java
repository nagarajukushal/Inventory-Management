package com.example.Inventory.Management.entities;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;

@Data
@Entity
@Table(name ="items")
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String itemName;
    private String description;
    private Double price;
    private int quantity;

}
