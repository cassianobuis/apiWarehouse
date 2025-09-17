package com.warehouse.apiWarehouse.Controller;

import com.warehouse.apiWarehouse.DTO.WareHouseDTO;
import com.warehouse.apiWarehouse.Service.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/WareHouse")
public class WareHouseController {
    @Autowired
    private WareHouseService service;

    @GetMapping("/{id}")
    public WareHouseDTO findById(@PathVariable("id") UUID id){
        return service.findById(id);
    }
    @GetMapping
    public List<WareHouseDTO> findAll(){
        return service.findAll();
    }
    @PostMapping
    public WareHouseDTO save(@RequestBody WareHouseDTO wareHouseDTO){
        return service.save(wareHouseDTO);
    }
    @PutMapping("/{id}")
    public WareHouseDTO update(@PathVariable("id") UUID id, @RequestBody WareHouseDTO wareHouseDTO){
        return service.update(id, wareHouseDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") UUID id){
        service.deleteById(id);
    }
}
