package com.warehouse.apiWarehouse.Entity;

import jakarta.persistence.*;

import java.util.UUID;
@Entity
@Table (name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "UUID")
    private UUID id;
    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private String city;



    @OneToOne(mappedBy = "address")
    private Warehouse warehouse;

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

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void setId(UUID id) {

    }

}