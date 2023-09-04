package com.projectoCrud.controllers;

import com.projectoCrud.Dtos.EmpleadoDto;
import com.projectoCrud.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "/empleados")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/{id}")
    public EmpleadoDto buscarEmpleadoPorId(@PathVariable int id) {
        return empleadoService.searchById(id);
    }

    @GetMapping
    public List<EmpleadoDto> listarEmpleados() {
        return empleadoService.listar();
    }

    @PostMapping
    public EmpleadoDto agregarEmpleado(@RequestBody EmpleadoDto empleadoDto) {
        return empleadoService.save(empleadoDto);
    }

    @PutMapping
    public EmpleadoDto editarEmpleado(@RequestBody EmpleadoDto empleadoDto) {
        return empleadoService.edit(empleadoDto);
    }

    @DeleteMapping("/{id}")
    public void eliminarEmpleado(@PathVariable int id) {
        empleadoService.delete(id);
    }
}
