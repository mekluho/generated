package ru.mekluho.generated.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Andrey Nikulin
 * on 30.04.2020
 * mekluho@gmail.com
 */
@RestController
@RequestMapping("/default")
public class DefaultController {

    @GetMapping("get")
    public ResponseEntity getNothing() {
        return ResponseEntity.ok("");
    }
}
