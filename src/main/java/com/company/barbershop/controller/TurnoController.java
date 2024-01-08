package com.company.barbershop.controller;

import com.company.barbershop.model.Turno;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/barber-shop")
public class TurnoController {

    // inject values from app properties file
    @Value("${dias}")
    private List<String> dias;

    @Value("${horarios}")
    private List<String> horarios;


    @GetMapping("/turnos")
    public String formularioDeTurno(Model model){

        Turno turno = new Turno();

        // Obtener fechas desde hoy en adelante
        LocalDate hoy = LocalDate.now();

        List<LocalDate> fechas = new ArrayList<>();

        for (int i = 0; i < 20; i++) {  // Puedes ajustar el número de fechas que deseas mostrar

            LocalDate fecha = hoy.plusDays(i);
            
            if (fecha.getDayOfWeek() != DayOfWeek.SUNDAY && fecha.getDayOfWeek() != DayOfWeek.MONDAY) {
                fechas.add(fecha);
            }
        }

        model.addAttribute(turno);

        model.addAttribute("dias",dias);

        model.addAttribute("horarios",horarios);

        model.addAttribute("fechas",fechas);

        return "formulario-de-turno";
    }


    @PostMapping("/procesar-formulario-turno")
    public String procesarFormularioTurno(){

        return "";
    }

}
