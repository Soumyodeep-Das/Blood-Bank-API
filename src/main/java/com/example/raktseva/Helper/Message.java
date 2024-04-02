package com.example.raktseva.Helper;

public class Message {
    
    private String blood;
    private String type;

    public Message(String blood, String type){
        this.blood = blood;
        this.type = type;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
