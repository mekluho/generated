package ru.mekluho.generated.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mekluho.generated.service.impl.TypeService;

/**
 * Created by Andrey Nikulin
 * on 30.04.2020
 * mekluho@gmail.com
 */
@RestController
@RequestMapping("/default")
public class DefaultController {

    private final TypeService typeService;

    @Autowired
    public DefaultController (TypeService typeService) {
        this.typeService = typeService;
    }

    @GetMapping("get")
    public ResponseEntity getNothing() {
        return ResponseEntity.ok(typeService.getTypes());
    }
}
