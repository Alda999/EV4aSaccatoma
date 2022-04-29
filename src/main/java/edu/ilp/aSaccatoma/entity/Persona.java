package edu.ilp.aSaccatoma.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona", length = 15)
    private Long idpersona;

    @Column(name = "nombre", length = 20, nullable = false)
    private String nombre;

   @Column(name = "telefono", length = 10)
    private String telefono;

   @Column(name = "email", length = 20)
    private String email;

    //Getters and Setters


    public Long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Contructores

    public Persona(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    //Constructor 1

    public Persona(Long idpersona) {
        this.idpersona = idpersona;
    }

    //Constructor Vacio

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idDireccion")
    private Direccion direccion;


    public Persona() {
    }
}
