package com.warehouse.apiWarehouse.Service;

import com.warehouse.apiWarehouse.DTO.WareHouseDTO;
import com.warehouse.apiWarehouse.Entity.Warehouse;
import com.warehouse.apiWarehouse.Repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class WareHouseService {
    @Autowired
    private WarehouseRepository repository;

    public WareHouseDTO findById(UUID id) {
        Warehouse warehouse = repository.findById(id).orElseThrow();

        WareHouseDTO wareHouseDTO = convertToDTO(warehouse);
        return wareHouseDTO;
    }

    public WareHouseDTO save(WareHouseDTO wareHouseDTO) {
        Warehouse warehouse = convertToEntity(wareHouseDTO);
        return wareHouseDTO;
    }
    public WareHouseDTO update(UUID id, WareHouseDTO wareHouseDTO) {
        Warehouse warehouse = convertToEntity(wareHouseDTO);
        warehouse = repository.save(warehouse);
        return convertToDTO(warehouse);
    }
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
    public List<WareHouseDTO> findAll() {
        List<Warehouse> warehouseList = repository.findAll();
        List<WareHouseDTO> wareHouseDTOList = new ArrayList<>();
        for (Warehouse warehouse : warehouseList) {
            WareHouseDTO wareHouseDTO = convertToDTO(warehouse);
        }
        return wareHouseDTOList;
    }

    private WareHouseDTO convertToDTO(Warehouse warehouse) {
        WareHouseDTO wareHouseDTO = new WareHouseDTO();
        wareHouseDTO.setName(warehouse.getName());
        return wareHouseDTO;
    }
    private Warehouse convertToEntity(WareHouseDTO wareHouseDTO) {
        Warehouse warehouse = new Warehouse();
        warehouse.setName(wareHouseDTO.getName());
        return warehouse;
    }
}
