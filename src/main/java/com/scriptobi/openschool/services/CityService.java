package com.scriptobi.openschool.services;

import com.scriptobi.openschool.entities.CityEntity;
import com.scriptobi.openschool.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("CityService")
@Transactional
public class CityService {
    @Autowired
    CityRepository cityRepo;

    public CityEntity saveCity(CityEntity city) { return cityRepo.save(city); }
    public List<CityEntity> findAll() { return cityRepo.findByOrderByCpl(); }
    public CityEntity updateCityName(Integer cpl, String name) {
        return cityRepo.modifyCityName(cpl, name) > 0 ? cityRepo.findById(cpl).get() : null;
    }
    public CityEntity findById(Integer cpl) { return cityRepo.findById(cpl).get(); }
    public List<CityEntity> searchByName(String name) { return cityRepo.searchByName(name); }
    public boolean existsById(Integer cpl) { return cityRepo.existsById(cpl); }
}
