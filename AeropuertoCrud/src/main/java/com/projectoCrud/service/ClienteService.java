package com.projectoCrud.service;

import com.projectoCrud.Dtos.ClienteDto;
import com.projectoCrud.models.Cliente;
import com.projectoCrud.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    private ClienteDto convertEntityToDto(Cliente cliente, ClienteDto clienteDto) {
        clienteDto.setId(cliente.getId());
        clienteDto.setNombre(cliente.getNombre());
        clienteDto.setApellidos(cliente.getApellidos());
        clienteDto.setCorreoElectronico(cliente.getCorreoElectronico());
        clienteDto.setFechaNacimiento(cliente.getFechaNacimiento());
        clienteDto.setGenero(cliente.getGenero());
        clienteDto.setReservas(cliente.getReservas());
        return clienteDto;
    }

    private Cliente convertDtoToEntity(Cliente cliente, ClienteDto clienteDto) {
        if (cliente == null) {
            cliente = new Cliente();
        }
        cliente.setId(clienteDto.getId());
        cliente.setNombre(clienteDto.getNombre());
        cliente.setApellidos(clienteDto.getApellidos());
        cliente.setCorreoElectronico(clienteDto.getCorreoElectronico());
        cliente.setFechaNacimiento(clienteDto.getFechaNacimiento());
        cliente.setGenero(clienteDto.getGenero());
        cliente.setReservas(clienteDto.getReservas());
        return cliente;
    }

    public List<ClienteDto> listar() {
        List<Cliente> clientes = clienteRepository.findAll();
        List<ClienteDto> clienteDtos = new ArrayList<>();

        for (Cliente cliente : clientes) {
            clienteDtos.add(convertEntityToDto(cliente, new ClienteDto()));
        }
        return clienteDtos;
    }

    public Optional<Cliente> listById(int id) {
        return clienteRepository.findById(id);
    }

    public ClienteDto save(ClienteDto clienteDto) {
        Cliente cliente = convertDtoToEntity(null, clienteDto);
        clienteRepository.save(cliente);
        clienteDto = convertEntityToDto(cliente, clienteDto);
        return clienteDto;
    }

    public ClienteDto edit(ClienteDto clienteDto) {
        Cliente cliente = clienteRepository.findById(clienteDto.getId()).get();
        convertDtoToEntity(cliente, clienteDto);
        clienteRepository.save(cliente);
        return clienteDto;
    }

    public void delete(int id) {
        clienteRepository.deleteById(id);
    }

    public ClienteDto searchById(int id) {
        Cliente cliente = clienteRepository.findById(id).get();
        ClienteDto clienteDto = new ClienteDto();
        convertEntityToDto(cliente, clienteDto);
        return clienteDto;
    }
}
