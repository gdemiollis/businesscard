package com.and1droid.businesscards.dummy;

/**
     * A dummy item representing a piece of content.
     */
    public class Company {
    private int id;
    private String name;
    private int telephone;
    private String web;
    private String email;
    private String address;

    public Company(int id, String name, int telephone, String web, String email, String address) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.web = web;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}