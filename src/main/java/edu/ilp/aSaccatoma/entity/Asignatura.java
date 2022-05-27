package edu.ilp.aSaccatoma.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Asignatura")
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idasignatura;

    @Column(name = "curso",length = 20)
    private String Curso;

    //gttrs sttrs


    public Long getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(Long idasignatura) {
        this.idasignatura = idasignatura;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }
    //const

    public Asignatura(Long idasignatura, String curso) {
        this.idasignatura = idasignatura;
        Curso = curso;
    }
    //const2
    @ManyToOne
    @JoinColumn(name = "idpersona")
    private Persona persona;
    //@OneToMany(mappedBy = "direccion")
    //private List<Persona> personas;

    public Asignatura() {

    }
    //const3

    public Asignatura(Long idasignatura) {
        this.idasignatura = idasignatura;
    }
}
