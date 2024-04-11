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
@Table(name = "order")
public class Order extends BaseEntity<Long> {
    @Column(name = "owner")
    private String owner;

    @Column(name = "state")
    private State state;

    @Column(name = "fruit_name")
    private String fruitName;

    @Column(name = "fruit_weight")
    private String fruitWeight;

//    @Column(name = "delivery_type")
//    private String deliveryType;

    @Column(name = "total_price")
    private BigDecimal totalPrice;
}
