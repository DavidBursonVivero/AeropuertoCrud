package com.projectoCrud.Dtos;

import com.projectoCrud.models.Aerolinea;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class EmpleadoDto implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1l;
     int id;
     String nombre;
     String apellidos;
     String puestoTrabajo;
     double salario;
     String direccion;
     String correoElectronico;
     LocalDate fechaContratacion;
     Aerolinea aerolinea;



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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmpleadoDto that)) return false;
        return Double.compare(that.getSalario(), getSalario()) == 0 && Objects.equals(getId(), that.getId()) && Objects.equals(getNombre(), that.getNombre()) && Objects.equals(getApellidos(), that.getApellidos()) && Objects.equals(getPuestoTrabajo(), that.getPuestoTrabajo()) && Objects.equals(getDireccion(), that.getDireccion()) && Objects.equals(getCorreoElectronico(), that.getCorreoElectronico()) && Objects.equals(getFechaContratacion(), that.getFechaContratacion()) && Objects.equals(getAerolinea(), that.getAerolinea());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getApellidos(), getPuestoTrabajo(), getSalario(), getDireccion(), getCorreoElectronico(), getFechaContratacion(), getAerolinea());
    }
}
