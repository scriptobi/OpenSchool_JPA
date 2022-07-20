package com.scriptobi.openschool.repositories;

import com.scriptobi.openschool.entities.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, Integer> {
    public CityEntity save(CityEntity city);
    //public List<CityEntity> findAllOrderById();
    public List<CityEntity> findAllByOrderByCpl();
    public List<CityEntity> findAll();
}
