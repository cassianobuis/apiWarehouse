package com.warehouse.apiWarehouse.Entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "UUID")


    @Column(nullable = false)
    private String name;

    @Column(nullable = false,updatable = false)
    private UUID id;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToMany
    @JoinColumn(name = "Section_id")
    private Section section;

    @OneToMany(mappedBy = "warehouse", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Section> sections = new HashSet<>();
}