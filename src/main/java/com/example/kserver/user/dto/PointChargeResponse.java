package com.example.kserver.user.dto;

import lombok.Getter;

@Getter
public class PointChargeResponse {

    private final Long userId;
    private final Integer chargedAmount;
    private final Integer pointBalance;

    public PointChargeResponse(Long userId, Integer chargedAmount, Integer pointBalance) {
        this.userId = userId;
        this.chargedAmount = chargedAmount;
        this.pointBalance = pointBalance;
    }
}
