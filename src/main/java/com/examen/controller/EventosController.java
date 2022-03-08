/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.controller;

import com.examen.entity.Evento;
import com.examen.service.IEventoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Dylan
 */
@Controller
public class EventosController {

    @Autowired
    private IEventoService eventoService;

    @GetMapping("/eventos")
    public String index(Model model) {
        List<Evento> listaEventos = eventoService.getAllEvento();
        model.addAttribute("titulo", "Eventos");
        model.addAttribute("eventos", listaEventos);
        return "eventos";
    }
    
    @GetMapping("/Crear_Eventos")
    public String crearEvento(Model model){
        model.addAttribute("evento", new Evento());
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarEvento(@ModelAttribute Evento evento){
        eventoService.saveEvento(evento);
        return "redirect:/personas";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarEvento(@PathVariable("id") Long idEvento){
        eventoService.delete(idEvento);
        return "redirect:/Eventos";
    }
}
