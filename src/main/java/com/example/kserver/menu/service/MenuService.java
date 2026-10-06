package com.example.kserver.menu.service;

import com.example.kserver.menu.dto.GetMenuResponse;
import com.example.kserver.menu.entity.Menu;
import com.example.kserver.menu.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class MenuService {

    private final MenuRepository menuRepository;

    @Transactional(readOnly = true)
    public List<GetMenuResponse> getAll() {
        List<Menu> menus = menuRepository.findAll();
        List<GetMenuResponse> dtos = new ArrayList<>();

        for (Menu menu : menus) {
            GetMenuResponse dto = new GetMenuResponse(
                    menu.getId(),
                    menu.getName(),
                    menu.getPrice()
            );
            dtos.add(dto);
        }
        return dtos;
    }
}
