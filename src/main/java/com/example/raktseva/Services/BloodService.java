package com.example.raktseva.Services;

import java.util.List;

import com.example.raktseva.Entity.Blood;

public interface BloodService {
    Blood addBlood(Blood blood);
    Blood updateBlood(Blood blood, Integer blood_id);
    void deleteBlood(Integer blood_id);
    Blood getBloodById(Integer blood_id);
    List<Blood> getAllBloods();
    List<Blood> searchByBloodGroup(String blood_group);
}
