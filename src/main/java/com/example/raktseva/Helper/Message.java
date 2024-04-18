package com.example.raktseva.Helper;

/**
 * The Message class represents a message containing information about blood and its type.
 */
public class Message {
    
    private String blood;
    private String type;

    /**
     * Constructs a Message object with the specified blood and type.
     * 
     * @param blood the blood information
     * @param type the type of blood
     */
    public Message(String blood, String type){
        this.blood = blood;
        this.type = type;
    }

    /**
     * Returns the blood information.
     * 
     * @return the blood information
     */
    public String getBlood() {
        return blood;
    }

    /**
     * Sets the blood information.
     * 
     * @param blood the blood information to set
     */
    public void setBlood(String blood) {
        this.blood = blood;
    }

    /**
     * Returns the type of blood.
     * 
     * @return the type of blood
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of blood.
     * 
     * @param type the type of blood to set
     */
    public void setType(String type) {
        this.type = type;
    }
}
