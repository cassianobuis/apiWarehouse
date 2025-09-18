package com.warehouse.apiWarehouse.Entity;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
@Entity
@Table (name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "UUID")
    private UUID id;
    @Column(nullable = false)
    private String sku;
    @Column(nullable = false)
    private String nome;



    @ManyToMany(mappedBy = "product")
    private Set<Shipment> shipment = new HashSet<>();

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Shipment> getShipment() {
        return shipment;
    }

    public void setShipment(Set<Shipment> shipment) {
        this.shipment = shipment;
    }
}
