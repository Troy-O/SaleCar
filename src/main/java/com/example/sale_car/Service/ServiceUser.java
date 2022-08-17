package com.example.sale_car.Service;

import com.example.sale_car.Entities.Car;
import com.example.sale_car.Entities.User;

import java.util.List;
import java.util.Optional;

public interface ServiceUser {
    Optional<User> getById(int id);
    List<User> getAll();
    void deleteById(int id);
    User insertToDB (User user);
}
