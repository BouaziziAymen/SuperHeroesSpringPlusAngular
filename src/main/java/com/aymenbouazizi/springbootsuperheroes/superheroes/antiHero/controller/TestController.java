package com.aymenbouazizi.springbootsuperheroes.superheroes.antiHero.controller;

import com.aymenbouazizi.springbootsuperheroes.superheroes.antiHero.dto.ApiResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/test")
public class TestController {
    @GetMapping("/")
    public ResponseEntity<ApiResponseDto<?>> Test() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(ApiResponseDto.builder().isSuccess(true).message("Whatever!").build());
    }
}