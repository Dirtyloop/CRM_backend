package com.komfortcieplny.CRM.ac_unit.controller;

import com.komfortcieplny.CRM.ac_unit.service.ACUnitService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ACUnitController {
    private final ACUnitService acunitService;

    public ACUnitController(ACUnitService acunitService) {
        this.acunitService = acunitService;
    }
}
