package com.program.inventory.entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany
    private Set<Product> st;

    public int getId() {
        return id;
    }

    public Set<Product> getSt() {
        return st;
    }

    public void setSt(Set<Product> st) {
        this.st = st;
    }
}