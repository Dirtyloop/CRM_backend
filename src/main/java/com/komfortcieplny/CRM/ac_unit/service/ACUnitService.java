package com.komfortcieplny.CRM.ac_unit.service;

import com.komfortcieplny.CRM.common.model.ACUnit;
import com.komfortcieplny.CRM.ac_unit.repository.ACUnitRepository;
import org.springframework.stereotype.Service;

@Service
public class ACUnitService {
    private final ACUnitRepository acUnitRepository;

    public ACUnitService(ACUnitRepository acUnitRepository) {
        this.acUnitRepository = acUnitRepository;
    }

    public ACUnit addACUnit(ACUnit acUnit) {
        return acUnitRepository.save(acUnit);
    }
}
