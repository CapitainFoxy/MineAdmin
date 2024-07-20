package com.mineadmin.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mineadmin.models.Player;
import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    @GetMapping
    public List<Player> getAllPlayers() {
        return Player.getAll();
    }
}
