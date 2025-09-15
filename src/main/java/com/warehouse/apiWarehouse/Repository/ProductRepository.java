package com.warehouse.apiWarehouse.Repository;

import com.warehouse.apiWarehouse.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository
extends JpaRepository<Product, UUID> {

}
