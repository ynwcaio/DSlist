package com.example.dev.controllers;

import com.example.dev.GameList;
import com.example.dev.dto.GameDTO;
import com.example.dev.dto.GameListDTO;
import com.example.dev.dto.GameMinDTO;
import com.example.dev.services.GameListService;
import com.example.dev.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}