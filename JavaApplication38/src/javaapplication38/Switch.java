/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication38;

import java.util.ArrayList;

/**
 *
 * @author Alexy
 */
public class Switch {
 
    private String nombre;
    private int VelocidadTransmision;
    private int VelocidadRecepcion;
    private Router r;
    private S1 s1 = new S1();
    private S2 s2 = new S2();
    
    private ArrayList <PC> pc = new ArrayList();

    public Switch() {   
        
    }
    
    

    public Switch(String nombre, int VelocidadTransmision, int VelocidadRecepcion, Router r, S1 s1) {
        this.nombre = nombre;
        this.VelocidadTransmision = VelocidadTransmision;
        this.VelocidadRecepcion = VelocidadRecepcion;
        this.r = r;
        this.s1 = s1;
        this.s1.setVisible(true);
        
       
        
        
        
        
    }

    public Switch(String nombre, int VelocidadTransmision, int VelocidadRecepcion, Router r, S2 s2) {
        this.nombre = nombre;
        this.VelocidadTransmision = VelocidadTransmision;
        this.VelocidadRecepcion = VelocidadRecepcion;
        this.r = r;
        this.s2 = s2;
        this.s2.setVisible(true);
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidadTransmision() {
        return VelocidadTransmision;
    }

    public void setVelocidadTransmision(int VelocidadTransmision) {
        this.VelocidadTransmision = VelocidadTransmision;
    }

    public int getVelocidadRecepcion() {
        return VelocidadRecepcion;
    }

    public void setVelocidadRecepcion(int VelocidadRecepcion) {
        this.VelocidadRecepcion = VelocidadRecepcion;
    }

    public Router getR() {
        return r;
    }

    public void setR(Router r) {
        this.r = r;
    }

    public ArrayList<PC> getPc() {
        return pc;
    }

    public void setPc(ArrayList<PC> pc) {
        this.pc = pc;
    }

    @Override
    public String toString() {
        return "Switch{" + "nombre=" + nombre + ", VelocidadTransmision=" + VelocidadTransmision + ", VelocidadRecepcion=" + VelocidadRecepcion + ", r=" + r + ", pc=" + pc + '}';
    }
    
    
}
