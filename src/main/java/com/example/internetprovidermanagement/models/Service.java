package com.example.internetprovidermanagement.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Services")
@Getter
@Setter
public class Service extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ServiceID")
    private Long id;
    
    @NotBlank(message = "Name is required")
    @Size(max = 45, message = "Name must be less than 45 characters")
    @Column(name = "Name", nullable = false)
    private String name;
    
    @NotBlank(message = "Description is required")
    @Size(max = 500, message = "Description must be less than 500 characters")
    @Column(name = "Description", nullable = false)
    private String description;
    
    @NotBlank(message = "Type is required")
    @Size(max = 45, message = "Type must be less than 45 characters")
    @Column(name = "Type", nullable = false)
    private String type;
    
    @NotNull(message = "Price is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
    @Column(name = "Price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;
    
    @Column(name = "DataCap", nullable = false, precision = 10, scale = 2)
    private BigDecimal dataCap = BigDecimal.ZERO;
    
    @Column(name = "Speed", nullable = false)
    private Integer speed = 0;
}
