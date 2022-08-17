package com.example.sale_car.Service.Impl;

import com.example.sale_car.Dao.DaoCar;
import com.example.sale_car.Entities.Car;
import com.example.sale_car.Service.ServiceCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceCarImpl implements ServiceCar {


    private DaoCar daoCar;
    @Autowired
    public ServiceCarImpl(DaoCar daoCar) {
        this.daoCar = daoCar;
    }

    @Override
    public Optional<Car> getById(int id) {
        Optional<Car> byId = daoCar.findById(id);
        return byId;
    }

    @Override
    public List<Car> getAll() {
        List<Car> all = daoCar.findAll();
        return all;
    }

    @Override
    public void deleteById(int id) {
        daoCar.deleteById(id);
    }

    @Override
    public Car insertToDB(Car car) {
        Car save = daoCar.save(car);
        return save;
    }
}
