package com.justin.cruddemo.utils.dto;

import lombok.Data;

@Data
public class CustomerUI {

    private String id;
    private String customerName;
    private String customerAddress;
    private boolean customerStatus;
    private String createdAt;
}
