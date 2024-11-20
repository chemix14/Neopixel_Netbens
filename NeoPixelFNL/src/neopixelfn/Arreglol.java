/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neopixelfn;

/**
 *
 * @author losro
 */
public class Arreglol {
    private int numled;
    private int r;
    private int g;
    private int b;

    public Arreglol(int numled, int r, int g, int b) {
        this.numled = numled;
        this.r = r;
        this.g = g;
        this.b = b;
    }
    
   

    public int getNumled() {
        return numled;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    public void setNumled(int numled) {
        this.numled = numled;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setG(int g) {
        this.g = g;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    
}
