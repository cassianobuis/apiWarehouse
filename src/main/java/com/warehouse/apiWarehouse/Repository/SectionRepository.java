package com.warehouse.apiWarehouse.Repository;

import com.warehouse.apiWarehouse.Entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SectionRepository
extends JpaRepository<Section, UUID> {
}
