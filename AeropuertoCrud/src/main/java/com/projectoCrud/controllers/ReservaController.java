package com.projectoCrud.controllers;
import com.projectoCrud.Dtos.ReservaDto;
import com.projectoCrud.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @GetMapping("/{id}")
    public ReservaDto buscarReservaPorId(@PathVariable int id) {
        return reservaService.searchById(id);
    }

    @GetMapping
    public List<ReservaDto> listarReservas() {
        return reservaService.listar();
    }

    @PostMapping
    public ReservaDto agregarReserva(@RequestBody ReservaDto reservaDto) {
        return reservaService.save(reservaDto);
    }

    @PutMapping
    public ReservaDto editarReserva(@RequestBody ReservaDto reservaDto) {
        return reservaService.edit(reservaDto);
    }

    @DeleteMapping("/{id}")
    public void eliminarReserva(@PathVariable int id) {
        reservaService.delete(id);
    }
}

