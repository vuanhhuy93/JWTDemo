package com.huyva.springjwt.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user")
public class User extends BaseEntity {
    @Column(name = "username" , nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "isActive")
    private boolean active;
}