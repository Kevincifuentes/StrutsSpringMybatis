package es.deusto.masf.appeventos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.deusto.masf.appeventos.domain.Evento;
import es.deusto.masf.appeventos.mappers.EventosMapper;

@Service
public class EventosService {

    @Autowired
    EventosMapper eventosMapper;

    public List<Evento> getEventosByTipo(String tipo){
        return eventosMapper.getListadoEventosByTipo(tipo);
    }

}