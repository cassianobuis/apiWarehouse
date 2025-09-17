package com.warehouse.apiWarehouse.Controller;

import com.warehouse.apiWarehouse.DTO.ProductDTO;
import com.warehouse.apiWarehouse.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/Product")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/{id}")
    public ProductDTO findById(@PathVariable UUID id){
        return service.findById(id);
    }
    @GetMapping
    public List<ProductDTO> findAll(){
        return service.findAll();
    }
    @PostMapping
    public ProductDTO save(@RequestBody ProductDTO productDTO){
        return service.save(productDTO);
    }
    @PutMapping("/{id}")
    public ProductDTO update(@RequestBody ProductDTO productDTO){
        return service.save(productDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id){
        service.deleteById(id);
    }
}
