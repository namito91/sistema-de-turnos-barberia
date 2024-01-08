package com.company.barbershop.model;

import jakarta.persistence.*;

@Entity
@Table(name = "turno")
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // IDENTITY : mysql handles autoincrement
    @Column(name = "id")
    private int id;

    @Column(name = "dia")
    private String dia;

    @Column(name = "horario")
    private String horario;


    public Turno(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "id=" + id +
                ", dia='" + dia + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }
}
