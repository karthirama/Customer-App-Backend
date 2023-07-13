package com.rama.customer.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Customer {
    @Id
    @SequenceGenerator(name="customer_id_seq",sequenceName = "customer_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "customer_id_seq")
    private Integer id;

    private String name;

    private String email;

    private int age;
}
