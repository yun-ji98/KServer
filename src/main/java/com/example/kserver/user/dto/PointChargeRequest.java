package com.example.kserver.user.dto;

import lombok.Getter;

@Getter
public class PointChargeRequest {

    private Long userId;
    private Integer amount;
}
