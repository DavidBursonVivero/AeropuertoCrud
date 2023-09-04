package com.projectoCrud.service;

import com.projectoCrud.Dtos.AerolineaDto;
import com.projectoCrud.models.Aerolinea;
import com.projectoCrud.repository.AerolineaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AerolineaService {

    @Autowired
    private AerolineaRepository aerolineaRepository;

    private AerolineaDto convertEntityToDto (Aerolinea aerolinea, AerolineaDto aerolineaDto){
        aerolineaDto.setId(aerolinea.getId());
        aerolineaDto.setCodigo(aerolinea.getCodigo());
        aerolineaDto.setNombre(aerolinea.getNombre());
        aerolineaDto.setEmpleados(aerolinea.getEmpleados());
        aerolineaDto.setVuelos(aerolinea.getVuelos());
        return aerolineaDto;
    }

    private Aerolinea convertDtoToEntity (Aerolinea aerolinea, AerolineaDto aerolineaDto){
        if(aerolinea == null){
            aerolinea= new Aerolinea();
        }
        aerolinea.setId(aerolineaDto.getId());
        aerolinea.setCodigo(aerolineaDto.getCodigo());
        aerolinea.setNombre(aerolineaDto.getNombre());
        aerolinea.setEmpleados(aerolineaDto.getEmpleados());
        aerolinea.setVuelos(aerolineaDto.getVuelos());

        return aerolinea;
    }


    public List<AerolineaDto> list(){
        List<Aerolinea> aerolineas = aerolineaRepository.findAll();
        List <AerolineaDto> aerolineaDto = new ArrayList<>();

        for( Aerolinea a : aerolineas ){
            aerolineaDto.add(convertEntityToDto(a, new AerolineaDto()));
        }
        return aerolineaDto;
    }

    public Optional<Aerolinea> listById(int id){
        return aerolineaRepository.findById(id);
    }

    public AerolineaDto save (AerolineaDto aerolineaDto){
        Aerolinea aerolinea = convertDtoToEntity(null, aerolineaDto);
        aerolineaRepository.save(aerolinea);
        aerolineaDto=convertEntityToDto(aerolinea, aerolineaDto);
        return aerolineaDto;
    }

    public AerolineaDto edit (AerolineaDto aerolineaDto){
        Aerolinea aerolinea = aerolineaRepository.findById(aerolineaDto.getId()).get();
        convertDtoToEntity(aerolinea,aerolineaDto);
        aerolineaRepository.save(aerolinea);
        return aerolineaDto;
    }

    public void delete (int id){
        aerolineaRepository.deleteById(id);
    }

    public AerolineaDto searchById(int id){
        Aerolinea aerolinea = aerolineaRepository.findById(id).get();
        AerolineaDto aerolineaDto = new AerolineaDto();
        convertEntityToDto(aerolinea, aerolineaDto);
        return aerolineaDto;
    }

}
