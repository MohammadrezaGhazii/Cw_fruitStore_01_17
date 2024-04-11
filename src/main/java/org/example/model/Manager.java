package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.example.base.entity.BaseEntity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "manager")
public class Manager extends BaseEntity<Long> {
    @Column(name = "first_name")
     private String firstName;

    @Column(name = "last_name")
     private String lastName;

    @Column(name = "username",unique = true , nullable = false)
     private String username;

    @Column(name = "password")
     private String password;
}
