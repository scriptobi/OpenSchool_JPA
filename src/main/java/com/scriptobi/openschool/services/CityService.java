package com.scriptobi.openschool.services;

import com.scriptobi.openschool.entities.CityEntity;
import com.scriptobi.openschool.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CityService")
public class CityService {
    @Autowired
    CityRepository cityRepo;

    public CityEntity saveCity(CityEntity city) { return  cityRepo.save(city); }
    public List<CityEntity> findAll() { return cityRepo.findAllByOrderByCpl(); }
    public CityEntity findById(Integer cpl) { return cityRepo.findById(cpl).get(); }
    public boolean existsById(Integer cpl) { return cityRepo.existsById(cpl); }
}
