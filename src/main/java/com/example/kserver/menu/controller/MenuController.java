package com.example.kserver.menu.controller;

import com.example.kserver.menu.dto.GetMenuResponse;
import com.example.kserver.menu.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @GetMapping("/api/menus")
    public ResponseEntity<List<GetMenuResponse>> getAll() {
        List<GetMenuResponse> result = menuService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}