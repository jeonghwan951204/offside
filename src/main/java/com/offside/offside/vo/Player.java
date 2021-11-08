package com.offside.offside.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {

    @Id @GeneratedValue
    @Column(name = "player_id")
    private Long id;

    private String name;
}
