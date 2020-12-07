package com.armagan.elif.graphqlapp.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "member")
@Data
public class Member implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean status= Boolean.TRUE;
    private String username;

    @OneToOne(mappedBy = "member")
    private Basket basket;
}
