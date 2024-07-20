package com.mineadmin.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mineadmin.models.Server;

@RestController
@RequestMapping("/api/server")
public class ServerController {

    @GetMapping("/status")
    public String getServerStatus() {
        return Server.getStatus();
    }
}
