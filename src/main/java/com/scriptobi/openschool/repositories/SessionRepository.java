package com.scriptobi.openschool.repositories;

import com.scriptobi.openschool.entities.SessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<SessionEntity, Integer> {
}
