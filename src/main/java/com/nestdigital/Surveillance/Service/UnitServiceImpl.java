package com.nestdigital.Surveillance.Service;

import com.nestdigital.Surveillance.model.Unit;
import com.nestdigital.Surveillance.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UnitServiceImpl implements UnitService{

    @Autowired
    private UnitRepository unitRepository;
    @Override
    public List<Unit> getUnitByFacilityId(int id) {
        return unitRepository.getUnitByFacilityId(id);
    }
}
