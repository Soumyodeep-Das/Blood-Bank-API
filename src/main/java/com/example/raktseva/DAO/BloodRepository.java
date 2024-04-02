package com.example.raktseva.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.raktseva.Entity.Blood;

@Repository
public interface BloodRepository extends JpaRepository< Blood, Integer>{
    
}
