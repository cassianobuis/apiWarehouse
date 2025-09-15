package com.warehouse.apiWarehouse.DTO;

public class SectionDTO {
    private String Code;

    public SectionDTO(String code) {
        Code = code;
    }

    public SectionDTO() {
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }
}
