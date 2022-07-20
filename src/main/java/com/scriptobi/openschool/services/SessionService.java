package com.scriptobi.openschool.services;

import com.scriptobi.openschool.entities.SessionEntity;
import com.scriptobi.openschool.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SessionService {
    @Autowired
    SessionRepository sessionRepo;

    public SessionEntity saveSession(SessionEntity session) { return sessionRepo.save(session); }
    public List<SessionEntity> findAll() { return sessionRepo.findAll(); }
}
