package com.warehouse.apiWarehouse.Repository;

import com.warehouse.apiWarehouse.Entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface SectionRepository
extends JpaRepository<Section, UUID> {
}
