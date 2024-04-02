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
import org.springframework.web.bind.annotation.RestController;

import com.example.raktseva.DAO.BloodBankRepository;
import com.example.raktseva.Entity.BloodBank;
import com.example.raktseva.Services.BloodBankService;


@RestController
public class HomeController {

    @Autowired
    public BloodBankRepository bloodBankRepository;

    @Autowired
    private BloodBankService bloodBankService;
    
    // @GetMapping("/show-banks")
    // public String homePageHandler(){
    //     BloodBank bloodBank = this.bloodBankRepository.findAll();
    //     return bloodBank.toString();
    // }

    // @GetMapping("/show-banks")
    // public List<BloodBank> showBanks() {
    //     return bloodBankRepository.findAll();
    // }

    // register
    @PostMapping
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<BloodBank> addBloodBank(@RequestBody BloodBank bloodBank){
        BloodBank bank = this.bloodBankService.addBloodBank(bloodBank);
        return new ResponseEntity<>(bank, HttpStatus.CREATED);
    }
    // update
    @PutMapping("/{bank_id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<BloodBank> updateBloodBank(@RequestBody BloodBank bloodBank, @PathVariable int bank_id){
        BloodBank bank = this.bloodBankService.updateBloodBank(bloodBank, bank_id);
        return new ResponseEntity<>(bank, HttpStatus.OK);
    }

    // delete
    @DeleteMapping("/{bank_id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<Map<String, String>> deleteBloodBank(@PathVariable int bank_id){
        this.bloodBankService.deleteBloodBank(bank_id);
        Map<String, String> message = Map.of("Message", "Deleted Successfully");
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    // get single bank

    @GetMapping("/{bank_id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<BloodBank> getBloodBank(@PathVariable int bank_id){
        BloodBank bank = this.bloodBankService.getBloodBankById(bank_id);
        return new ResponseEntity<>(bank, HttpStatus.OK);
    }
    // get all banks

    @GetMapping()
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<List<BloodBank>> getAllBloodBank(){
        List<BloodBank> all = this.bloodBankService.getAllBloodBanks();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }
    
}
