package com.example.jdbc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Review {
    @Id
    private Long id;

    private String comment;
    private int rating;

    @ManyToOne
    private Product p1;
}
