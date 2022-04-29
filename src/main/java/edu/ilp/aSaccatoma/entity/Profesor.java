package edu.ilp.aSaccatoma.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "profesor")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Profesor extends Persona{


    @Column(name = "salario",length = 10)
    private Double salario;

    //Getters and Setters

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    //Constructor

    public Profesor(String nombre, String telefono, String email, Double salario) {
        super(nombre, telefono, email);
        this.salario = salario;
    }

    public Profesor(Long idpersona, Double salario) {
        super(idpersona);
        this.salario = salario;
    }

    public Profesor(Double salario) {
        this.salario = salario;
    }

    //Constructor

    public Profesor(String nombre, String telefono, String email) {
        super(nombre, telefono, email);
    }

    public Profesor(Long idpersona) {
        super(idpersona);
    }

    //Constructor vacio


    public Profesor() {
    }

}
