package edu.ilp.aSaccatoma.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "profesor")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Profesor extends Persona{


    @Column(name = "pcodigo", length = 10,nullable = false)
    private String pcodigo;



    @Column(name = "salario",length = 10)
    private Double salario;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Asignatura asignatura;

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
    @OneToMany(mappedBy = "Asignatura")
    private List<Persona> personas;

    public Profesor() {
    }

}
