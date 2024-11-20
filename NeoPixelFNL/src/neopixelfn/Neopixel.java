/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neopixelfn;

/**
 *
 * @author losro
 */
public class Neopixel {
    private Arreglol[][] b = new Arreglol[8][8];
    
    public Neopixel() {
        this.b[0][0] =  new Arreglol(1,0,0,0);
        this.b[0][1] =  new Arreglol(2,0,0,0);
        this.b[0][2] =  new Arreglol(3,0,0,0);
        this.b[0][3] =  new Arreglol(4,0,0,0);
        this.b[0][4] =  new Arreglol(5,0,0,0);
        this.b[0][5] =  new Arreglol(6,0,0,0);
        this.b[0][6] =  new Arreglol(7,0,0,0);
        this.b[0][7] =  new Arreglol(8,0,0,0);
  
        this.b[1][0] =  new Arreglol(9,0,0,0);
        this.b[1][1] =  new Arreglol(10,0,0,0);
        this.b[1][2] =  new Arreglol(11,0,0,0);
        this.b[1][3] =  new Arreglol(12,0,0,0);
        this.b[1][4] =  new Arreglol(13,0,0,0);
        this.b[1][5] =  new Arreglol(14,0,0,0);
        this.b[1][6] =  new Arreglol(15,0,0,0);
        this.b[1][7] =  new Arreglol(16,0,0,0);
        
        
        this.b[2][0] =  new Arreglol(17,0,0,0);
        this.b[2][1] =  new Arreglol(18,0,0,0);
        this.b[2][2] =  new Arreglol(19,0,0,0);
        this.b[2][3] =  new Arreglol(20,0,0,0);
        this.b[2][4] =  new Arreglol(21,0,0,0);
        this.b[2][5] =  new Arreglol(22,0,0,0);
        this.b[2][6] =  new Arreglol(23,0,0,0);
        this.b[2][7] =  new Arreglol(24,0,0,0);
        
  
        this.b[3][0] =  new Arreglol(25,0,0,0);
        this.b[3][1] =  new Arreglol(26,0,0,0);
        this.b[3][2] =  new Arreglol(27,0,0,0);
        this.b[3][3] =  new Arreglol(28,0,0,0);
        this.b[3][4] =  new Arreglol(29,0,0,0);
        this.b[3][5] =  new Arreglol(30,0,0,0);
        this.b[3][6] =  new Arreglol(31,0,0,0);
        this.b[3][7] =  new Arreglol(32,0,0,0);
        
        this.b[4][0] =  new Arreglol(33,0,0,0);
        this.b[4][1] =  new Arreglol(34,0,0,0);
        this.b[4][2] =  new Arreglol(35,0,0,0);
        this.b[4][3] =  new Arreglol(36,0,0,0);
        this.b[4][4] =  new Arreglol(37,0,0,0);
        this.b[4][5] =  new Arreglol(38,0,0,0);
        this.b[4][6] =  new Arreglol(39,0,0,0);
        this.b[4][7] =  new Arreglol(40,0,0,0);
        
        this.b[5][0] =  new Arreglol(41,0,0,0);
        this.b[5][1] =  new Arreglol(42,0,0,0);
        this.b[5][2] =  new Arreglol(43,0,0,0);
        this.b[5][3] =  new Arreglol(44,0,0,0);
        this.b[5][4] =  new Arreglol(45,0,0,0);
        this.b[5][5] =  new Arreglol(46,0,0,0);
        this.b[5][6] =  new Arreglol(47,0,0,0);
        this.b[5][7] =  new Arreglol(48,0,0,0);
       
        this.b[6][0] =  new Arreglol(49,0,0,0);
        this.b[6][1] =  new Arreglol(50,0,0,0);
        this.b[6][2] =  new Arreglol(51,0,0,0);
        this.b[6][3] =  new Arreglol(52,0,0,0);
        this.b[6][4] =  new Arreglol(53,0,0,0);
        this.b[6][5] =  new Arreglol(54,0,0,0);
        this.b[6][6] =  new Arreglol(55,0,0,0);
        this.b[6][7] =  new Arreglol(56,0,0,0);
       
        this.b[7][0] =  new Arreglol(57,0,0,0);
        this.b[7][1] =  new Arreglol(58,0,0,0);
        this.b[7][2] =  new Arreglol(59,0,0,0);
        this.b[7][3] =  new Arreglol(60,0,0,0);
        this.b[7][4] =  new Arreglol(61,0,0,0);
        this.b[7][5] =  new Arreglol(62,0,0,0);
        this.b[7][6] =  new Arreglol(63,0,0,0);
        this.b[7][7] =  new Arreglol(64,0,0,0);
        
    }
    
    public void CambiarColor(int a, int y, int r, int g, int b1){
      this.b[a][y].setR(r);
      this.b[a][y].setG(g);
      this.b[a][y].setB(b1);
     
      System.out.println(b[a][y].getNumled()+","+b[a][y].getR()+","+b[a][y].getG()+","+b[a][y].getB());
    }

    public Arreglol[][] getB() {
        return b;
    }

    public void setB(Arreglol[][] b) {
        this.b = b;
    }

   
}
