package com.projectoCrud.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellidos")
    private String apellidos;
    @Column(name="puestoTrabajo")
    private String puestoTrabajo;
    @Column(name="salario")
    private double salario;
    @Column(name="direccion")
    private String direccion;
    @Column(name="correoElectronico")
    private String correoElectronico;
    @Column(name="fechaContratacion")
    private LocalDate fechaContratacion;

    @ManyToOne( fetch = FetchType.EAGER)
    @JoinColumn(name = "aerolinea_id")
    @JsonIgnore
    private Aerolinea aerolinea;

    public Empleado() {
        super();
    }

    public Empleado(int id, String nombre, String apellidos, String puestoTrabajo, double salario, String direccion, String correoElectronico, LocalDate fechaContratacion, Aerolinea aerolinea) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puestoTrabajo = puestoTrabajo;
        this.salario = salario;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.fechaContratacion = fechaContratacion;
        this.aerolinea = aerolinea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
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
