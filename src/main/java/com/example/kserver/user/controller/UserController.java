package com.example.kserver.user.controller;

import com.example.kserver.user.dto.PointChargeRequest;
import com.example.kserver.user.dto.PointChargeResponse;
import com.example.kserver.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/api/points/charge")
    public ResponseEntity<PointChargeResponse> create(
            @RequestBody PointChargeRequest request
    ) {
        return ResponseEntity.status(HttpStatus.OK).body(
                userService.chargePoint(request)
        );
    }
}
