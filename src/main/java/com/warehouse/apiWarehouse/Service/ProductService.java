package com.warehouse.apiWarehouse.Service;

import com.warehouse.apiWarehouse.DTO.ProductDTO;
import com.warehouse.apiWarehouse.Entity.Product;
import com.warehouse.apiWarehouse.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public ProductDTO findById(UUID id){
        Product product = repository.findById(id).orElseThrow();

        ProductDTO productDTO = convertToDTO(product);
        return productDTO;
    }
    public ProductDTO save(ProductDTO productDTO){
        Product product = convertToEntity(productDTO);
        product = repository.save(product);
        return convertToDTO(product);
    }
    public ProductDTO update(UUID id, ProductDTO productDTO){
        Product product = convertToEntity(productDTO);
        product = repository.save(product);
        return convertToDTO(product);
    }

    public void deleteById(UUID id){
        repository.deleteById(id);
    }
    public List<ProductDTO> findAll(){
        List<Product> products = repository.findAll();
        List<ProductDTO> productDTOs = new ArrayList<>();
        for(Product product : products){
            productDTOs.add(convertToDTO(product));
        }
        return productDTOs;
    }

    private ProductDTO convertToDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setNome(productDTO.getNome());
        productDTO.setSku(productDTO.getSku());
        return productDTO;
    }
    private Product convertToEntity(ProductDTO productDTO) {
        Product product = new Product();
        productDTO.setNome(productDTO.getNome());
        productDTO.setSku(productDTO.getSku());
        return product;
    }

}
