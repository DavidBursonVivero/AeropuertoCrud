package com.projectoCrud.controllers;

import com.projectoCrud.Dtos.PasajeroDto;
import com.projectoCrud.service.PasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "/pasajeros")
public class PasajeroController {
    @Autowired
    private PasajeroService pasajeroService;

    @GetMapping("/{id}")
    public PasajeroDto buscarPasajeroPorId(@PathVariable int id) {
        return pasajeroService.searchById(id);
    }

    @GetMapping
    public List<PasajeroDto> listarPasajeros() {
        return pasajeroService.listar();
    }

    @PostMapping
    public PasajeroDto agregarPasajero(@RequestBody PasajeroDto pasajeroDto) {
        return pasajeroService.save(pasajeroDto);
    }

    @PutMapping
    public PasajeroDto editarPasajero(@RequestBody PasajeroDto pasajeroDto) {
        return pasajeroService.edit(pasajeroDto);
    }

    @DeleteMapping("/{id}")
    public void eliminarPasajero(@PathVariable int id) {
        pasajeroService.delete(id);
    }

}
