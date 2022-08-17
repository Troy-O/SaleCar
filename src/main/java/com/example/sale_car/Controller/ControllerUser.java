package com.example.sale_car.Controller;

import com.example.sale_car.Entities.User;
import com.example.sale_car.Service.Impl.ServiceUserImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
@Slf4j
public class ControllerUser {

    private ServiceUserImpl serviceUser;
    @Autowired
    public ControllerUser(ServiceUserImpl serviceUser) {
        this.serviceUser = serviceUser;
    }



    @GetMapping("/getLogin")
    public String getlogin(){
        return "Login.html";
    }

    @GetMapping("/createUser")
    public String create(){
        return "Registration.html";

    }

    @PostMapping("/insert")
    public String insert(Model model, @RequestParam ("firstname") String firstname,
                       @RequestParam ("lastname") String lastname,
                       @RequestParam ("password") String password,
                       @RequestParam ("email") String email,
                       @RequestParam ("number") String number,
                       @RequestParam ("age") String age){
        User user=new User();
        user.setUsername(firstname);
        user.setLastname(lastname);
        user.setEmail(email);
        user.setPassword(password);
        user.setNumber(number);
        user.setAge(age);
        User toDB = serviceUser.insertToDB(user);
        return "Login.html";

    }



}
