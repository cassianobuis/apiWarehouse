package com.warehouse.apiWarehouse.Controller;


import com.warehouse.apiWarehouse.DTO.SectionDTO;
import com.warehouse.apiWarehouse.Service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/Section")
public class SectionController {
    @Autowired
    private SectionService service;

    @GetMapping("/{id}")
    public SectionDTO findById(@PathVariable ("id") UUID id) {
    return service.findById(id);
    }
    @GetMapping
    public List<SectionDTO> findAll() {
        return service.findAll();
    }
    @PostMapping
    public SectionDTO save(@RequestBody SectionDTO sectionDTO){
        return service.save(sectionDTO);
    }
    @PutMapping("/{id}")
    public SectionDTO update(@RequestBody SectionDTO sectionDTO, @PathVariable ("id") UUID id) {
        return service.update(id, sectionDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable ("id") UUID id) {
        service.deleteById(id);
    }
}
