package com.projectoCrud.Dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.projectoCrud.models.Empleado;
import com.projectoCrud.models.Vuelo;

;import java.io.Serializable;
import java.util.List;

public class AerolineaDto implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1l;
    @JsonProperty("id")
     int id;
    @JsonProperty("nombre")
     String nombre;
    @JsonProperty("codigo")
     String codigo;
    @JsonProperty("vuelos")
     List<Vuelo> vuelos;
    @JsonProperty("empleados")
     List<Empleado> empleados;

    public AerolineaDto() {
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
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
