package com.example.sale_car.Service.Impl;

import com.example.sale_car.Dao.DaoUser;
import com.example.sale_car.Entities.User;
import com.example.sale_car.Service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceUserImpl implements ServiceUser {


    private DaoUser daoUser;
    @Autowired
    public ServiceUserImpl(DaoUser daoUser) {
        this.daoUser = daoUser;
    }




    @Override
    public Optional<User> getById(int id) {
        Optional<User> byId = daoUser.findById(id);
        return byId;
    }

    @Override
    public List<User> getAll() {
        List<User> all = daoUser.findAll();
        return all;
    }

    @Override
    public void deleteById(int id) {
        daoUser.deleteById(id);
    }

    @Override
    public User insertToDB(User user) {
        User save = daoUser.save(user);
        return save;
    }
}
