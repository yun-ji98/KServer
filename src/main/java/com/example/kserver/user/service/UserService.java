package com.example.kserver.user.service;

import com.example.kserver.user.dto.PointChargeRequest;
import com.example.kserver.user.dto.PointChargeResponse;
import com.example.kserver.user.entity.User;
import com.example.kserver.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public PointChargeResponse chargePoint(PointChargeRequest request) {
        User user = new userRepository.findById(request.getUserId())
                .orElseThrow(() -> new IllegalArgumentException("사용자를 찾을 수 없습니다."));


        User.chargePoint(request.getAmount());

        PointChargeResponse response = new PointChargeResponse(
                user.getId(),
                request.getAmount(),
                user.getPoint()
        );
        return response;
    }
}
