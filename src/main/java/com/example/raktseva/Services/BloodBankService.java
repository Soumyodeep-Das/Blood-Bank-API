package com.example.raktseva.Services;

import java.util.List;

import com.example.raktseva.Entity.BloodBank;

public interface BloodBankService {
    BloodBank addBloodBank(BloodBank bloodBank);
    BloodBank updateBloodBank(BloodBank bloodBank, Integer bank_id);
    void deleteBloodBank(Integer bank_id);
    BloodBank getBloodBankById(Integer bank_id);
    List<BloodBank> getAllBloodBanks();
}
