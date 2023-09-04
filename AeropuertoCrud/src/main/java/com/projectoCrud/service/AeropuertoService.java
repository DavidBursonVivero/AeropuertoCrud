package com.projectoCrud.service;

import com.projectoCrud.Dtos.AeropuertoDto;
import com.projectoCrud.models.Aeropuerto;
import com.projectoCrud.repository.AeropuertoRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AeropuertoService {
    @Autowired
    private AeropuertoRepositoy aeropuertoRepositoy;

    private AeropuertoDto convertEntityToDto(Aeropuerto aeropuerto, AeropuertoDto aeropuertoDto) {
        aeropuertoDto.setId(aeropuerto.getId());
        aeropuertoDto.setCodigoAeropuerto(aeropuerto.getCodigoAeropuerto());
        aeropuertoDto.setCiudad(aeropuerto.getCiudad());
        aeropuertoDto.setNombreAeropuerto(aeropuerto.getNombreAeropuerto());
        aeropuertoDto.setVuelosDesdeAeropuerto(aeropuerto.getVuelosDesdeAeropuerto());
        aeropuertoDto.setPais(aeropuerto.getPais());
        aeropuertoDto.setVuelosHaciaAeropuerto(aeropuerto.getVuelosHaciaAeropuerto());

        return aeropuertoDto;
    }

    private Aeropuerto convertDtoToEntity(Aeropuerto aeropuerto, AeropuertoDto aeropuertoDto) {
        if (aeropuerto == null) {
            aeropuerto = new Aeropuerto();
        }
        aeropuerto.setId(aeropuertoDto.getId());
        aeropuerto.setCodigoAeropuerto(aeropuertoDto.getCodigoAeropuerto());
        aeropuerto.setCiudad(aeropuertoDto.getCiudad());
        aeropuerto.setNombreAeropuerto(aeropuertoDto.getNombreAeropuerto());
        aeropuerto.setVuelosDesdeAeropuerto(aeropuertoDto.getVuelosDesdeAeropuerto());
        aeropuerto.setPais(aeropuertoDto.getPais());
        aeropuerto.setVuelosHaciaAeropuerto(aeropuertoDto.getVuelosHaciaAeropuerto());

        return aeropuerto;
    }

    public List<AeropuertoDto> listar() {
        List<Aeropuerto> aeropuertos = aeropuertoRepositoy.findAll();
        List<AeropuertoDto> aeropuertoDto = new ArrayList<>();

        for (Aeropuerto a : aeropuertos) {
            aeropuertoDto.add(convertEntityToDto(a, new AeropuertoDto()));
        }
        return aeropuertoDto;
    }

    public Optional<Aeropuerto> listById(int id) {
        return aeropuertoRepositoy.findById(id);
    }

    public AeropuertoDto save(AeropuertoDto aeropuertoDto) {
        Aeropuerto aeropuerto = convertDtoToEntity(null, aeropuertoDto);
        aeropuertoRepositoy.save(aeropuerto);
        aeropuertoDto = convertEntityToDto(aeropuerto, aeropuertoDto);
        return aeropuertoDto;
    }

    public AeropuertoDto edit(AeropuertoDto aeropuertoDto) {
        Aeropuerto aeropuerto = aeropuertoRepositoy.findById(aeropuertoDto.getId()).get();
        convertDtoToEntity(aeropuerto, aeropuertoDto);
        aeropuertoRepositoy.save(aeropuerto);
        return aeropuertoDto;
    }

    public void delete(int id) {
        aeropuertoRepositoy.deleteById(id);
    }

    public AeropuertoDto searchById(int id) {
        Aeropuerto aeropuerto = aeropuertoRepositoy.findById(id).get();
        AeropuertoDto aeropuertoDto = new AeropuertoDto();
        convertEntityToDto(aeropuerto, aeropuertoDto);
        return aeropuertoDto;
    }
}

