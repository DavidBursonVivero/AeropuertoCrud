package com.projectoCrud.Dtos;

import com.projectoCrud.models.Reserva;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class ClienteDto implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1l;
     int id;
     String nombre;
     String apellidos;
     LocalDate fechaNacimiento;
     String genero;
     String direccion;
     String correoElectronico;

     List<Reserva> reservas;

    public ClienteDto() {
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClienteDto that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getNombre(), that.getNombre()) && Objects.equals(getApellidos(), that.getApellidos()) && Objects.equals(getFechaNacimiento(), that.getFechaNacimiento()) && Objects.equals(getGenero(), that.getGenero()) && Objects.equals(getDireccion(), that.getDireccion()) && Objects.equals(getCorreoElectronico(), that.getCorreoElectronico()) && Objects.equals(getReservas(), that.getReservas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getApellidos(), getFechaNacimiento(), getGenero(), getDireccion(), getCorreoElectronico(), getReservas());
    }
}
