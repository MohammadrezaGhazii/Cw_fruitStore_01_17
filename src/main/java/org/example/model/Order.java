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
@Table(name = "orders")
public class Order extends BaseEntity<Long> {
    @Column(name = "owner")
    private Customer owner;

    @Column(name = "state")
    private State state;

    @Column(name = "fruit_list")
    @OneToMany
    private List<Fruit> fruits;

    @Column(name = "fruit_weight")
    private String fruitWeight;

    @JoinColumn(name = "delivery_type")
    @OneToOne(fetch = FetchType.EAGER)
    private Delivery deliveryType;

    @Column(name = "total_price")
    private BigDecimal totalPrice;
}
