package com.example.raktseva.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.raktseva.DAO.BloodRepository;
import com.example.raktseva.Entity.Blood;
import com.example.raktseva.Services.BloodService;

/**
 * This class implements the BloodService interface and provides the implementation
 * for the methods defined in the interface.
 */
@Service
public class BloodServiceImpl implements BloodService {

    @Autowired
    private BloodRepository bloodRepository;

    /**
     * Constructs a new BloodServiceImpl object with the specified BloodRepository.
     *
     * @param bloodRepository the BloodRepository to be used for data access
     */
    public BloodServiceImpl(BloodRepository bloodRepository) {
        this.bloodRepository = bloodRepository;
    }

    /**
     * Adds a new Blood object to the database.
     *
     * @param blood the Blood object to be added
     * @return the added Blood object
     */
    @Override
    public Blood addBlood(Blood blood) {
        return this.bloodRepository.save(blood);
    }

    /**
     * Updates the details of a Blood object in the database.
     *
     * @param updated_blood the updated Blood object
     * @param blood_id the ID of the Blood object to be updated
     * @return the updated Blood object
     * @throws RuntimeException if the Blood object with the specified ID is not found
     */
    @Override
    public Blood updateBlood(Blood updated_blood, Integer blood_id) {
        Blood blood = this.bloodRepository.findById(blood_id).orElseThrow(() -> new RuntimeException("Blood not found"));
        blood.setBlood_group(updated_blood.getBlood_group());
        blood.setBlood_amount(updated_blood.getBlood_amount());
        blood.setBlood_donation_date(updated_blood.getBlood_donation_date());
        blood.setBlood_expire_date(updated_blood.getBlood_expire_date());
        blood.setBlood_price(updated_blood.getBlood_price());

        return this.bloodRepository.save(blood);
    }

    /**
     * Deletes a Blood object from the database.
     *
     * @param blood_id the ID of the Blood object to be deleted
     * @throws RuntimeException if the Blood object with the specified ID is not found
     */
    @Override
    public void deleteBlood(Integer blood_id) {
        Blood blood = this.bloodRepository.findById(blood_id).orElseThrow(() -> new RuntimeException("Blood not found"));
        this.bloodRepository.delete(blood);
    }

    /**
     * Retrieves a Blood object from the database based on the specified ID.
     *
     * @param blood_id the ID of the Blood object to be retrieved
     * @return the retrieved Blood object
     * @throws RuntimeException if the Blood object with the specified ID is not found
     */
    @Override
    public Blood getBloodById(Integer blood_id) {
        Blood blood = this.bloodRepository.findById(blood_id).orElseThrow(() -> new RuntimeException("Blood not found"));
        return blood;
    }

    /**
     * Retrieves all Blood objects from the database.
     *
     * @return a list of all Blood objects
     */
    @Override
    public List<Blood> getAllBloods() {
        return this.bloodRepository.findAll();
    }

    /**
     * Searches for Blood objects in the database based on the specified blood group.
     *
     * @param blood_group the blood group to search for
     * @return a list of Blood objects matching the specified blood group
     */
    @Override
    public List<Blood> searchByBloodGroup(String blood_group) {
        return this.bloodRepository.findByBloodGroup(blood_group);
    }

}
