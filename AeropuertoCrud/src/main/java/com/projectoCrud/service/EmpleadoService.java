package com.projectoCrud.service;

import com.projectoCrud.Dtos.EmpleadoDto;
import com.projectoCrud.models.Empleado;
import com.projectoCrud.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    private EmpleadoDto convertEntityToDto(Empleado empleado, EmpleadoDto empleadoDto) {
        empleadoDto.setId(empleado.getId());
        empleadoDto.setNombre(empleado.getNombre());
        empleadoDto.setApellidos(empleado.getApellidos());
        empleadoDto.setAerolinea(empleado.getAerolinea());
        empleadoDto.setDireccion(empleado.getDireccion());
        empleadoDto.setCorreoElectronico(empleado.getCorreoElectronico());
        empleadoDto.setFechaContratacion(empleado.getFechaContratacion());
        empleadoDto.setPuestoTrabajo(empleado.getPuestoTrabajo());
        empleadoDto.setSalario(empleado.getSalario());
        return empleadoDto;
    }

    private Empleado convertDtoToEntity(Empleado empleado, EmpleadoDto empleadoDto) {
        if (empleado == null) {
            empleado = new Empleado();
        }
        empleado.setId(empleadoDto.getId());
        empleado.setNombre(empleadoDto.getNombre());
        empleado.setApellidos(empleadoDto.getApellidos());
        empleado.setAerolinea(empleadoDto.getAerolinea());
        empleado.setDireccion(empleadoDto.getDireccion());
        empleado.setCorreoElectronico(empleadoDto.getCorreoElectronico());
        empleado.setFechaContratacion(empleadoDto.getFechaContratacion());
        empleado.setPuestoTrabajo(empleadoDto.getPuestoTrabajo());
        empleado.setSalario(empleadoDto.getSalario());
        return empleado;
    }

    public List<EmpleadoDto> listar() {
        List<Empleado> empleados = empleadoRepository.findAll();
        List<EmpleadoDto> empleadoDtos = new ArrayList<>();

        for (Empleado empleado : empleados) {
            empleadoDtos.add(convertEntityToDto(empleado, new EmpleadoDto()));
        }
        return empleadoDtos;
    }

    public Optional<Empleado> listById(int id) {
        return empleadoRepository.findById(id);
    }

    public EmpleadoDto save(EmpleadoDto empleadoDto) {
        Empleado empleado = convertDtoToEntity(null, empleadoDto);
        empleadoRepository.save(empleado);
        empleadoDto = convertEntityToDto(empleado, empleadoDto);
        return empleadoDto;
    }

    public EmpleadoDto edit(EmpleadoDto empleadoDto) {
        Empleado empleado = empleadoRepository.findById(empleadoDto.getId()).get();
        convertDtoToEntity(empleado, empleadoDto);
        empleadoRepository.save(empleado);
        return empleadoDto;
    }

    public void delete(int id) {
        empleadoRepository.deleteById(id);
    }

    public EmpleadoDto searchById(int id) {
        Empleado empleado = empleadoRepository.findById(id).get();
        EmpleadoDto empleadoDto = new EmpleadoDto();
        convertEntityToDto(empleado, empleadoDto);
        return empleadoDto;
    }
}
