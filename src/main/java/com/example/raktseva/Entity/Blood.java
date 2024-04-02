package com.example.raktseva.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "BLOOD")
public class Blood {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer blood_id;
    private String blood_group;
    private String blood_amount;
    private String blood_donation_date;
    private String blood_expire_date;
    private String blood_price;

    @ManyToOne
    @JoinColumn(name = "blood_bank_id") 
    private BloodBank bloodBank;


    public BloodBank getBloodBank() {
        return bloodBank;
    }

    public void setBloodBank(BloodBank bloodBank) {
        this.bloodBank = bloodBank;
    }

    public Blood() {
    }

    public Integer getBlood_id() {
        return blood_id;
    }

    public void setBlood_id(Integer blood_id) {
        this.blood_id = blood_id;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public String getBlood_amount() {
        return blood_amount;
    }

    public void setBlood_amount(String blood_amount) {
        this.blood_amount = blood_amount;
    }

    public String getBlood_donation_date() {
        return blood_donation_date;
    }

    public void setBlood_donation_date(String blood_donation_date) {
        this.blood_donation_date = blood_donation_date;
    }

    public String getBlood_expire_date() {
        return blood_expire_date;
    }

    public void setBlood_expire_date(String blood_expire_date) {
        this.blood_expire_date = blood_expire_date;
    }

    public String getBlood_price() {
        return blood_price;
    }

    public void setBlood_price(String blood_price) {
        this.blood_price = blood_price;
    }



    
}
