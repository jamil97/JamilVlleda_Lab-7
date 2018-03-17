/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication38;

/**
 *
 * @author Alexy
 */
public class Mensajes {
 
    private String IPorigen;
    private String IPdestino;
    private String titulo;
    private String contenido;

    public Mensajes() {
    }

    public Mensajes(String IPorigen, String IPdestino, String titulo, String contenido) {
        this.IPorigen = IPorigen;
        this.IPdestino = IPdestino;
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getIPorigen() {
        return IPorigen;
    }

    public void setIPorigen(String IPorigen) {
        this.IPorigen = IPorigen;
    }

    public String getIPdestino() {
        return IPdestino;
    }

    public void setIPdestino(String IPdestino) {
        this.IPdestino = IPdestino;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Mensajes{" + "IPorigen=" + IPorigen + ", IPdestino=" + IPdestino + ", titulo=" + titulo + ", contenido=" + contenido + '}';
    }
    
    
    
}
