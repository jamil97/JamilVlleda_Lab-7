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
public class PC {

    private String IP;
    private String mascara;
    private Router gateway;
    private ArrayList<Mensajes> mensajes = new ArrayList();

    public PC() {
    }

    public PC(String IP, String mascara, Router gateway) {
        this.IP = IP;
        this.mascara = mascara;
        this.gateway = gateway;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public Router getGateway() {
        return gateway;
    }

    public void setGateway(Router gateway) {
        this.gateway = gateway;
    }

    public ArrayList<Mensajes> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensajes> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return "PC{" + "IP=" + IP + ", mascara=" + mascara + ", gateway=" + gateway + ", mensajes=" + mensajes + '}';
    }
    
    

}
