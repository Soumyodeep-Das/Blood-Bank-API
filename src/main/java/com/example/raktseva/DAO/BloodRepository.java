package com.example.raktseva.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.raktseva.Entity.Blood;

/**
 * This interface represents a repository for managing Blood entities.
 * It extends the JpaRepository interface, providing CRUD operations for Blood entities.
 */
@Repository
public interface BloodRepository extends JpaRepository<Blood, Integer> {
    
    /**
     * Retrieves a list of Blood entities with the specified blood group.
     *
     * @param bloodGroup the blood group to search for
     * @return a list of Blood entities with the specified blood group
     */
    @Query("SELECT b FROM Blood b WHERE b.blood_group = :bloodGroup")
    List<Blood> findByBloodGroup(String bloodGroup);
}
