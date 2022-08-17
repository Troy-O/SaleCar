package com.example.sale_car.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String model;
    private String name_model;
    private int age;
    private String description;
    private double cost;



    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private User user;

    public Car(String model, String name_model, int age, String description, double cost) {
        this.model = model;
        this.name_model = name_model;
        this.age = age;
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", name_model='" + name_model + '\'' +
                ", age=" + age +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }
}
