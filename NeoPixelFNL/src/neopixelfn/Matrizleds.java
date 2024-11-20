/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neopixelfn;



import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author losro
 */
public class Matrizleds {
   private leds[][] v= new leds[8][8];
   

    public Matrizleds() {
    }
    
    public void dibujar(Graphics g, JPanel p,int cuadA, int cuadB) {
        int posinix = p.getX()+7;
        int posiniy = p.getY()+30;
        int anchoCuadro = p.getWidth() / cuadA;
        int altoCuadro = p.getHeight() / cuadB;
            for (int fila = 0; fila < cuadB; fila++) {
                for (int col = 0 ; col < cuadA; col++) {
                    int x = posinix + col * anchoCuadro;
                    int y = posiniy + fila * altoCuadro;
                    int an = anchoCuadro;
                    int al = altoCuadro;
                    leds o1 = new leds(x,y,an,al);
                    v[fila][col]=o1;
                    g.drawRect(x,y,an,al);
                   
                }
            }
    }
    
    public void Borr(Graphics g, JPanel p,int cuadA, int cuadB) {
        int posinix = p.getX()+7;
        int posiniy = p.getY()+30;
        int anchoCuadro = p.getWidth() / cuadA;
        int altoCuadro = p.getHeight() / cuadB;
            for (int fila = 0; fila < cuadB; fila++) {
                for (int col = 0 ; col < cuadA; col++) {
                    int x = posinix + col * anchoCuadro;
                    int y = posiniy + fila * altoCuadro;
                    int an = anchoCuadro;
                    int al = altoCuadro;
                    leds o1 = new leds(x,y,an,al);
                    v[fila][col]=o1;
                    g.setColor(p.getBackground());
                    g.fillRect(x,y,an,al);
                    g.setColor(Color.black);
                    g.drawRect(x,y,an,al);
                    
                   
                }
            }
    }
    
                       //new Color(0,255,255),  new Color(193,255,77), new Color(255,231,77),  new Color(8,255,0),   new Color(240,255,0),   new Color(0,62,255),
                       //new Color(0,255,155),  new Color(162,255,0),  new Color(255,189,0),   new Color(255,0,170), new Color(231,76,60),   new Color(100,255,0),
                       //new Color(20,40,200),  new Color(255,128,0),  new Color(255,0,255),   new Color(51,200,100),new Color(151,0,255),   new Color(255,0,116)};
    
    public void creper(Graphics g, JPanel p,int cuadA, int cuadB) {
        int posinix = p.getX()+7;
        int posiniy = p.getY()+30;
        int anchoCuadro = p.getWidth() / cuadA;
        int altoCuadro = p.getHeight() / cuadB;
            for (int fila = 0; fila < cuadB; fila++) {
                for (int col = 0 ; col < cuadA; col++) {
                    int x = posinix + col * anchoCuadro;
                    int y = posiniy + fila * altoCuadro;
                    int an = anchoCuadro;
                    int al = altoCuadro;
                    leds o1 = new leds(x,y,an,al);
                    v[fila][col]=o1;
                    g.setColor(Color.GREEN);
                    g.fillRect(x,y,an,al);  
                }
            }
           g.setColor(new Color(153,0,255));
           g.fillRect(v[1][1].getPosinix(),v[1][1].getPosiniy(),v[1][1].getAncho(),v[1][1].getAlto()); g.fillRect(v[2][2].getPosinix(),v[2][2].getPosiniy(),v[2][2].getAncho(),v[2][2].getAlto()); 
           g.fillRect(v[1][2].getPosinix(),v[1][2].getPosiniy(),v[1][2].getAncho(),v[1][2].getAlto()); g.fillRect(v[1][5].getPosinix(),v[1][5].getPosiniy(),v[1][5].getAncho(),v[1][5].getAlto()); 
           g.fillRect(v[2][1].getPosinix(),v[2][1].getPosiniy(),v[2][1].getAncho(),v[2][1].getAlto()); g.fillRect(v[1][6].getPosinix(),v[1][6].getPosiniy(),v[1][6].getAncho(),v[1][6].getAlto()); 
           
           g.fillRect(v[2][5].getPosinix(),v[2][5].getPosiniy(),v[2][5].getAncho(),v[2][5].getAlto()); g.fillRect(v[3][4].getPosinix(),v[3][4].getPosiniy(),v[3][4].getAncho(),v[3][4].getAlto()); 
           g.fillRect(v[2][6].getPosinix(),v[2][6].getPosiniy(),v[2][6].getAncho(),v[2][6].getAlto()); g.fillRect(v[4][2].getPosinix(),v[4][2].getPosiniy(),v[4][2].getAncho(),v[4][2].getAlto()); 
           g.fillRect(v[3][3].getPosinix(),v[3][3].getPosiniy(),v[3][3].getAncho(),v[3][3].getAlto()); g.fillRect(v[4][3].getPosinix(),v[4][3].getPosiniy(),v[4][3].getAncho(),v[4][3].getAlto());
           
           g.fillRect(v[4][4].getPosinix(),v[4][4].getPosiniy(),v[4][4].getAncho(),v[4][4].getAlto()); g.fillRect(v[5][3].getPosinix(),v[5][3].getPosiniy(),v[5][3].getAncho(),v[5][3].getAlto()); 
           g.fillRect(v[4][5].getPosinix(),v[4][5].getPosiniy(),v[4][5].getAncho(),v[4][5].getAlto()); g.fillRect(v[5][4].getPosinix(),v[5][4].getPosiniy(),v[5][4].getAncho(),v[5][4].getAlto()); 
           g.fillRect(v[5][2].getPosinix(),v[5][2].getPosiniy(),v[5][2].getAncho(),v[5][2].getAlto()); g.fillRect(v[5][5].getPosinix(),v[5][5].getPosiniy(),v[5][5].getAncho(),v[5][5].getAlto());
           
           g.fillRect(v[6][2].getPosinix(),v[6][2].getPosiniy(),v[6][2].getAncho(),v[6][2].getAlto()); g.fillRect(v[6][5].getPosinix(),v[6][5].getPosiniy(),v[6][5].getAncho(),v[6][5].getAlto());  
    }
    
