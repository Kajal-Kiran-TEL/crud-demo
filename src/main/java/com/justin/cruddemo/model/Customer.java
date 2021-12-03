
package com.justin.cruddemo.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "customer_table")
public class Customer {

    @Id
    @Column(name = "ID")
    private String id;

    @NotNull
    @Column(name = "customer_name")
    private String customerName;

    @NotNull
    @Column(name = "customer_address")
    private String customerAddress;

    @NotNull
    @Column(name = "status")
    private boolean customerStatus;

    @Column(name = "created_at")
    private String createdAt;

}
