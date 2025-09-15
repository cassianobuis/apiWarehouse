package com.warehouse.apiWarehouse.Repository;

import com.warehouse.apiWarehouse.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository
extends JpaRepository<Address, UUID> {
}
