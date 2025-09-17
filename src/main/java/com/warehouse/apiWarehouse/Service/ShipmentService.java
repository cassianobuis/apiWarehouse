package com.warehouse.apiWarehouse.Service;

import com.warehouse.apiWarehouse.DTO.ShipmentDTO;
import com.warehouse.apiWarehouse.Entity.Shipment;
import com.warehouse.apiWarehouse.Repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ShipmentService {
    @Autowired
    private ShipmentRepository repository;

    public Shipment findById(UUID id) {
        Shipment shipment = repository.findById(id).orElseThrow();

        ShipmentDTO shipmentDTO = convertToDTO(shipment);
        return shipment;
    }
    public ShipmentDTO save(ShipmentDTO shipmentDTO) {
        Shipment shipment = convertToEntity(shipmentDTO);
        Shipment Shipment = repository.save(shipment);
        return convertToDTO(Shipment);
    }
    public ShipmentDTO update(UUID id, ShipmentDTO shipmentDTO) {
        Shipment shipment = convertToEntity(shipmentDTO);
        shipment = repository.save(shipment);
        return convertToDTO(shipment);
    }
    public ShipmentDTO deleteById(UUID id) {
        repository.deleteById(id);
        return null;
    }
    public List<ShipmentDTO> findAll() {
        List<Shipment> shipments = repository.findAll();
        List<ShipmentDTO> shipmentDTOs = new ArrayList<>();
        for (Shipment shipment : shipments) {
            ShipmentDTO shipmentDTO = convertToDTO(shipment);
        }
        return shipmentDTOs;
    }

    private ShipmentDTO convertToDTO(Shipment shipment) {
        ShipmentDTO shipmentDTO = new ShipmentDTO();
        shipmentDTO.setStatus(shipment.getStatus());
        return shipmentDTO;
    }
    private Shipment convertToEntity(ShipmentDTO shipmentDTO) {
        Shipment shipment = new Shipment();
        shipment.setId(shipment.getId());
        shipment.setProduct(shipment.getProduct());
        shipment.setStatus(shipmentDTO.getStatus());
        return shipment;
    }
}
