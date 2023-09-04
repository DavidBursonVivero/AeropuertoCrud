package com.projectoCrud.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="vuelo")
public class Vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="numeroVuelo")
    private String numeroVuelo;
    @Column(name="origen")
    private String origen;
    @Column(name="destino")
    private String destino;
    @Column(name="fechaSalida")
    private LocalDateTime fechaSalida;
    @Column(name="duracionVuelo")
    private double duracionVuelo;
    @Column(name="capacidadAsientos")
    private int capacidadAsientos;
    @Column(name="precioBillete")
    private double precioBillete;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "aeropuerto_origen_id")
    private Aeropuerto aeropuertoOrigen;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "aeropuerto_destino_id")
    private Aeropuerto aeropuertoDestino;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "aerolinea_id")
    @JsonIgnore
    private Aerolinea aerolinea;

    public Vuelo() {
    }

    public Vuelo(int id, String numeroVuelo, String origen, String destino, LocalDateTime fechaSalida, double duracionVuelo, int capacidadAsientos, double precioBillete, Aeropuerto aeropuertoOrigen, Aeropuerto aeropuertoDestino) {
        this.id = id;
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.duracionVuelo = duracionVuelo;
        this.capacidadAsientos = capacidadAsientos;
        this.precioBillete = precioBillete;
        this.aeropuertoOrigen = aeropuertoOrigen;
        this.aeropuertoDestino = aeropuertoDestino;
    }

// Getters y setters
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
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}


