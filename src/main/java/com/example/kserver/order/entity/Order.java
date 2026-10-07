package com.example.kserver.order.entity;

import com.example.kserver.menu.entity.Menu;
import com.example.kserver.user.entity.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Integer amount;
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id")
    private Menu menu;

    public Order(User user, Menu menu, Integer amount, String status) {
        this.user = user;
        this.menu = menu;
        this.amount = amount;
        this.status = status;
    }
}
