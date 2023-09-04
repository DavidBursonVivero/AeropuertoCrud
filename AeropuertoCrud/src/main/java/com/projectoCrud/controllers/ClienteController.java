package com.projectoCrud.controllers;

import com.projectoCrud.Dtos.ClienteDto;
import com.projectoCrud.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{id}")
    public ClienteDto buscarClientePorId(@PathVariable int id) {
        return clienteService.searchById(id);
    }

    @GetMapping
    public List<ClienteDto> listarClientes() {
        return clienteService.listar();
    }

    @PostMapping
    public ClienteDto agregarCliente(@RequestBody ClienteDto clienteDto) {
        return clienteService.save(clienteDto);
    }

    @PutMapping
    public ClienteDto editarCliente( @RequestBody ClienteDto clienteDto) {
        return clienteService.edit(clienteDto);
    }

    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable int id) {
        clienteService.delete(id);
    }

}
