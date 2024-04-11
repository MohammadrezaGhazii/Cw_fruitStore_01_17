package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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

    @Column(name = "start_time")
    private LocalDate startTime;

    @Column(name = "end_time")
    private LocalDate endTime;
}
