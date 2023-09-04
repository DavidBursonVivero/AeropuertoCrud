package com.projectoCrud.service;

import com.projectoCrud.Dtos.ReservaDto;
import com.projectoCrud.models.Reserva;
import com.projectoCrud.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    private ReservaDto convertEntityToDto(Reserva reserva, ReservaDto reservaDto) {
        reservaDto.setId(reserva.getId());
        reservaDto.setFechaReserva(reserva.getFechaReserva());
        reservaDto.setPasajero(reserva.getPasajero());
        reservaDto.setVuelo(reserva.getVuelo());
        reservaDto.setNumeroAsiento(reserva.getNumeroAsiento());
        return reservaDto;
    }

    private Reserva convertDtoToEntity(Reserva reserva, ReservaDto reservaDto) {
        if (reserva == null) {
            reserva = new Reserva();
        }
        reserva.setId(reservaDto.getId());
        reserva.setFechaReserva(reservaDto.getFechaReserva());
        reserva.setPasajero(reservaDto.getPasajero());
        reserva.setVuelo(reservaDto.getVuelo());
        reserva.setNumeroAsiento(reservaDto.getNumeroAsiento());
        return reserva;
    }

    public List<ReservaDto> listar() {
        List<Reserva> reservas = reservaRepository.findAll();
        List<ReservaDto> reservaDtos = new ArrayList<>();

        for (Reserva reserva : reservas) {
            reservaDtos.add(convertEntityToDto(reserva, new ReservaDto()));
        }
        return reservaDtos;
    }

    public Optional<Reserva> listById(int id) {
        return reservaRepository.findById(id);
    }

    public ReservaDto save(ReservaDto reservaDto) {
        Reserva reserva = convertDtoToEntity(null, reservaDto);
        reservaRepository.save(reserva);
        reservaDto = convertEntityToDto(reserva, reservaDto);
        return reservaDto;
    }

    public ReservaDto edit(ReservaDto reservaDto) {
        Reserva reserva = reservaRepository.findById(reservaDto.getId()).get();
        convertDtoToEntity(reserva, reservaDto);
        reservaRepository.save(reserva);
        return reservaDto;
    }

    public void delete(int id) {
        reservaRepository.deleteById(id);
    }

    public ReservaDto searchById(int id) {
        Reserva reserva = reservaRepository.findById(id).get();
        ReservaDto reservaDto = new ReservaDto();
        convertEntityToDto(reserva, reservaDto);
        return reservaDto;
    }
}
