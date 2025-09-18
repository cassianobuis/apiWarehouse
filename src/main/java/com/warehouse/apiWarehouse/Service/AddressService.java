package com.warehouse.apiWarehouse.Service;

import com.warehouse.apiWarehouse.DTO.AddressDTO;
import com.warehouse.apiWarehouse.Entity.Address;
import com.warehouse.apiWarehouse.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class AddressService {
    @Autowired
    private AddressRepository Repository;

    public AddressDTO findById(UUID id) {
        Address address = Repository.findById(id).orElseThrow();

        AddressDTO addressDTO = convertToDto(address);
        return addressDTO;
    }

    public AddressDTO save(AddressDTO addressDTO) {
        Address address = convertToEntity(addressDTO);
        address = Repository.save(address);
        return convertToDto(address);
    }

    public AddressDTO update(UUID id, AddressDTO addressDTO) {
        Address address = convertToEntity(addressDTO);
        address = Repository.save(address);
        return convertToDto(address);
    }

    public void deleteById(UUID id) {
        Repository.deleteById(id);
    }
    public List<AddressDTO> findAll(){
        List<Address> addressList = Repository.findAll();
        List<AddressDTO> addressDTOList = new ArrayList<>();
        for (Address address : addressList) {
            AddressDTO addressDTO = convertToDto(address);
            addressDTOList.add(addressDTO);
        }
        return addressDTOList;
    }


    private AddressDTO convertToDto(Address address) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setCity(address.getCity());
        addressDTO.setStreet(address.getStreet());
        return addressDTO;
    }

    private Address convertToEntity(AddressDTO addressDTO) {
        Address address = new Address();
        address.setCity(addressDTO.getCity());
        address.setStreet(addressDTO.getStreet());
        return address;

    }
}