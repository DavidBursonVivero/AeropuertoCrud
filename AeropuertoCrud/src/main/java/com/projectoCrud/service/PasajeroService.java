package com.projectoCrud.service;

import com.projectoCrud.Dtos.PasajeroDto;
import com.projectoCrud.models.Pasajero;
import com.projectoCrud.repository.PasajeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PasajeroService {
    @Autowired
    private PasajeroRepository pasajeroRepository;

    private PasajeroDto convertEntityToDto(Pasajero pasajero, PasajeroDto pasajeroDto) {
        pasajeroDto.setId(pasajero.getId());
        pasajeroDto.setNombre(pasajero.getNombre());
        pasajeroDto.setApellidos(pasajero.getApellidos());
        pasajeroDto.setDireccion(pasajero.getDireccion());
        pasajeroDto.setGenero(pasajero.getGenero());
        pasajeroDto.setCorreoElectronico(pasajero.getCorreoElectronico());
        pasajeroDto.setFechaNacimiento(pasajero.getFechaNacimiento());
        pasajeroDto.setReservas(pasajero.getReservas());

        return pasajeroDto;
    }

    private Pasajero convertDtoToEntity(Pasajero pasajero, PasajeroDto pasajeroDto) {
        if (pasajero == null) {
            pasajero = new Pasajero();
        }
        pasajero.setId(pasajeroDto.getId());
        pasajero.setNombre(pasajeroDto.getNombre());
        pasajero.setApellidos(pasajeroDto.getApellidos());
        pasajero.setDireccion(pasajeroDto.getDireccion());
        pasajero.setGenero(pasajeroDto.getGenero());
        pasajero.setCorreoElectronico(pasajeroDto.getCorreoElectronico());
        pasajero.setFechaNacimiento(pasajeroDto.getFechaNacimiento());
        pasajero.setReservas(pasajeroDto.getReservas());
        return pasajero;
    }

    public List<PasajeroDto> listar() {
        List<Pasajero> pasajeros = pasajeroRepository.findAll();
        List<PasajeroDto> pasajeroDtos = new ArrayList<>();

        for (Pasajero pasajero : pasajeros) {
            pasajeroDtos.add(convertEntityToDto(pasajero, new PasajeroDto()));
        }
        return pasajeroDtos;
    }

    public Optional<Pasajero> listById(int id) {
        return pasajeroRepository.findById(id);
    }

    public PasajeroDto save(PasajeroDto pasajeroDto) {
        Pasajero pasajero = convertDtoToEntity(null, pasajeroDto);
        pasajeroRepository.save(pasajero);
        pasajeroDto = convertEntityToDto(pasajero, pasajeroDto);
        return pasajeroDto;
    }

    public PasajeroDto edit(PasajeroDto pasajeroDto) {
        Pasajero pasajero = pasajeroRepository.findById(pasajeroDto.getId()).get();
        convertDtoToEntity(pasajero, pasajeroDto);
        pasajeroRepository.save(pasajero);
        return pasajeroDto;
    }

    public void delete(int id) {
        pasajeroRepository.deleteById(id);
    }

    public PasajeroDto searchById(int id) {
        Pasajero pasajero = pasajeroRepository.findById(id).get();
        PasajeroDto pasajeroDto = new PasajeroDto();
        convertEntityToDto(pasajero, pasajeroDto);
        return pasajeroDto;
    }
}
