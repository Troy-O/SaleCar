package com.example.sale_car.Controller;

import com.example.sale_car.Service.Impl.ServiceCarImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class ControllerCar {


    private ServiceCarImpl serviceCar;
    @Autowired
    public ControllerCar(ServiceCarImpl serviceCar) {
        this.serviceCar = serviceCar;
    }





//    @PostMapping("/save")
//    void insert(@RequestParam ){
//        serviceCar.insertToDB()
//    }



}
