package com.projectoCrud.controllers;

import com.projectoCrud.Dtos.AeropuertoDto;
import com.projectoCrud.service.AeropuertoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "/aeropuertos")
public class AeropuertoController {
    @Autowired
    private AeropuertoService aeropuertoService;

    @GetMapping("/{id}")
    public AeropuertoDto searchAeropuertoById(@PathVariable int id) {
        return aeropuertoService.searchById(id);
    }

    @GetMapping
    public List<AeropuertoDto> listOfAeropuertos() {
        return aeropuertoService.listar();
    }

    @PostMapping
    public AeropuertoDto addAeropuerto(@RequestBody AeropuertoDto aeropuertoDto) {
        return aeropuertoService.save(aeropuertoDto);
    }

    @PutMapping
    public AeropuertoDto editAeropuerto( @RequestBody AeropuertoDto aeropuertoDto) {
        return aeropuertoService.edit(aeropuertoDto);
    }

    @DeleteMapping("/{id}")
    public void deleteAeropuerto(@PathVariable int id) {
        aeropuertoService.delete(id);
    }
}
