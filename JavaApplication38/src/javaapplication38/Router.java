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
public class Router {

    private String IP;
    private String Mascara;
    private Switch s;
    private String protocolo;
    private int velocidadTransmision;
    private int velocidadRecepcion;
    private ArrayList<Router> routers = new ArrayList();

    public Router() {
        
    }

    public Router(String IP, String Mascara, Switch s, String protocolo, int velocidadTransmision, int velocidadRecepcion) {
        this.IP = IP;
        this.Mascara = Mascara;
        this.s = s;
        this.protocolo = protocolo;
        this.velocidadTransmision = velocidadTransmision;
        this.velocidadRecepcion = velocidadRecepcion;
       
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getMascara() {
        return Mascara;
    }

    public void setMascara(String Mascara) {
        this.Mascara = Mascara;
    }

    public Switch getS() {
        return s;
    }

    public void setS(Switch s) {
        this.s = s;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public int getVelocidadTransmision() {
        return velocidadTransmision;
    }

    public void setVelocidadTransmision(int velocidadTransmision) {
        this.velocidadTransmision = velocidadTransmision;
    }

    public int getVelocidadRecepcion() {
        return velocidadRecepcion;
    }

    public void setVelocidadRecepcion(int velocidadRecepcion) {
        this.velocidadRecepcion = velocidadRecepcion;
    }

    public ArrayList<Router> getRouters() {
        return routers;
    }

    public void setRouters(ArrayList<Router> routers) {
        this.routers = routers;
    }

    @Override
    public String toString() {
        return "Router{" + "IP=" + IP + ", Mascara=" + Mascara + ", s=" + s + ", protocolo=" + protocolo + ", velocidadTransmision=" + velocidadTransmision + ", velocidadRecepcion=" + velocidadRecepcion + ", routers=" + routers + '}';
    }

}
