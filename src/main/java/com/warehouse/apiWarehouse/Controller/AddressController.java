package com.warehouse.apiWarehouse.Controller;

import com.warehouse.apiWarehouse.DTO.AddressDTO;
import com.warehouse.apiWarehouse.Entity.Address;
import com.warehouse.apiWarehouse.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/address")
public class AddressController {
    @Autowired
    private AddressService service;

    @GetMapping("/{id}")
    public AddressDTO findById(@PathVariable ("id")UUID id) {
      return  service.findById(id);
    }

    @GetMapping
    public List<AddressDTO> findAll() {
        return service.findAll();
    }
    @PostMapping
    public AddressDTO save(@RequestBody AddressDTO addressDTO) {
        return service.save(addressDTO);
    }

    @PutMapping("/{id}")
    public AddressDTO update(@PathVariable ("id")UUID id, @RequestBody AddressDTO addressDTO) {
        return service.update(id, addressDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable ("id")UUID id) {
        service.deleteById(id);
    }
}
