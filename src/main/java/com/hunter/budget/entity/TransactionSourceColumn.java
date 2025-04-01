package com.hunter.budget.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "transaction_source_column")
@Data
public class TransactionSourceColumn {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private TransactionSource transactionSource;
}
