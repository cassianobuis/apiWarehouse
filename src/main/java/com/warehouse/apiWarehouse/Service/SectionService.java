package com.warehouse.apiWarehouse.Service;

import com.warehouse.apiWarehouse.DTO.SectionDTO;
import com.warehouse.apiWarehouse.Entity.Section;
import com.warehouse.apiWarehouse.Repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class SectionService {
    @Autowired
    private SectionRepository Repository;

    public SectionDTO findById(UUID id){
        Section section = Repository.findById(id).orElseThrow();

        SectionDTO sectionDTO = convertToDTO(section);
        return sectionDTO;
    }
    public SectionDTO save(SectionDTO sectionDTO){
        Section section = convertToEntity(sectionDTO);
        section = Repository.save(section);
        return convertToDTO(section);
    }
    public SectionDTO update(UUID id,SectionDTO sectionDTO){
        Section section = convertToEntity(sectionDTO);
        section = Repository.save(section);
        return convertToDTO(section);
    }
    public void deleteById(UUID id){
        Repository.deleteById(id);
    }
    public List<SectionDTO> findAll(){
        List<Section> sections = Repository.findAll();
        List<SectionDTO> sectionDTOs = new ArrayList<>();
        for (Section section : sections) {
            sectionDTOs.add(convertToDTO(section));
        }
        return sectionDTOs;
    }

    private SectionDTO convertToDTO(Section section) {
        SectionDTO sectionDTO = new SectionDTO();
        sectionDTO.setCode(sectionDTO.getCode());
        return sectionDTO;
    }

    private Section convertToEntity(SectionDTO sectionDTO) {
        Section section = new Section();
        section.setCode(sectionDTO.getCode());
        return section;
    }
}
