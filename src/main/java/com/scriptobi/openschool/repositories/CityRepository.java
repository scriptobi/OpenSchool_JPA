package com.scriptobi.openschool.repositories;

import com.scriptobi.openschool.entities.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, Integer> {
    List<CityEntity> findByOrderByCpl();

    @Query("SELECT * FROM CityEntity ce WHERE ce.name LIKE '%:name%'")
    List<CityEntity> searchByName(@Param("name") String name);
    List<CityEntity> findByOrderByName();
    @Modifying
    @Query("UPDATE CityEntity ce SET ce.name = :name WHERE ce.cpl = :cpl")
    int modifyCityName(@Param("cpl") Integer cpl, @Param("name") String name);
}
