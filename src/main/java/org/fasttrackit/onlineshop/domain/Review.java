package org.fasttrackit.onlineshop.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Review {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product id")
    private Product product;




}