    public void capy(Graphics g, JPanel p,int cuadA, int cuadB) {
        int posinix = p.getX()+7;
        int posiniy = p.getY()+30;
        int anchoCuadro = p.getWidth() / cuadA;
        int altoCuadro = p.getHeight() / cuadB;
            for (int fila = 0; fila < cuadB; fila++) {
                for (int col = 0 ; col < cuadA; col++) {
                    int x = posinix + col * anchoCuadro;
                    int y = posiniy + fila * altoCuadro;
                    int an = anchoCuadro;
                    int al = altoCuadro;
                    leds o1 = new leds(x,y,an,al);
                    v[fila][col]=o1;
                    g.drawRect(x,y,an,al);  
                }
            }
           g.setColor(new Color(153,102,0));
           for(int i=0; i<6; i++){
               g.fillRect(v[6][i].getPosinix(),v[6][i].getPosiniy(),v[6][i].getAncho(),v[6][i].getAlto()); g.fillRect(v[6][i].getPosinix(),v[6][i].getPosiniy(),v[6][i].getAncho(),v[6][i].getAlto());
               g.fillRect(v[5][i].getPosinix(),v[5][i].getPosiniy(),v[5][i].getAncho(),v[5][i].getAlto()); g.fillRect(v[5][i].getPosinix(),v[5][i].getPosiniy(),v[5][i].getAncho(),v[5][i].getAlto());
               g.fillRect(v[4][i].getPosinix(),v[4][i].getPosiniy(),v[4][i].getAncho(),v[4][i].getAlto()); g.fillRect(v[4][i].getPosinix(),v[4][i].getPosiniy(),v[4][i].getAncho(),v[4][i].getAlto());
           }
           g.fillRect(v[4][6].getPosinix(),v[4][6].getPosiniy(),v[4][6].getAncho(),v[4][6].getAlto()); g.fillRect(v[4][6].getPosinix(),v[4][6].getPosiniy(),v[4][6].getAncho(),v[4][6].getAlto());
           g.fillRect(v[3][1].getPosinix(),v[3][1].getPosiniy(),v[3][1].getAncho(),v[3][1].getAlto()); g.fillRect(v[3][1].getPosinix(),v[3][1].getPosiniy(),v[3][1].getAncho(),v[3][1].getAlto());
           g.fillRect(v[3][2].getPosinix(),v[3][2].getPosiniy(),v[3][2].getAncho(),v[3][2].getAlto()); g.fillRect(v[3][2].getPosinix(),v[3][2].getPosiniy(),v[3][2].getAncho(),v[3][2].getAlto());
           g.fillRect(v[3][5].getPosinix(),v[3][5].getPosiniy(),v[3][5].getAncho(),v[3][5].getAlto()); g.fillRect(v[3][5].getPosinix(),v[3][5].getPosiniy(),v[3][1].getAncho(),v[3][5].getAlto());
           g.fillRect(v[2][3].getPosinix(),v[2][3].getPosiniy(),v[2][3].getAncho(),v[2][3].getAlto()); g.fillRect(v[2][3].getPosinix(),v[2][3].getPosiniy(),v[2][3].getAncho(),v[2][3].getAlto());
           g.fillRect(v[2][4].getPosinix(),v[2][4].getPosiniy(),v[2][4].getAncho(),v[2][4].getAlto()); g.fillRect(v[2][4].getPosinix(),v[2][4].getPosiniy(),v[2][4].getAncho(),v[2][4].getAlto());
           g.fillRect(v[2][5].getPosinix(),v[2][5].getPosiniy(),v[2][5].getAncho(),v[2][5].getAlto()); g.fillRect(v[2][5].getPosinix(),v[2][5].getPosiniy(),v[2][5].getAncho(),v[2][5].getAlto());
           
           g.setColor(new Color(102,0,102));
           g.fillRect(v[3][3].getPosinix(),v[3][3].getPosiniy(),v[3][3].getAncho(),v[3][3].getAlto()); g.fillRect(v[3][3].getPosinix(),v[3][3].getPosiniy(),v[3][3].getAncho(),v[3][3].getAlto());
           g.fillRect(v[3][4].getPosinix(),v[3][4].getPosiniy(),v[3][2].getAncho(),v[3][4].getAlto()); g.fillRect(v[3][4].getPosinix(),v[3][4].getPosiniy(),v[3][4].getAncho(),v[3][4].getAlto());
           
           g.setColor(new Color(102,102,102));
           for(int j=0; j<2; j++){
              g.fillRect(v[3][6+j].getPosinix(),v[3][6+j].getPosiniy(),v[3][6+j].getAncho(),v[3][6+j].getAlto()); g.fillRect(v[3][6+j].getPosinix(),v[3][6+j].getPosiniy(),v[3][6+j].getAncho(),v[3][6+j].getAlto()); 
              g.fillRect(v[2][6+j].getPosinix(),v[2][6+j].getPosiniy(),v[2][6+j].getAncho(),v[2][6+j].getAlto()); g.fillRect(v[2][6+j].getPosinix(),v[2][6+j].getPosiniy(),v[2][6+j].getAncho(),v[2][6+j].getAlto()); 
              
           }
           g.fillRect(v[4][7].getPosinix(),v[4][7].getPosiniy(),v[4][7].getAncho(),v[4][7].getAlto()); g.fillRect(v[4][7].getPosinix(),v[4][7].getPosiniy(),v[4][7].getAncho(),v[4][7].getAlto());
           g.fillRect(v[1][2].getPosinix(),v[1][2].getPosiniy(),v[1][2].getAncho(),v[1][2].getAlto()); g.fillRect(v[1][2].getPosinix(),v[1][2].getPosiniy(),v[1][2].getAncho(),v[1][2].getAlto());
           g.fillRect(v[1][4].getPosinix(),v[1][4].getPosiniy(),v[1][4].getAncho(),v[1][4].getAlto()); g.fillRect(v[1][4].getPosinix(),v[1][4].getPosiniy(),v[1][4].getAncho(),v[1][4].getAlto());
           
           g.fillRect(v[7][1].getPosinix(),v[7][1].getPosiniy(),v[7][1].getAncho(),v[7][1].getAlto()); g.fillRect(v[7][1].getPosinix(),v[7][1].getPosiniy(),v[7][1].getAncho(),v[7][1].getAlto());
           g.fillRect(v[7][3].getPosinix(),v[7][3].getPosiniy(),v[7][3].getAncho(),v[7][3].getAlto()); g.fillRect(v[7][3].getPosinix(),v[7][3].getPosiniy(),v[7][3].getAncho(),v[7][3].getAlto());
           g.fillRect(v[7][5].getPosinix(),v[7][5].getPosiniy(),v[7][5].getAncho(),v[7][5].getAlto()); g.fillRect(v[7][5].getPosinix(),v[7][5].getPosiniy(),v[7][5].getAncho(),v[7][5].getAlto());
           
           g.setColor(new Color(153,102,0));
           g.fillRect(v[3][2].getPosinix(),v[3][2].getPosiniy(),v[3][2].getAncho(),v[3][2].getAlto()); g.fillRect(v[3][2].getPosinix(),v[3][2].getPosiniy(),v[3][2].getAncho(),v[3][2].getAlto());
    }
    
