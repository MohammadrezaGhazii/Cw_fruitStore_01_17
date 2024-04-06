package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.example.base.entity.BaseEntity;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "fruit")
public class Fruit extends BaseEntity<Long> {
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "is_exist")
    private Boolean isExist;

    @Column(name = "weight_unit")
    private String weightUnit;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "new_price")
    private BigDecimal newPrice;

    @Column(name = "old_price")
    private BigDecimal oldPrice;

    @Column(name = "tags")
    private String tags;
}
