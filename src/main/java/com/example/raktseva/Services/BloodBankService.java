package com.example.raktseva.Services;

import java.util.List;

import com.example.raktseva.Entity.BloodBank;

/**
 * The BloodBankService interface provides methods to manage blood banks.
 */
public interface BloodBankService {
    
    /**
     * Adds a new blood bank.
     *
     * @param bloodBank The BloodBank object representing the new blood bank.
     * @return The BloodBank object representing the added blood bank.
     */
    BloodBank addBloodBank(BloodBank bloodBank);
    
    /**
     * Updates an existing blood bank.
     *
     * @param bloodBank The BloodBank object representing the updated blood bank.
     * @param bank_id The ID of the blood bank to be updated.
     * @return The BloodBank object representing the updated blood bank.
     */
    BloodBank updateBloodBank(BloodBank bloodBank, Integer bank_id);
    
    /**
     * Deletes a blood bank.
     *
     * @param bank_id The ID of the blood bank to be deleted.
     */
    void deleteBloodBank(Integer bank_id);
    
    /**
     * Retrieves a blood bank by its ID.
     *
     * @param bank_id The ID of the blood bank to retrieve.
     * @return The BloodBank object representing the retrieved blood bank.
     */
    BloodBank getBloodBankById(Integer bank_id);
    
    /**
     * Retrieves all blood banks.
     *
     * @return A list of BloodBank objects representing all blood banks.
     */
    List<BloodBank> getAllBloodBanks();
}
