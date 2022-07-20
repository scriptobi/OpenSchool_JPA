package com.scriptobi.openschool.controllers;

import com.scriptobi.openschool.entities.SessionEntity;
import com.scriptobi.openschool.services.SessionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(path =  "/session")
public class SessionController {
    @Resource(name = "SessionService")
    private SessionService sessionService;

    @GetMapping(path = "/")
    public List<SessionEntity> findAllSessions() {
        return sessionService.findAll();
    }
}
