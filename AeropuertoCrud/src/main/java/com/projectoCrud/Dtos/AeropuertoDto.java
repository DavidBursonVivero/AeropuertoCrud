package com.projectoCrud.Dtos;

import com.projectoCrud.models.Vuelo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class AeropuertoDto implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1l;
    int id;
     String nombreAeropuerto;
     String ciudad;
     String pais;
     String codigoAeropuerto;
     List<Vuelo> vuelosDesdeAeropuerto;
     List<Vuelo> vuelosHaciaAeropuerto;


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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AeropuertoDto that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getNombreAeropuerto(), that.getNombreAeropuerto()) && Objects.equals(getCiudad(), that.getCiudad()) && Objects.equals(getPais(), that.getPais()) && Objects.equals(getCodigoAeropuerto(), that.getCodigoAeropuerto()) && Objects.equals(getVuelosDesdeAeropuerto(), that.getVuelosDesdeAeropuerto()) && Objects.equals(getVuelosHaciaAeropuerto(), that.getVuelosHaciaAeropuerto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombreAeropuerto(), getCiudad(), getPais(), getCodigoAeropuerto(), getVuelosDesdeAeropuerto(), getVuelosHaciaAeropuerto());
    }
}
