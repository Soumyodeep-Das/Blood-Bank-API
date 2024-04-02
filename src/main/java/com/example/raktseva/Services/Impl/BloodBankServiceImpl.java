package com.example.raktseva.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.raktseva.DAO.BloodBankRepository;
import com.example.raktseva.Entity.BloodBank;
import com.example.raktseva.Services.BloodBankService;

@Service
public class BloodBankServiceImpl implements BloodBankService{

    @Autowired 
    private BloodBankRepository bloodBankRepository;
    
   
    public BloodBankServiceImpl(BloodBankRepository bloodBankRepository) {
        this.bloodBankRepository = bloodBankRepository;
    }

    @Override
    public BloodBank addBloodBank(BloodBank bloodBank) {
        return this.bloodBankRepository.save(bloodBank);
    }

    @Override
    public BloodBank updateBloodBank(BloodBank bloodBank, Integer bank_id) {
        BloodBank bank = this.bloodBankRepository.findById(bank_id).orElseThrow(()->new RuntimeException("Blood Bank not found"));
        bank.setBank_name(bloodBank.getBank_name());
        bank.setBank_address(bloodBank.getBank_address());
        bank.setBank_contact_no(bloodBank.getBank_contact_no());
        bank.setBank_email(bloodBank.getBank_email());
        bank.setBank_license(bloodBank.getBank_license());
        bank.setBank_city(bloodBank.getBank_city());
        bank.setBank_district(bloodBank.getBank_district());
        bank.setBank_state(bloodBank.getBank_state());
        bank.setBank_country(bloodBank.getBank_country());
        return this.bloodBankRepository.save(bank);
    }

    @Override
    public void deleteBloodBank(Integer bank_id) {
        BloodBank bank = this.bloodBankRepository.findById(bank_id).orElseThrow(()->new RuntimeException("Blood Bank not found"));
        this.bloodBankRepository.delete(bank);
    }

    @Override
    public BloodBank getBloodBankById(Integer bank_id) {
        BloodBank bank = this.bloodBankRepository.findById(bank_id).orElseThrow(()->new RuntimeException("Blood Bank not found"));
        return bank;
    }

    @Override
    public List<BloodBank> getAllBloodBanks() {
        
        return this.bloodBankRepository.findAll();
    }
    
}
