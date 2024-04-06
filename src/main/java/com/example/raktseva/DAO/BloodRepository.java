package com.example.raktseva.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.raktseva.Entity.Blood;

@Repository
public interface BloodRepository extends JpaRepository< Blood, Integer>{
    
    @Query("SELECT b FROM Blood b WHERE b.blood_group = :bloodGroup")
    List<Blood> findByBloodGroup(String bloodGroup);
}
