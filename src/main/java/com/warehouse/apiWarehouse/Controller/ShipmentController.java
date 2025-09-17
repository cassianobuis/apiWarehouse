package com.warehouse.apiWarehouse.Controller;

import com.warehouse.apiWarehouse.DTO.ShipmentDTO;
import com.warehouse.apiWarehouse.Entity.Shipment;
import com.warehouse.apiWarehouse.Service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/shipment")
public class ShipmentController {
    @Autowired
    private ShipmentService service;

    @GetMapping("/{id}")
    public Shipment findById(@PathVariable ("id")UUID id){
        return service.findById(id);
    }
    @GetMapping
    public List<ShipmentDTO> findAll(){
        return service.findAll();
    }
    @PostMapping
    public ShipmentDTO save(@RequestBody ShipmentDTO shipmentDTO){
        return service.save(shipmentDTO);
    }
    @PutMapping("/{id}")
    public ShipmentDTO update(@PathVariable ("id")UUID id, @RequestBody ShipmentDTO shipmentDTO){
        return service.update(id, shipmentDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable ("id")UUID id){
        service.deleteById(id);
    }
}
