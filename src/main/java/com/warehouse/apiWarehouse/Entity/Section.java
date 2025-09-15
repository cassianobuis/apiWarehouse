package com.warehouse.apiWarehouse.Entity;

import jakarta.persistence.*;

import java.util.UUID;

public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "UUID")

    @Column(nullable = false,updatable = false)
    private UUID id;
    @Column(nullable = false)
    private String Code;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;
}
