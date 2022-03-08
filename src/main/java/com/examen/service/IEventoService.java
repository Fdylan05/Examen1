/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.examen.service;

import com.examen.entity.Evento;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dylan
 */
@Repository
public interface IEventoService {
    public List<Evento> getAllEvento();
    public void saveEvento(Evento evento);
    public Evento getEventoById(long id);
    public void delete(long id);
}
