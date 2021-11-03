package com.devsuperior.vgavendas.controllers;

import java.util.List;

import com.devsuperior.vgavendas.dto.SellerDTO;
import com.devsuperior.vgavendas.services.SellerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {
    
    @Autowired
    private SellerService service;

    @GetMapping
    private ResponseEntity<List<SellerDTO>> findAll() {
        List<SellerDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }
}
