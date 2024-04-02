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

@RestController
@RequestMapping("/bank")
public class BankController {
    
    @Autowired
    public BloodRepository bloodRepository;

    @Autowired
    private BloodService bloodService;

        // register
    @PostMapping
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<Blood> addBlood(@RequestBody Blood blood){
        Blood new_blood = this.bloodService.addBlood(blood);
        return new ResponseEntity<>(new_blood, HttpStatus.CREATED);
    }
    // update
    @PutMapping("/{blood_id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<Blood> updateBlood(@RequestBody Blood blood, @PathVariable int blood_id){
        Blood updated_blood = this.bloodService.updateBlood(blood, blood_id);
        return new ResponseEntity<>(updated_blood, HttpStatus.OK);
    }

    // delete
    @DeleteMapping("/{blood_id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<Map<String, String>> deleteBlood(@PathVariable int blood_id){
        this.bloodService.deleteBlood(blood_id);
        Map<String, String> message = Map.of("Message", "Deleted Successfully");
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    // get single bank

    @GetMapping("/{blood_id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<Blood> getBlood(@PathVariable int blood_id){
        Blood blood = this.bloodService.getBloodById(blood_id);
        return new ResponseEntity<>(blood, HttpStatus.OK);
    }
    // get all banks

    @GetMapping()
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<List<Blood>> getAllBlood(){
        List<Blood> all = this.bloodService.getAllBloods();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }
}
