package com.warehouse.apiWarehouse.Entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "UUID")

    @Column(nullable=false,updatable=false)
    private UUID id;
    @Column(nullable=false,updatable=false)
    private String status;

    @ManyToMany
    @JoinTable(name = "shipment_product",
    joinColumns = @JoinColumn(name = "shipment_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private Set<Product> product = new HashSet<>();

}
