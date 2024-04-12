package org.example.model;

import jakarta.persistence.*;
import lombok.*;
import org.example.base.entity.BaseEntity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//@AllArgsConstructor
//@NoArgsConstructor
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

//    @Column(name = "weight")
//    private Double weight;

    @Column(name = "inventory")
    private Double inventory;

    @Column(name = "new_price")
    private Double newPrice;

    @Column(name = "old_price")
    private Double oldPrice;

    @Column(name = "tags")
    private String tags;


    @OneToMany(mappedBy = "fruit", fetch = FetchType.EAGER,
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Cart> carts = new ArrayList<>();


    public void addCart(Cart cart) {
        if (carts == null)
            carts = new ArrayList<>();
        carts.add(cart);
        cart.setFruit(this);
    }

    public Fruit() {
    }

    public Fruit(Long aLong) {
        super(aLong);
    }

    public Fruit(Long aLong, String name, String description, Boolean isExist, String weightUnit, Double inventory, Double newPrice, Double oldPrice, String tags) {
        super(aLong);
        this.name = name;
        this.description = description;
        this.isExist = isExist;
        this.weightUnit = weightUnit;
        this.inventory = inventory;
        this.newPrice = newPrice;
        this.oldPrice = oldPrice;
        this.tags = tags;
    }

    public Fruit(String name, String description, Boolean isExist, String weightUnit, Double inventory, Double newPrice, Double oldPrice, String tags) {
        this.name = name;
        this.description = description;
        this.isExist = isExist;
        this.weightUnit = weightUnit;
        this.inventory = inventory;
        this.newPrice = newPrice;
        this.oldPrice = oldPrice;
        this.tags = tags;
    }
//    @ManyToMany(fetch = FetchType.LAZY,
//    cascade = {CascadeType.DETACH , CascadeType.MERGE , CascadeType.PERSIST , CascadeType.REFRESH})
//    @JoinTable(
//            name = "cart",
//            joinColumns = @JoinColumn(name = "fruit_id"),
//            inverseJoinColumns = @JoinColumn(name = "customer_id")
//    )
//    private List<Customer> customers;
}
