package com.warehouse.apiWarehouse.DTO;

public class WareHouseDTO {
    private String name;

    public WareHouseDTO(String name) {
        this.name = name;
    }

    public WareHouseDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
