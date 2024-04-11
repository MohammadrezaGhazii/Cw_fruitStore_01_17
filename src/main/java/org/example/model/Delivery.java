package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;
import org.example.base.entity.BaseEntity;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "delivery")
public class Delivery extends BaseEntity<Long> {
    @Column(name = "name")
    private String Name;

    @Column(name = "delivery_price")
    private BigDecimal deliveryPrice;

    @Column(name = "duration")
    private Integer duration;
}
