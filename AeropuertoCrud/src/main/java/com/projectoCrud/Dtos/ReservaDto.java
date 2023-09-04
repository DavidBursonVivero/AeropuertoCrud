package com.projectoCrud.Dtos;

import com.projectoCrud.models.Cliente;
import com.projectoCrud.models.Pasajero;
import com.projectoCrud.models.Vuelo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class ReservaDto implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1l;
     int id;
     LocalDateTime fechaReserva;
     String numeroAsiento;
     Pasajero pasajero;
     Vuelo vuelo;
     Cliente cliente;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReservaDto that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getFechaReserva(), that.getFechaReserva()) && Objects.equals(getNumeroAsiento(), that.getNumeroAsiento()) && Objects.equals(getPasajero(), that.getPasajero()) && Objects.equals(getVuelo(), that.getVuelo()) && Objects.equals(cliente, that.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFechaReserva(), getNumeroAsiento(), getPasajero(), getVuelo(), cliente);
    }
}
