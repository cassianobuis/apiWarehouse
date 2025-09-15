package com.warehouse.apiWarehouse.DTO;

public class AddressDTO {
    private String street;
    private String city;

    public AddressDTO() {
    }

    public AddressDTO(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
