package com.example.raktseva.Controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.raktseva.DAO.BloodRepository;
import com.example.raktseva.Entity.Blood;
import com.example.raktseva.Services.BloodService;

/**
 * The BankController class handles the HTTP requests related to blood bank
 * operations.
 * It provides endpoints for registering, updating, deleting, and retrieving
 * blood information.
 */
@RestController
@RequestMapping("/bank")
public class BankController {

    @Autowired
    public BloodRepository bloodRepository;

    @Autowired
    private BloodService bloodService;


    // get single bank

    /**
     * Retrieves the blood information for the given blood ID.
     *
     * @param blood_id the ID of the blood to retrieve
     * @return the ResponseEntity containing the blood information
     */
    @GetMapping("/id/{blood_id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<Blood> getBlood(@PathVariable int blood_id) {
        Blood blood = this.bloodService.getBloodById(blood_id);
        return new ResponseEntity<>(blood, HttpStatus.OK);
    }


    // get all banks

    /**
     * Retrieves all the blood records from the blood bank.
     *
     * @return ResponseEntity<List<Blood>> containing the list of all blood records
     */
    @GetMapping()
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<List<Blood>> getAllBlood() {
        List<Blood> all = this.bloodService.getAllBloods();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }


    // search by blood group
    /**
     * Retrieves a list of blood donations based on the specified blood group.
     *
     * @param blood_group the blood group to search for
     * @return a ResponseEntity containing the list of blood donations
     */
    @GetMapping("/group/{blood_group}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<List<Blood>> searchByBloodGroup(@PathVariable String blood_group) {
        List<Blood> all = this.bloodService.searchByBloodGroup(blood_group);
        return new ResponseEntity<>(all, HttpStatus.OK);
    }


    // register
    /**
     * Adds a new blood record to the blood bank.
     *
     * @param blood The Blood object containing the details of the blood record to
     *              be added.
     * @return A ResponseEntity containing the newly added Blood object and the HTTP
     *         status code.
     */
    @PostMapping
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<Blood> addBlood(@RequestBody Blood blood) {
        Blood new_blood = this.bloodService.addBlood(blood);
        return new ResponseEntity<>(new_blood, HttpStatus.CREATED);
    }


    // update
    /**
     * Updates the information of a specific blood record.
     *
     * @param blood    The updated Blood object containing the new information.
     * @param blood_id The ID of the blood record to be updated.
     * @return ResponseEntity containing the updated Blood object and the HTTP
     *         status code.
     */
    @PutMapping("/{blood_id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<Blood> updateBlood(@RequestBody Blood blood, @PathVariable int blood_id) {
        Blood updated_blood = this.bloodService.updateBlood(blood, blood_id);
        return new ResponseEntity<>(updated_blood, HttpStatus.OK);
    }
    

    // delete
    /**
     * Deletes a blood entry from the blood bank.
     *
     * @param blood_id the ID of the blood entry to be deleted
     * @return a ResponseEntity containing a map with a success message
     */
    @DeleteMapping("/{blood_id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<Map<String, String>> deleteBlood(@PathVariable int blood_id) {
        this.bloodService.deleteBlood(blood_id);
        Map<String, String> message = Map.of("Message", "Deleted Successfully");
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}
