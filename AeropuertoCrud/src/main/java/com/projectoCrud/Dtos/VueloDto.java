package com.projectoCrud.Dtos;

import com.projectoCrud.models.Aerolinea;
import com.projectoCrud.models.Aeropuerto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class VueloDto implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1l;

     int id;
     String numeroVuelo;
     String origen;
     String destino;
     LocalDateTime fechaSalida;
     double duracionVuelo;
     int capacidadAsientos;
     double precioBillete;
     Aeropuerto aeropuertoOrigen;
     Aeropuerto aeropuertoDestino;
     Aerolinea aerolinea;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getDuracionVuelo() {
        return duracionVuelo;
    }

    public void setDuracionVuelo(double duracionVuelo) {
        this.duracionVuelo = duracionVuelo;
    }

    public int getCapacidadAsientos() {
        return capacidadAsientos;
    }

    public void setCapacidadAsientos(int capacidadAsientos) {
        this.capacidadAsientos = capacidadAsientos;
    }

    public double getPrecioBillete() {
        return precioBillete;
    }

    public void setPrecioBillete(double precioBoleto) {
        this.precioBillete = precioBoleto;
    }

    public Aeropuerto getAeropuertoOrigen() {
        return aeropuertoOrigen;
    }

    public void setAeropuertoOrigen(Aeropuerto aeropuertoOrigen) {
        this.aeropuertoOrigen = aeropuertoOrigen;
    }

    public Aeropuerto getAeropuertoDestino() {
        return aeropuertoDestino;
    }

    public void setAeropuertoDestino(Aeropuerto aeropuertoDestino) {
        this.aeropuertoDestino = aeropuertoDestino;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VueloDto vueloDto)) return false;
        return getCapacidadAsientos() == vueloDto.getCapacidadAsientos() && Double.compare(vueloDto.getPrecioBillete(), getPrecioBillete()) == 0 && Objects.equals(getId(), vueloDto.getId()) && Objects.equals(getNumeroVuelo(), vueloDto.getNumeroVuelo()) && Objects.equals(getOrigen(), vueloDto.getOrigen()) && Objects.equals(getDestino(), vueloDto.getDestino()) && Objects.equals(getFechaSalida(), vueloDto.getFechaSalida()) && Objects.equals(getDuracionVuelo(), vueloDto.getDuracionVuelo()) && Objects.equals(getAeropuertoOrigen(), vueloDto.getAeropuertoOrigen()) && Objects.equals(getAeropuertoDestino(), vueloDto.getAeropuertoDestino()) && Objects.equals(getAerolinea(), vueloDto.getAerolinea());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNumeroVuelo(), getOrigen(), getDestino(), getFechaSalida(), getDuracionVuelo(), getCapacidadAsientos(), getPrecioBillete(), getAeropuertoOrigen(), getAeropuertoDestino(), getAerolinea());
    }
}
