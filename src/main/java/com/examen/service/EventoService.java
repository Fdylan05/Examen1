/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.service;

import com.examen.entity.Evento;
import java.util.List;
import com.examen.repository.EventoRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Dylan
 */
@Service
public class EventoService implements IEventoService{
    
    @Autowired
    private EventoRepository eventoRepository;
    
    @Override
    public List<Evento> getAllEvento(){
        return (List<Evento>)eventoRepository.findAll();
    }
    
    @Override
    public void saveEvento(Evento evento){
        eventoRepository.save(evento);
    }
    
    @Override
    public Evento getEventoById(long id){
        return eventoRepository.findById(id).orElse(null);
    }
    
    @Override
    public void delete(long id){
        eventoRepository.deleteById(id);
    }
    
}
