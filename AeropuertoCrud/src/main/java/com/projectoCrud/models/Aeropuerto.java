package com.projectoCrud.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="aeropuerto")
public class Aeropuerto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombreAeropuerto")
    private String nombreAeropuerto;
    @Column(name="ciudad")
    private String ciudad;
    @Column(name="pais")
    private String pais;
    @Column(name="codigoAeropuerto")
    private String codigoAeropuerto;

    @OneToMany(mappedBy = "aeropuertoOrigen")
    @JsonIgnore
    private List<Vuelo> vuelosDesdeAeropuerto;

    @OneToMany(mappedBy = "aeropuertoDestino")
    @JsonIgnore
    private List<Vuelo> vuelosHaciaAeropuerto;

    public Aeropuerto() {
    }

    public Aeropuerto(int id, String nombreAeropuerto, String ciudad, String pais, String codigoAeropuerto, List<Vuelo> vuelosDesdeAeropuerto, List<Vuelo> vuelosHaciaAeropuerto) {
        this.id = id;
        this.nombreAeropuerto = nombreAeropuerto;
        this.ciudad = ciudad;
        this.pais = pais;
        this.codigoAeropuerto = codigoAeropuerto;
        this.vuelosDesdeAeropuerto = vuelosDesdeAeropuerto;
        this.vuelosHaciaAeropuerto = vuelosHaciaAeropuerto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreAeropuerto() {
        return nombreAeropuerto;
    }

    public void setNombreAeropuerto(String nombreAeropuerto) {
        this.nombreAeropuerto = nombreAeropuerto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoAeropuerto() {
        return codigoAeropuerto;
    }

    public void setCodigoAeropuerto(String codigoAeropuerto) {
        this.codigoAeropuerto = codigoAeropuerto;
    }

    public List<Vuelo> getVuelosDesdeAeropuerto() {
        return vuelosDesdeAeropuerto;
    }

    public void setVuelosDesdeAeropuerto(List<Vuelo> vuelosDesdeAeropuerto) {
        this.vuelosDesdeAeropuerto = vuelosDesdeAeropuerto;
    }

    public List<Vuelo> getVuelosHaciaAeropuerto() {
        return vuelosHaciaAeropuerto;
    }

    public void setVuelosHaciaAeropuerto(List<Vuelo> vuelosHaciaAeropuerto) {
        this.vuelosHaciaAeropuerto = vuelosHaciaAeropuerto;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}






