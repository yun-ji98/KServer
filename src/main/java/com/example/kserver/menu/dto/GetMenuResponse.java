package com.example.kserver.menu.dto;

import lombok.Getter;

@Getter
public class GetMenuResponse {

    private final Long menuid;
    private final String name;
    private final Integer price;

    public GetMenuResponse(Long menuid, String name, Integer price) {
        this.menuid = menuid;
        this.name = name;
        this.price = price;
    }
}

