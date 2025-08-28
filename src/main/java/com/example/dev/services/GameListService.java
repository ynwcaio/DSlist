package com.example.dev.services;

import com.example.dev.Game;
import com.example.dev.GameList;
import com.example.dev.dto.GameListDTO;
import com.example.dev.dto.GameMinDTO;
import com.example.dev.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}
