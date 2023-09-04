package com.projectoCrud.controllers;

import com.projectoCrud.Dtos.VueloDto;
import com.projectoCrud.service.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "/vuelos")
public class VueloController {

    @Autowired
    private VueloService vueloService;

    @GetMapping("/{id}")
    public VueloDto buscarVueloPorId(@PathVariable int id) {
        return vueloService.searchById(id);
    }

    @GetMapping
    public List <VueloDto> listarVuelos() {
        return vueloService.list();
    }

    @PostMapping
    public VueloDto agregarVuelo(@RequestBody VueloDto vueloDto) {
        return vueloService.save(vueloDto);
    }

    @PutMapping
    public VueloDto editarVuelo(@RequestBody VueloDto vueloDto) {
        return vueloService.edit(vueloDto);
    }

    @DeleteMapping("/{id}")
    public void eliminarVuelo(@PathVariable int id) {
        vueloService.delete(id);
    }
}

