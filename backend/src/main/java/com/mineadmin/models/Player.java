package com.mineadmin.models;

import java.util.Arrays;
import java.util.List;

public class Player {
    private int id;
    private String name;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static List<Player> getAll() {
        
        return Arrays.asList(
            new Player(1, "Steve"),
            new Player(2, "Alex")
        );
    }

    
}
