package com.web.entity;

import javax.persistence.*;

@Entity
@Table(name="goods")
public class Goods {
    @Id
    @Column(name="id")
    @TableGenerator(name = "GEN",
            table = "GENERATOR",
            pkColumnName = "GEN_NAME",
            valueColumnName = "GEN_VAL"
    )
    @GeneratedValue(generator = "GEN")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private float price;

    @Column(name="type")
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
