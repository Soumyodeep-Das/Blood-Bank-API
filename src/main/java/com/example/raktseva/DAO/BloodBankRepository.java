package com.example.raktseva.DAO;

import java.util.List;

// import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.raktseva.Entity.BloodBank;

@Repository
public interface BloodBankRepository extends JpaRepository<BloodBank, Integer> {

    // @Query("SELECT * FROM blood_bank")
    // public BloodBank getAllBank();

    List<BloodBank> findAll();
}
