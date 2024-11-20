/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neopixelfn;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
/**
 *
 * @author losro
 */
public class Cordenadas {
    int x;
    int y;

    public Cordenadas() {
    }
    
    public int[] cordenadasmatriz (JPanel p, int xi, int yi,int numCAL, int numCAN) {
               int[] a= new int[2];
               int an = p.getWidth()/numCAN;
               int al = p.getHeight()/numCAL;
               for (int i=0; i<8 ; i++){
                   for (int j=0; j<8; j++){
                       if(xi > (j*an) && xi < ((j+1)*an) && yi > (i*al) && yi < ((i+1)*al)){
                        x=i; y=j;
                       
                        }
                   }  
               }
               
               a[1]=y;
               a[0]=x;
                 
               return a;     
    }
    
    public int[] cordenadasmatriz2 (JPanel p, int xi, int yi,int numCAL, int numCAN, leds[][] o1, Graphics g, Color c) {
        
                int[] a= new int[5];
                int an = p.getWidth()/numCAN;
                int al = p.getHeight()/numCAL;
                for (int i=0; i<8 ; i++){
                   for (int j=0; j<8; j++){
                       if(xi > (j*an) && xi < ((j+1)*an) && yi > (i*al) && yi < ((i+1)*al)){
                        x=i; y=j;
                        }
                   }  
                }
               
                int x1 = o1[x][y].getPosinix();
                int y1 = o1[x][y].getPosiniy();
                int alto = o1[x][y].getAncho();
                int ancho = o1[x][y].getAlto();
                
                int r =c.getRed();
                int g1=c.getGreen();
                int b =c.getBlue();
                
                g.setColor(c);
                g.fillRect(x1, y1, ancho, alto); 
                if(c==p.getBackground()){
                    a[0]=x;
                    a[1]=y; 
                    a[2]=0;
                    a[3]=0;
                    a[4]=0;
                }else{
                    a[0]=x;
                    a[1]=y; 
                    a[2]=r;
                    a[3]=g1;
                    a[4]=b;
                }
                
                
               
               return a;     
               
    }
      
}
