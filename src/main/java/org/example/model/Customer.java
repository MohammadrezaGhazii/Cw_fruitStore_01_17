package org.example.model;

import jakarta.persistence.*;
import lombok.*;
import org.example.base.entity.BaseEntity;

import java.util.ArrayList;
import java.util.List;

//@AllArgsConstructor
//@NoArgsConstructor
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

    @Column(name = "national_id", unique = true, nullable = false)
    private String nationalId;

    @Column(name = "password")
    private String password;


//    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "order_id")
//    private List<Order> orders;


    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private List<Cart> carts = new ArrayList<>();

    public void addCart(Cart cart) {
        if (carts == null)
            carts = new ArrayList<>();
        carts.add(cart);
        cart.setCustomer(this);
    }

    public Customer() {
    }

    public Customer(Long aLong, String firstName, String lastName, String phone, String address, String nationalId, String password) {
        super(aLong);
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.nationalId = nationalId;
        this.password = password;
    }

    public Customer(String firstName, String lastName, String phone, String address, String nationalId, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.nationalId = nationalId;
        this.password = password;
    }

    public Customer(Long aLong) {
        super(aLong);
    }
























    //    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = {CascadeType.DETACH , CascadeType.MERGE , CascadeType.PERSIST , CascadeType.REFRESH})
//    @JoinTable(
//            name = "cart" ,
//            joinColumns = @JoinColumn(name = "customer_id") ,
//            inverseJoinColumns = @JoinColumn (name = "fruit_id")
//    )
//    private List<Fruit> fruits;

//    public void addOrder(Order order) {
//        if (orders == null) {
//            orders = new ArrayList<>();
//        }
//        orders.add(order);
//    }






}
