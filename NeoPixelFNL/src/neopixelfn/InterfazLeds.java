/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package neopixelfn;




import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import panamahitek.Arduino.PanamaHitek_Arduino;



/**
 *
 * @author losro
 */
public class InterfazLeds extends javax.swing.JFrame {
    PanamaHitek_Arduino arduino = new PanamaHitek_Arduino();
    Neopixel o2 = new Neopixel();
    Matrizleds o1 = new Matrizleds();
    int contador =0;

    public InterfazLeds() {
        initComponents();
        //this.setExtendedState(this.MAXIMIZED_BOTH);
        try {
            arduino.arduinoTX("COM5", 9600);
        } catch (Exception ex) {
            Logger.getLogger(InterfazLeds.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Leds = new javax.swing.JPanel();
        chemss1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        coloris = new javax.swing.JColorChooser();
        chemss2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        Creaper = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        capy = new javax.swing.JPanel();
        borrar = new javax.swing.JPanel();
        capy2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        pacman = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pacman1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Leds.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Leds.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Leds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LedsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LedsLayout = new javax.swing.GroupLayout(Leds);
        Leds.setLayout(LedsLayout);
        LedsLayout.setHorizontalGroup(
            LedsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        LedsLayout.setVerticalGroup(
            LedsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        chemss1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chemss1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chemss1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout chemss1Layout = new javax.swing.GroupLayout(chemss1);
        chemss1.setLayout(chemss1Layout);
        chemss1Layout.setHorizontalGroup(
            chemss1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        chemss1Layout.setVerticalGroup(
            chemss1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel2.setText("Borradores");

        coloris.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccion de Colores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 18))); // NOI18N
        coloris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorisMouseClicked(evt);
            }
        });

        chemss2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chemss2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chemss2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chemss2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout chemss2Layout = new javax.swing.GroupLayout(chemss2);
        chemss2.setLayout(chemss2Layout);
        chemss2Layout.setHorizontalGroup(
            chemss2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        chemss2Layout.setVerticalGroup(
            chemss2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        Creaper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Creaper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreaperMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CreaperLayout = new javax.swing.GroupLayout(Creaper);
        Creaper.setLayout(CreaperLayout);
        CreaperLayout.setHorizontalGroup(
            CreaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        CreaperLayout.setVerticalGroup(
            CreaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel1.setText("Imagenes Predefinidas");

        capy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        capy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                capyMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout capyLayout = new javax.swing.GroupLayout(capy);
        capy.setLayout(capyLayout);
        capyLayout.setHorizontalGroup(
            capyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        capyLayout.setVerticalGroup(
            capyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout borrarLayout = new javax.swing.GroupLayout(borrar);
        borrar.setLayout(borrarLayout);
        borrarLayout.setHorizontalGroup(
            borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        borrarLayout.setVerticalGroup(
            borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        capy2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        capy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                capy2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout capy2Layout = new javax.swing.GroupLayout(capy2);
        capy2.setLayout(capy2Layout);
        capy2Layout.setHorizontalGroup(
            capy2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        capy2Layout.setVerticalGroup(
            capy2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        pacman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pacman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pacmanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pacmanLayout = new javax.swing.GroupLayout(pacman);
        pacman.setLayout(pacmanLayout);
        pacmanLayout.setHorizontalGroup(
            pacmanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        pacmanLayout.setVerticalGroup(
            pacmanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel3.setText("Animacion");

        pacman1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pacman1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pacman1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pacman1Layout = new javax.swing.GroupLayout(pacman1);
        pacman1.setLayout(pacman1Layout);
        pacman1Layout.setHorizontalGroup(
            pacman1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        pacman1Layout.setVerticalGroup(
            pacman1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Leds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(coloris, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 648, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator2)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel2)
                                        .addGap(51, 51, 51))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(chemss2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(chemss1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(Creaper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(capy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(capy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(jLabel1)))
                                .addGap(34, 34, 34)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addGap(51, 51, 51))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(pacman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pacman1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Leds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(coloris, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(chemss1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chemss2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(capy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(capy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Creaper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pacman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(pacman1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        o1.dibujar(this.getGraphics(), Leds,8,8);
        o1.Icono(this.getGraphics(), chemss1,"borrador.png");
        o1.Icono(this.getGraphics(), Creaper,"creper.png");
        o1.Icono(this.getGraphics(), capy,"capi.png");
        o1.Icono(this.getGraphics(), borrar,"borrar.png");
        o1.Icono(this.getGraphics(), capy2,"squirtel.png");
        o1.Icono(this.getGraphics(), pacman,"pacman.png");
   
    }//GEN-LAST:event_formWindowActivated

    private void LedsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LedsMouseClicked
        // TODO add your handling code here:
        int[] a4= new int[5];
        int x = evt.getX();
        int y = evt.getY();
        Cordenadas a1 = new Cordenadas();
        
       if(contador == 0){
           a4 = a1.cordenadasmatriz2(Leds,x, y,8,8,o1.getV(),this.getGraphics(),coloris.getColor());
       }else{
           a4 = a1.cordenadasmatriz2(Leds,x, y,8,8,o1.getV(),this.getGraphics(),Leds.getBackground());
       }
        
       o2.CambiarColor(a4[0], a4[1], a4[2], a4[3], a4[4]);       
       o1.dibujar(this.getGraphics(), Leds,8,8);
       
      int z = o2.getB()[a4[0]][a4[1]].getNumled();
      System.out.println(z);
      
    try {
        arduino.sendByte(z );  
        arduino.sendByte(a4[2] ); 
        arduino.sendByte(a4[3] ); 
        arduino.sendByte( a4[4]);  
    } catch (Exception ex) {
        Logger.getLogger(InterfazLeds.class.getName()).log(Level.SEVERE, null, ex);
    }
   
    }//GEN-LAST:event_LedsMouseClicked

    private void chemss1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chemss1MouseClicked
        // TODO add your handling code here:
        if(contador==0){
            chemss1.getBackground();
            contador = contador + 1;
            chemss2.setBackground(Color.red);
            //chemss1.setBorder(new LineBorder(Color.CYAN,2));
        }else{
            //chemss1.setBorder(new LineBorder(Color.black,2));
            contador =0;
            chemss2.setBackground(chemss1.getBackground());
        }
        o1.Icono(this.getGraphics(), chemss1,"borrador.png");
    }//GEN-LAST:event_chemss1MouseClicked

    private void colorisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorisMouseClicked
        // TODO add your handling code here:
        o1.dibujar(this.getGraphics(), Leds,8,8);
        o1.Icono(this.getGraphics(), chemss1,"borrador.png");
        o1.Icono(this.getGraphics(), Creaper,"creper.png");
        o1.Icono(this.getGraphics(), capy,"capi.png");
        o1.Icono(this.getGraphics(), borrar,"borrar.png");
        o1.Icono(this.getGraphics(), capy2,"squirtel.png");
        o1.Icono(this.getGraphics(), pacman,"pacman.png");
    }//GEN-LAST:event_colorisMouseClicked

    private void chemss2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chemss2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_chemss2MouseClicked

    private void CreaperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreaperMouseClicked
        // TODO add your handling code here:
         o1.Borr(this.getGraphics(), Leds,8,8);
         try { 
            arduino.sendByte(80);  
            arduino.sendByte(0); 
            arduino.sendByte(0); 
            arduino.sendByte(0);
        } catch (Exception ex) {
            Logger.getLogger(InterfazLeds.class.getName()).log(Level.SEVERE, null, ex);
        }
          
         o1.creper(this.getGraphics(), Leds, 8, 8);
         o1.dibujar(this.getGraphics(), Leds,8,8);
    }//GEN-LAST:event_CreaperMouseClicked

    private void capyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_capyMouseClicked
        // TODO add your handling code here:
         o1.Borr(this.getGraphics(), Leds,8,8);
         try { 
            arduino.sendByte(70);  
            arduino.sendByte(0); 
            arduino.sendByte(0); 
            arduino.sendByte(0);
        } catch (Exception ex) {
            Logger.getLogger(InterfazLeds.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        o1.capy(this.getGraphics(), Leds, 8, 8);
        o1.dibujar(this.getGraphics(), Leds,8,8);
    }//GEN-LAST:event_capyMouseClicked

    private void borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarMouseClicked
        // TODO add your handling code here:
        String[] ja ={"Si","No"};
        int y = JOptionPane.showOptionDialog(null, "Estas seguro?", "Borrar todo", WIDTH, JOptionPane.QUESTION_MESSAGE, null,ja ,"");
       if(y==0){
            try {
                arduino.sendByte(90);  
                arduino.sendByte(0); 
                arduino.sendByte(0); 
                arduino.sendByte(0);
            } catch (Exception ex) {
                Logger.getLogger(InterfazLeds.class.getName()).log(Level.SEVERE, null, ex);
            }
        o1.Borr(this.getGraphics(), Leds,8,8);
       }
        
    }//GEN-LAST:event_borrarMouseClicked

    private void capy2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_capy2MouseClicked
        // TODO add your handling code here:
         o1.Borr(this.getGraphics(), Leds,8,8);
        try { 
            arduino.sendByte(75);  
            arduino.sendByte(0); 
            arduino.sendByte(0); 
            arduino.sendByte(0);
        } catch (Exception ex) {
            Logger.getLogger(InterfazLeds.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
        
         o1.skuirtel(this.getGraphics(), Leds, 8, 8);
         o1.dibujar(this.getGraphics(), Leds,8,8);   
    }//GEN-LAST:event_capy2MouseClicked

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_formPropertyChange

    private void pacmanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pacmanMouseClicked
        // TODO add your handling code here:
         o1.Borr(this.getGraphics(), Leds,8,8);
            try { 
                arduino.sendByte(81 );  
                arduino.sendByte(0); 
                arduino.sendByte(0); 
                arduino.sendByte(0);
            } catch (Exception ex) {
                Logger.getLogger(InterfazLeds.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_pacmanMouseClicked

    private void pacman1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pacman1MouseClicked
        // TODO add your handling code here:
        o1.Borr(this.getGraphics(), Leds,8,8);
            try { 
                arduino.sendByte(79 );  
                arduino.sendByte(0); 
                arduino.sendByte(0); 
                arduino.sendByte(0);
            } catch (Exception ex) {
                Logger.getLogger(InterfazLeds.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_pacman1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazLeds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazLeds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazLeds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazLeds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazLeds().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Creaper;
    private javax.swing.JPanel Leds;
    private javax.swing.JPanel borrar;
    private javax.swing.JPanel capy;
    private javax.swing.JPanel capy2;
    private javax.swing.JPanel chemss1;
    private javax.swing.JPanel chemss2;
    private javax.swing.JColorChooser coloris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel pacman;
    private javax.swing.JPanel pacman1;
    // End of variables declaration//GEN-END:variables
}