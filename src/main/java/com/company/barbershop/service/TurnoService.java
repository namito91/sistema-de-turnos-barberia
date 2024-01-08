package com.company.barbershop.service;

import com.company.barbershop.model.Turno;
import com.company.barbershop.repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurnoService {

    TurnoRepository turnoRepository;

    @Autowired
    public TurnoService(TurnoRepository turnoRepository) {
        this.turnoRepository = turnoRepository;
    }

    public void save(Turno turno){

        turnoRepository.save(turno);
    }
}