    public void skuirtel(Graphics g, JPanel p,int cuadA, int cuadB) {
        int posinix = p.getX()+7;
        int posiniy = p.getY()+30;
        int anchoCuadro = p.getWidth() / cuadA;
        int altoCuadro = p.getHeight() / cuadB;
            for (int fila = 0; fila < cuadB; fila++) {
                for (int col = 0 ; col < cuadA; col++) {
                    int x = posinix + col * anchoCuadro;
                    int y = posiniy + fila * altoCuadro;
                    int an = anchoCuadro;
                    int al = altoCuadro;
                    leds o1 = new leds(x,y,an,al);
                    v[fila][col]=o1;
                    g.drawRect(x,y,an,al);  
                }
            }
           g.setColor(new Color(104,204,255));
           for(int i=0; i<5; i++){
               g.fillRect(v[1][3+i].getPosinix(),v[1][3+i].getPosiniy(),v[1][3+i].getAncho(),v[1][3+i].getAlto());
               g.fillRect(v[2][3+i].getPosinix(),v[2][3+i].getPosiniy(),v[2][3+i].getAncho(),v[2][3+i].getAlto());
               g.fillRect(v[3][3+i].getPosinix(),v[3][3+i].getPosiniy(),v[3][3+i].getAncho(),v[3][3+i].getAlto());
           }
           for(int j=0; j<7; j++){
               g.fillRect(v[4][j].getPosinix(),v[4][j].getPosiniy(),v[4][j].getAncho(),v[4][j].getAlto());
               g.fillRect(v[5][j].getPosinix(),v[5][j].getPosiniy(),v[5][j].getAncho(),v[5][j].getAlto());
           }
               g.fillRect(v[6][2].getPosinix(),v[6][2].getPosiniy(),v[6][2].getAncho(),v[6][2].getAlto());
               g.fillRect(v[6][5].getPosinix(),v[6][5].getPosiniy(),v[6][5].getAncho(),v[6][5].getAlto());
               
               //Amarillo
           
               g.setColor(new Color(255,255,51));
               for(int k=0; k<4; k++){
                   g.fillRect(v[4][3+k].getPosinix(),v[4][3+k].getPosiniy(),v[4][3+k].getAncho(),v[4][3+k].getAlto());
               }
               g.fillRect(v[5][4].getPosinix(),v[5][4].getPosiniy(),v[5][4].getAncho(),v[5][4].getAlto());
               g.fillRect(v[5][5].getPosinix(),v[5][5].getPosiniy(),v[5][5].getAncho(),v[5][5].getAlto());
               
               //naranja
               g.setColor(new Color(255,153,51));
               for(int l=0; l<4; l++){
                   g.fillRect(v[1+2][2].getPosinix(),v[1+2][2].getPosiniy(),v[1+2][2].getAncho(),v[1+2][2].getAlto());
               }
               for(int n=0; n<4; n++){
                   g.fillRect(v[2+n][2].getPosinix(),v[2+n][2].getPosiniy(),v[2+n][2].getAncho(),v[2+n][2].getAlto());
               }
               g.fillRect(v[1][2].getPosinix(),v[1][2].getPosiniy(),v[1][2].getAncho(),v[1][2].getAlto());
               g.fillRect(v[2][1].getPosinix(),v[2][1].getPosiniy(),v[2][1].getAncho(),v[2][1].getAlto());
               g.fillRect(v[3][1].getPosinix(),v[3][1].getPosiniy(),v[3][1].getAncho(),v[3][1].getAlto());
               g.fillRect(v[4][1].getPosinix(),v[4][1].getPosiniy(),v[4][1].getAncho(),v[4][1].getAlto());
               //Azul black
                g.setColor(new Color(102,0,255));
           g.fillRect(v[2][4].getPosinix(),v[2][4].getPosiniy(),v[2][4].getAncho(),v[2][4].getAlto()); 
           g.fillRect(v[2][7].getPosinix(),v[2][7].getPosiniy(),v[2][7].getAncho(),v[2][7].getAlto());
           
    }
    
    public void Icono (Graphics g, JPanel p,String h) {
        int posinix = p.getX();
        int posiniy = p.getY();
        int anchoCuadro = p.getWidth();
        int altoCuadro = p.getHeight();
                    int x = posinix;
                    int y = posiniy; 
                    int an = anchoCuadro;
                    int al = altoCuadro;
                    
                    ImageIcon img = new ImageIcon(getClass().getResource(h));
                    g.drawImage(img.getImage(), (x+anchoCuadro/2-15) ,(y+(anchoCuadro/2)+10),  an,al, null);
               
    }
    
    
    
    
    
   
    
    

    public leds[][] getV() {
        return v;
    }

    public void setV(leds[][] v) {
        this.v = v;
    }
    
    
    
}
