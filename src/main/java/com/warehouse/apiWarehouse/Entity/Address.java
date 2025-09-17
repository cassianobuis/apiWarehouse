package com.warehouse.apiWarehouse.Entity;

import jakarta.persistence.*;

import java.util.UUID;
@Entity
@Table (name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "UUID")

    @Column(nullable = false)
    private UUID id;
    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private String city;



    @OneToOne(mappedBy = "address")
    private Warehouse warehouse;

    public void setId(UUID id) {
    }
}