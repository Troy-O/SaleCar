package com.example.sale_car.Dao;

import com.example.sale_car.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoUser extends JpaRepository<User,Integer> {
}
