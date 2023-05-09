package com.nestdigital.Surveillance.controller;

import com.nestdigital.Surveillance.Service.UnitServiceImpl;
import com.nestdigital.Surveillance.model.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/unit")
@RestController
public class UnitController {

    @Autowired
    private UnitServiceImpl unitServiceImpl;

    @CrossOrigin("*")
    @GetMapping(value = "/getUnitAndPatientsByFacility/{id}",produces = "application/json")
        public List<Unit> getUnitByFacility(@PathVariable int id){
    return unitServiceImpl.getUnitByFacilityId(id);
}
    }
