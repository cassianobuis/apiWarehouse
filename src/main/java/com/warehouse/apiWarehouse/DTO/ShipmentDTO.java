package com.warehouse.apiWarehouse.DTO;

public class ShipmentDTO {
    private String status;

    public ShipmentDTO(String status) {
        this.status = status;
    }

    public ShipmentDTO() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
