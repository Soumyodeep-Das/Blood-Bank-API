package com.example.raktseva.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Represents a blood entity.
 */
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

    /**
     * Gets the blood bank associated with the blood.
     * 
     * @return The blood bank associated with the blood.
     */
    public BloodBank getBloodBank() {
        return bloodBank;
    }

    /**
     * Sets the blood bank associated with the blood.
     * 
     * @param bloodBank The blood bank to be associated with the blood.
     */
    public void setBloodBank(BloodBank bloodBank) {
        this.bloodBank = bloodBank;
    }

    /**
     * Default constructor for the Blood class.
     */
    public Blood() {
    }

    /**
     * Gets the blood ID.
     * 
     * @return The blood ID.
     */
    public Integer getBlood_id() {
        return blood_id;
    }

    /**
     * Sets the blood ID.
     * 
     * @param blood_id The blood ID to be set.
     */
    public void setBlood_id(Integer blood_id) {
        this.blood_id = blood_id;
    }

    /**
     * Gets the blood group.
     * 
     * @return The blood group.
     */
    public String getBlood_group() {
        return blood_group;
    }

    /**
     * Sets the blood group.
     * 
     * @param blood_group The blood group to be set.
     */
    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    /**
     * Gets the blood amount.
     * 
     * @return The blood amount.
     */
    public String getBlood_amount() {
        return blood_amount;
    }

    /**
     * Sets the blood amount.
     * 
     * @param blood_amount The blood amount to be set.
     */
    public void setBlood_amount(String blood_amount) {
        this.blood_amount = blood_amount;
    }

    /**
     * Gets the blood donation date.
     * 
     * @return The blood donation date.
     */
    public String getBlood_donation_date() {
        return blood_donation_date;
    }

    /**
     * Sets the blood donation date.
     * 
     * @param blood_donation_date The blood donation date to be set.
     */
    public void setBlood_donation_date(String blood_donation_date) {
        this.blood_donation_date = blood_donation_date;
    }

    /**
     * Gets the blood expire date.
     * 
     * @return The blood expire date.
     */
    public String getBlood_expire_date() {
        return blood_expire_date;
    }

    /**
     * Sets the blood expire date.
     * 
     * @param blood_expire_date The blood expire date to be set.
     */
    public void setBlood_expire_date(String blood_expire_date) {
        this.blood_expire_date = blood_expire_date;
    }

    /**
     * Gets the blood price.
     * 
     * @return The blood price.
     */
    public String getBlood_price() {
        return blood_price;
    }

    /**
     * Sets the blood price.
     * 
     * @param blood_price The blood price to be set.
     */
    public void setBlood_price(String blood_price) {
        this.blood_price = blood_price;
    }
}
