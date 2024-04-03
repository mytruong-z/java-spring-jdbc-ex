package com.example.jdbc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Product {
    @Id
    private Long id;
    private String name;
    private String color;

    //@JoinColumn //no create a relationship table
    @OneToMany(mappedBy = "p1")
    private List<Review> reviews;

}
