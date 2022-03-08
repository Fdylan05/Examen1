/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.entity;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Dylan
 */
@Entity
@Table (name="eventos")
public class Evento implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private int xostoEvento;
    private String fecha;
    private String lugar;
    private int maxCapacidad;
    
    @ManyToOne
    @JoinColumn(name = "id_artista")
    private Artista artista;

    public long getIdEvento() {
        return id;
    }

    public void setIdEvento(long idEvento) {
        this.id = idEvento;
    }

    public int getXostoEvento() {
        return xostoEvento;
    }

    public void setXostoEvento(int xostoEvento) {
        this.xostoEvento = xostoEvento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getMaxCapacidad() {
        return maxCapacidad;
    }

    public void setMaxCapacidad(int maxCapacidad) {
        this.maxCapacidad = maxCapacidad;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
    
}
