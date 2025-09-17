package com.warehouse.apiWarehouse.Repository;

import com.warehouse.apiWarehouse.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ProductRepository
extends JpaRepository<Product, UUID> {

}
