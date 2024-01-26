package com.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    private long order_id;

    private int user;

    private int product;

    private int quantity;

    private Date order_date;


}
