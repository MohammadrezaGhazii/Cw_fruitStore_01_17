package org.example.model;

import jakarta.persistence.*;
import lombok.*;
import org.example.base.entity.BaseEntity;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "customer")
public class Customer extends BaseEntity<Long> {
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "national_id",unique = true , nullable = false)
    private String nationalId;

    @Column(name = "password")
    private String password;

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<Order> orders;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.DETACH , CascadeType.MERGE , CascadeType.PERSIST , CascadeType.REFRESH})
    @JoinTable(
            name = "cart" ,
            joinColumns = @JoinColumn(name = "customer_id") ,
            inverseJoinColumns = @JoinColumn (name = "fruit_id")
    )
    private List<Fruit> fruits;

    public void addOrder (Order order){
        if (orders == null){
            orders = new ArrayList<>();
        }
        orders.add(order);
    }
}
