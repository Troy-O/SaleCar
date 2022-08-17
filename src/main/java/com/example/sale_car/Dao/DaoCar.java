package com.example.sale_car.Dao;

import com.example.sale_car.Entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoCar extends JpaRepository<Car, Integer> {


}
