package com.example.raktseva.DAO;

import java.util.List;

// import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.raktseva.Entity.BloodBank;
/**
 * This interface represents the repository for managing BloodBank entities.
 * It extends the JpaRepository interface to inherit basic CRUD operations.
 */
@Repository
public interface BloodBankRepository extends JpaRepository<BloodBank, Integer> {

    // @Query("SELECT * FROM blood_bank")
    // public BloodBank getAllBank();

    /**
     * Retrieves all the blood banks.
     *
     * @return a list of all blood banks
     */
    List<BloodBank> findAll();
}
