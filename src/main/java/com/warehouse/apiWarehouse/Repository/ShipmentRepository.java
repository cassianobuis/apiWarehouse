package com.warehouse.apiWarehouse.Repository;

import com.warehouse.apiWarehouse.Entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ShipmentRepository
extends JpaRepository<Shipment, UUID> {
}
