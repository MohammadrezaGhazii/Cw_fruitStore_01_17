package org.example.model;

import jakarta.persistence.*;
import lombok.*;
import org.example.base.entity.BaseEntity;

import java.math.BigDecimal;
import java.util.List;

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

    @Column(name = "inventory")
    private Double inventory;

    @Column(name = "new_price")
    private Double newPrice;

    @Column(name = "old_price")
    private Double oldPrice;

    @Column(name = "tags")
    private String tags;

    @ManyToMany(fetch = FetchType.LAZY,
    cascade = {CascadeType.DETACH , CascadeType.MERGE , CascadeType.PERSIST , CascadeType.REFRESH})
    @JoinTable(
            name = "cart",
            joinColumns = @JoinColumn(name = "fruit_id"),
            inverseJoinColumns = @JoinColumn(name = "customer_id")
    )
    private List<Customer> customers;
}
