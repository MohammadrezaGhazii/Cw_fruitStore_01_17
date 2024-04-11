package org.example.model;

import jakarta.persistence.*;
import lombok.*;
import org.example.base.entity.BaseEntity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "cart")
public class Cart extends BaseEntity<Long> {

    private Double weight;


    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "customer_Id")
    private Customer customer;


    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "fruit_Id")
    private Fruit fruit;



}
