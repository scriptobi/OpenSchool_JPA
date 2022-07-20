package com.scriptobi.openschool.controllers;

import com.scriptobi.openschool.entities.CityEntity;
import com.scriptobi.openschool.services.CityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(path = "/city")
public class CityController {
    @Resource(name = "CityService")
    private CityService cityService;

    @GetMapping(path = "")
    public List<CityEntity> findAllCities() { return cityService.findAll(); }

    @PostMapping(path = "/new")
    public CityEntity insertNewCity(Integer cpl, String name) {
        CityEntity newCity = new CityEntity(cpl, name);
        return cityService.saveCity(newCity);
    }

    @PutMapping(path = "/update/{cpl}")
    public CityEntity updateCityName(Integer cpl, String name) {
        return cityService.updateCityName(cpl, name);
    }

    @GetMapping(path = "/{cpl}")
    public CityEntity findtCityById(Integer cpl) {
        return cityService.findById(cpl);
    }
}
