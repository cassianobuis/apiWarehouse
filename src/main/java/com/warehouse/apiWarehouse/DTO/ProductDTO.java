package com.warehouse.apiWarehouse.DTO;

public class ProductDTO {
    private String sku;
    private String nome;

    public ProductDTO() {
    }

    public ProductDTO(String sku, String nome) {
        this.sku = sku;
        this.nome = nome;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
