package com.projectoCrud.controllers;



import com.projectoCrud.Dtos.AerolineaDto;
import com.projectoCrud.service.AerolineaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/aerolinea")
public class AerolineaController {

    @Autowired
    private AerolineaService aerolineaService;

    @GetMapping("/{id}")
    public AerolineaDto buscar (@PathVariable int id) {
        return aerolineaService.searchById(id);
    }

    @GetMapping
    public List<AerolineaDto> findAerolineas() {
        return aerolineaService.list();
    }

    @PostMapping
    public AerolineaDto addAerolinea (@RequestBody AerolineaDto aerolineaDto) {
        return aerolineaService.save(aerolineaDto);
    }

    @PutMapping
    public AerolineaDto editAerolinea(@RequestBody AerolineaDto aerolineaDto) {
        return aerolineaService.edit(aerolineaDto);
    }

    @DeleteMapping("/{id}")
    public void deleteAerolinea(@PathVariable int id) {
        aerolineaService.delete(id);
    }
}
