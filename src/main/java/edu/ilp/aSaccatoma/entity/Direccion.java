package edu.ilp.aSaccatoma.entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "direccion")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iddireccion;

    @Column(name = "calle",length = 20)
    private String calle;

    @Column(name = "ciudad",length = 20)
    private String ciudad;

    private String stado;

    @Column(name = "codigoPostal",length = 10)
    private String codigoPostal;

    @Column(name = "pais",length = 20)
    private String pais;

    //settrs gttrs


    public Long getIddireccion() {
        return iddireccion;
    }

    public void setIddireccion(Long iddireccion) {
        this.iddireccion = iddireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getStado() {
        return stado;
    }

    public void setStado(String stado) {
        this.stado = stado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    //contructor

    public Direccion(String calle, String ciudad, String stado, String codigoPostal, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.stado = stado;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    //const
    @OneToMany(mappedBy = "direccion")
     private List<Persona> personas;

    public Direccion() {
    }

    //cont

    public Direccion(Long iddireccion) {
        this.iddireccion = iddireccion;
    }
}
