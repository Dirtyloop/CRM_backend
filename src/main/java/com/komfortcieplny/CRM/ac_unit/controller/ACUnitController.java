package com.komfortcieplny.CRM.ac_unit.controller;

import com.komfortcieplny.CRM.ac_unit.controller.dto.ACUnitDto;
import com.komfortcieplny.CRM.common.model.ACUnit;
import com.komfortcieplny.CRM.ac_unit.service.ACUnitService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ACUnitController {
    private final ACUnitService acunitService;

    public ACUnitController(ACUnitService acunitService) {
        this.acunitService = acunitService;
    }

    @PostMapping("/admin/acunits")
    public ACUnit addACUnit(@RequestBody @Valid ACUnitDto acUnitDto) {
        return acunitService.addACUnit(ACUnit.builder()
                        .model(acUnitDto.model())
                        .power(acUnitDto.power())
                        .serialNumber(acUnitDto.serialNumber())
                        .instalDate(acUnitDto.instalDate())
                        .customerId(acUnitDto.customerId())
                .build());
    }
}
