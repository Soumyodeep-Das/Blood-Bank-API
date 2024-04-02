package com.example.raktseva.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.raktseva.DAO.BloodRepository;
import com.example.raktseva.Entity.Blood;
import com.example.raktseva.Services.BloodService;

@Service
public class BloodServiceImpl implements BloodService {

    @Autowired
    private BloodRepository bloodRepository;

    public BloodServiceImpl(BloodRepository bloodRepository) {
        this.bloodRepository = bloodRepository;
    }

    @Override
    public Blood addBlood(Blood blood) {
        return this.bloodRepository.save(blood);
    }

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

    @Override
    public void deleteBlood(Integer blood_id) {
        Blood blood = this.bloodRepository.findById(blood_id).orElseThrow(() -> new RuntimeException("Blood not found"));
        this.bloodRepository.delete(blood);
    }

    @Override
    public Blood getBloodById(Integer blood_id) {
        Blood blood = this.bloodRepository.findById(blood_id).orElseThrow(() -> new RuntimeException("Blood not found"));
        return blood;
    }

    @Override
    public List<Blood> getAllBloods() {
        return this.bloodRepository.findAll();
    }

}
