package com.projectoCrud.service;

import com.projectoCrud.Dtos.VueloDto;
import com.projectoCrud.models.Vuelo;
import com.projectoCrud.repository.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VueloService {
    @Autowired
    private VueloRepository vueloRepository;

    private VueloDto convertEntityToDto(Vuelo vuelo, VueloDto vueloDto) {
        vueloDto.setId(vuelo.getId());
        vueloDto.setFechaSalida(vuelo.getFechaSalida());
        vueloDto.setAerolinea(vuelo.getAerolinea());
        vueloDto.setDuracionVuelo(vuelo.getDuracionVuelo());
        vueloDto.setAeropuertoDestino(vuelo.getAeropuertoDestino());
        vueloDto.setNumeroVuelo(vuelo.getNumeroVuelo());
        vueloDto.setAeropuertoOrigen(vuelo.getAeropuertoOrigen());
        vueloDto.setCapacidadAsientos(vuelo.getCapacidadAsientos());
        vueloDto.setDestino(vuelo.getDestino());
        vueloDto.setOrigen(vuelo.getOrigen());
        vueloDto.setPrecioBillete(vuelo.getPrecioBillete());
        return vueloDto;
    }

    private Vuelo convertDtoToEntity(Vuelo vuelo, VueloDto vueloDto) {
        if (vuelo == null) {
            vuelo = new Vuelo();
        }
        vuelo.setId(vueloDto.getId());
        vuelo.setFechaSalida(vueloDto.getFechaSalida());
        vuelo.setAerolinea(vueloDto.getAerolinea());
        vuelo.setDuracionVuelo(vueloDto.getDuracionVuelo());
        vuelo.setAeropuertoDestino(vueloDto.getAeropuertoDestino());
        vuelo.setNumeroVuelo(vueloDto.getNumeroVuelo());
        vuelo.setAeropuertoOrigen(vueloDto.getAeropuertoOrigen());
        vuelo.setCapacidadAsientos(vueloDto.getCapacidadAsientos());
        vuelo.setDestino(vueloDto.getDestino());
        vuelo.setOrigen(vueloDto.getOrigen());
        vuelo.setPrecioBillete(vueloDto.getPrecioBillete());
        return vuelo;
    }

    public List<VueloDto> list() {
        List<Vuelo> vuelos = vueloRepository.findAll();
        List<VueloDto> vueloDtos = new ArrayList<>();

        for (Vuelo vuelo : vuelos) {
            vueloDtos.add(convertEntityToDto(vuelo, new VueloDto()));
        }
        return vueloDtos;
    }

    public Optional<Vuelo> listById (int id) {
        return vueloRepository.findById(id);
    }

    public VueloDto save(VueloDto vueloDto) {
        Vuelo vuelo = convertDtoToEntity(null, vueloDto);
        vueloRepository.save(vuelo);
        vueloDto = convertEntityToDto(vuelo, vueloDto);
        return vueloDto;
    }

    public VueloDto edit(VueloDto vueloDto) {
        Vuelo vuelo = vueloRepository.findById(vueloDto.getId()).get();
        convertDtoToEntity(vuelo, vueloDto);
        vueloRepository.save(vuelo);
        return vueloDto;
    }

    public void delete(int id) {
        vueloRepository.deleteById(id);
    }

    public VueloDto searchById(int id) {
        Vuelo vuelo = vueloRepository.findById(id).get();
        VueloDto vueloDto = new VueloDto();
        convertEntityToDto(vuelo, vueloDto);
        return vueloDto;
    }
}
