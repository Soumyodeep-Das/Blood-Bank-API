package com.example.raktseva.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "BLOOD_BANK")
public class BloodBank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bank_id;
    private String bank_name;
    private Boolean bank_login_status;
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be of 10 digits")
    private String bank_contact_no;
    @Email(regexp = "^[0-9a-zA-Z._-]+@[0-9a-zA-Z._-]+\\.[a-zA-Z._-]{2,}$", message = "Must be a well-formed email address")
    private String bank_email;
    @Column(unique = true)
    private String bank_license;
    private String bank_password;
    private String bank_image;
    private String bank_address;
    private String bank_city;
    private String bank_district;
    private String bank_state;
    private String bank_country;
    private String bank_associatedWith; // Hospital Name

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "bloodBank") // Fetch Lazy
    private List<Blood> blood = new ArrayList<>();
    
    public BloodBank() {
    }
    public Integer getBank_id() {
        return bank_id;
    }
    public void setBank_id(Integer bank_id) {
        this.bank_id = bank_id;
    }
    public String getBank_name() {
        return bank_name;
    }
    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }
    public String getBank_contact_no() {
        return bank_contact_no;
    }
    public void setBank_contact_no(String bank_contact_no) {
        this.bank_contact_no = bank_contact_no;
    }
    public String getBank_email() {
        return bank_email;
    }
    public void setBank_email(String bank_email) {
        this.bank_email = bank_email;
    }
    public String getBank_license() {
        return bank_license;
    }
    public void setBank_license(String bank_license) {
        this.bank_license = bank_license;
    }
    public String getBank_address() {
        return bank_address;
    }
    public void setBank_address(String bank_address) {
        this.bank_address = bank_address;
    }
    public String getBank_city() {
        return bank_city;
    }
    public void setBank_city(String bank_city) {
        this.bank_city = bank_city;
    }
    public String getBank_district() {
        return bank_district;
    }
    public void setBank_district(String bank_district) {
        this.bank_district = bank_district;
    }
    public String getBank_state() {
        return bank_state;
    }
    public void setBank_state(String bank_state) {
        this.bank_state = bank_state;
    }
    public String getBank_country() {
        return bank_country;
    }
    public void setBank_country(String bank_country) {
        this.bank_country = bank_country;
    }
    public String getBank_associatedWith() {
        return bank_associatedWith;
    }
    public void setBank_associatedWith(String bank_associatedWith) {
        this.bank_associatedWith = bank_associatedWith;
    }
    public String getBank_password() {
        return bank_password;
    }
    public void setBank_password(String bank_password) {
        this.bank_password = bank_password;
    }
    public Boolean getBank_login_status() {
        return bank_login_status;
    }
    public void setBank_login_status(Boolean bank_login_status) {
        this.bank_login_status = bank_login_status;
    }
    public String getBank_image() {
        return bank_image;
    }
    public void setBank_image(String bank_image) {
        this.bank_image = bank_image;
    }
    @Override
    public String toString() {
        return "BloodBank [bank_id=" + bank_id + ", bank_name=" + bank_name + ", bank_login_status=" + bank_login_status
                + ", bank_contact_no=" + bank_contact_no + ", bank_email=" + bank_email + ", bank_license="
                + bank_license + ", bank_password=" + bank_password + ", bank_image=" + bank_image + ", bank_address="
                + bank_address + ", bank_city=" + bank_city + ", bank_district=" + bank_district + ", bank_state="
                + bank_state + ", bank_country=" + bank_country + ", bank_associatedWith=" + bank_associatedWith + "]";
    }
    
}
