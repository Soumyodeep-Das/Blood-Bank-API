package com.example.raktseva.Services;

import java.util.List;

import com.example.raktseva.Entity.Blood;

/**
 * The BloodService interface provides methods to manage blood-related operations.
 */
public interface BloodService {
    
    /**
     * Adds a new blood entry to the system.
     *
     * @param blood The Blood object representing the blood to be added.
     * @return The Blood object that was added.
     */
    Blood addBlood(Blood blood);
    
    /**
     * Updates an existing blood entry in the system.
     *
     * @param blood The Blood object representing the updated blood information.
     * @param blood_id The ID of the blood entry to be updated.
     * @return The Blood object that was updated.
     */
    Blood updateBlood(Blood blood, Integer blood_id);
    
    /**
     * Deletes a blood entry from the system.
     *
     * @param blood_id The ID of the blood entry to be deleted.
     */
    void deleteBlood(Integer blood_id);
    
    /**
     * Retrieves a blood entry by its ID.
     *
     * @param blood_id The ID of the blood entry to retrieve.
     * @return The Blood object with the specified ID, or null if not found.
     */
    Blood getBloodById(Integer blood_id);
    
    /**
     * Retrieves all blood entries in the system.
     *
     * @return A list of all Blood objects in the system.
     */
    List<Blood> getAllBloods();
    
    /**
     * Searches for blood entries by blood group.
     *
     * @param blood_group The blood group to search for.
     * @return A list of Blood objects with the specified blood group.
     */
    List<Blood> searchByBloodGroup(String blood_group);
}
