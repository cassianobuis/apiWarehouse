package com.warehouse.apiWarehouse.Repository;

import com.warehouse.apiWarehouse.Entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WarehouseRepository
        extends
        JpaRepository<Warehouse, UUID> {
}
