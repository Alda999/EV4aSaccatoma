package edu.ilp.aSaccatoma.entity;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@Entity
@Table(name = "asignatura")
@CrossOrigin(origins = "http://localhost:4200")
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idasignatura;
    private String denominacion;
    private String sigla;
    private String creditos;

    //GTTRS STTRS

    public Long getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(Long idasignatura) {
        this.idasignatura = idasignatura;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    //CONST

    public Asignatura(String denominacion, String sigla, String creditos) {
        this.denominacion = denominacion;
        this.sigla = sigla;
        this.creditos = creditos;
    }

    //VACIO

    public Asignatura(Long idasignatura) {
        this.idasignatura = idasignatura;
    }
    //CS

    public Asignatura() {
    }
}
