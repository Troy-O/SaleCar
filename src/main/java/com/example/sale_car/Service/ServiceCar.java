package com.example.sale_car.Service;

import com.example.sale_car.Entities.Car;

import java.util.List;
import java.util.Optional;

public interface ServiceCar {

    Optional<Car> getById(int id);
    List<Car> getAll();
    void deleteById(int id);
    Car insertToDB (Car car);
}
