package com.warehouse.apiWarehouse.Entity;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "UUID")
    @Column(nullable = false,updatable = false)
    private UUID id;
    @Column(nullable = false)
    private String sku;
    @Column(nullable = false)
    private String nome;



    @ManyToMany(mappedBy = "product")
    private Set<Shipment> shipment = new HashSet<>();
}
