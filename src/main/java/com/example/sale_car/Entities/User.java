package com.example.sale_car.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class User  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String username;
    private String lastname;
    private String age;
    private String password;
    private String email;
    private String number;



    @OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
    private Set<Car> cars;


    public User(String username, String lastname, String age, String password, String email, String number) {
        this.username = username;
        this.lastname = lastname;
        this.age = age;
        this.password = password;
        this.email = email;
        this.number = number;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", cars=" + cars +
                '}';
    }
}
