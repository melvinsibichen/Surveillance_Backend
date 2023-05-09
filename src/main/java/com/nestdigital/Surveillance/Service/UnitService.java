package com.nestdigital.Surveillance.Service;

import com.nestdigital.Surveillance.model.Unit;

import java.util.List;

public interface UnitService {
    List<Unit> getUnitByFacilityId(int id);
}
