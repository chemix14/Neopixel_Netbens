/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neopixelfn;

/**
 *
 * @author losro
 */
public class leds {
    private int posinix;
    private int posiniy;
    private int ancho;
    private int alto;

    public leds(int posinix, int posiniy, int ancho, int alto) {
        this.posinix = posinix;
        this.posiniy = posiniy;
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getPosinix() {
        return posinix;
    }

    public int getPosiniy() {
        return posiniy;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setPosinix(int posinix) {
        this.posinix = posinix;
    }

    public void setPosiniy(int posiniy) {
        this.posiniy = posiniy;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    
}
