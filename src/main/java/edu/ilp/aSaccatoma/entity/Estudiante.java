package edu.ilp.aSaccatoma.entity;

import javax.persistence.*;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Estudiante extends Persona{

    @Column(name = "codigo", length = 10,nullable = false)
    private String codigo;

    @Column(name = "serie", length = 10)
    private String serie;

    //Getters And Setters


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    //Constructores

    public Estudiante(String nombre, String telefono, String email, String codigo, String serie) {
        super(nombre, telefono, email);
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estudiante(Long idpersona, String codigo, String serie) {
        super(idpersona);
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estudiante(String codigo, String serie) {
        this.codigo = codigo;
        this.serie = serie;
    }

    //Constructores


    public Estudiante() {
    }
}
