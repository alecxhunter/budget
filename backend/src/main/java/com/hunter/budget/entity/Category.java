package com.hunter.budget.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "category")
@Data
public class Category {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @JoinColumn(name = "parent_id")
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Category parent;

    @OneToMany(cascade = CascadeType.ALL
    , fetch = FetchType.LAZY, mappedBy = "parent")
    private List<Category> subCategories;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "category")
    private List<Transaction> transactions;
}
