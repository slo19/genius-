/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genius.visao;

import genius.controlador.Controle;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

public class MainScreen extends javax.swing.JFrame {
    private Controle controle = new Controle();
    private boolean tempo;
    private Timer t  = new Timer(5000, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            System.out.println();
            if (tempo==true) {
                t.stop();
            } else {
                DialogoDerrota.setVisible(true);
            }
        }
    });
    
    
    public void setColorButton3(Color cor){
        Button3.setBackground(cor);
    }
    public void setColorButton2(Color cor){
        Button2.setBackground(cor);
    }
    public void setColorButton1(Color cor){
        Button1.setBackground(cor);
    }
    public void setColorButton4(Color cor){
        Button4.setBackground(cor);
    }
    public MainScreen() {
        initComponents();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        DialogoVitoria.setBounds((screenSize.width-206)/2, (screenSize.height-150)/2,206,150);
        DialogoDerrota.setBounds((screenSize.width-206)/2, (screenSize.height-150)/2,206,150);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogoVitoria = new javax.swing.JDialog();
        RestartVitoria = new javax.swing.JButton();
        labelVitora = new javax.swing.JLabel();
        DialogoDerrota = new javax.swing.JDialog();
        RestartDerrota = new javax.swing.JButton();
        labelDerrota = new javax.swing.JLabel();
        StartButton = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();

        DialogoVitoria.setMinimumSize(new java.awt.Dimension(206, 150));
        DialogoVitoria.setModal(true);

        RestartVitoria.setText("PLAY AGAIN");
        RestartVitoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartVitoriaActionPerformed(evt);
            }
        });

        labelVitora.setText("YOU WIN!");

        javax.swing.GroupLayout DialogoVitoriaLayout = new javax.swing.GroupLayout(DialogoVitoria.getContentPane());
        DialogoVitoria.getContentPane().setLayout(DialogoVitoriaLayout);
        DialogoVitoriaLayout.setHorizontalGroup(
            DialogoVitoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoVitoriaLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(DialogoVitoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RestartVitoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelVitora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        DialogoVitoriaLayout.setVerticalGroup(
            DialogoVitoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogoVitoriaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelVitora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(RestartVitoria)
                .addGap(24, 24, 24))
        );

        DialogoDerrota.setMinimumSize(new java.awt.Dimension(206, 150));
        DialogoDerrota.setModal(true);

        RestartDerrota.setText("PLAY AGAIN");
        RestartDerrota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartDerrotaActionPerformed(evt);
            }
        });

        labelDerrota.setText("GAME OVER   : (");

        javax.swing.GroupLayout DialogoDerrotaLayout = new javax.swing.GroupLayout(DialogoDerrota.getContentPane());
        DialogoDerrota.getContentPane().setLayout(DialogoDerrotaLayout);
        DialogoDerrotaLayout.setHorizontalGroup(
            DialogoDerrotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoDerrotaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DialogoDerrotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RestartDerrota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelDerrota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DialogoDerrotaLayout.setVerticalGroup(
            DialogoDerrotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogoDerrotaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelDerrota)
                .addGap(35, 35, 35)
                .addComponent(RestartDerrota)
                .addGap(22, 22, 22))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(DialogoDerrota.getBounds());

        StartButton.setText("PLAY");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        Button1.setBackground(new java.awt.Color(255, 255, 255));
        Button1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Button1.setText("1");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setBackground(new java.awt.Color(255, 255, 255));
        Button2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Button2.setText("2");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setBackground(new java.awt.Color(255, 255, 255));
        Button3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Button3.setText("3");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button4.setBackground(new java.awt.Color(255, 255, 255));
        Button4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Button4.setText("4");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button2, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StartButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        this.loopCompara(0);
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        this.loopCompara(1);
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        this.loopCompara(2);
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        this.loopCompara(3);
    }//GEN-LAST:event_Button4ActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        controle.zeraIndice();
        t.stop();
        this.tempo = true;
        controle.setNivel();
        controle.geraSequencia();  
        try {
            this.piscaSequencia();
            tempo = false;
            t.start();
        } catch (Exception ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_StartButtonActionPerformed

    private void RestartVitoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartVitoriaActionPerformed
        controle.zeraIndice();
        this.tempo=true;
        controle.setNivel();
        controle.geraSequencia();
        t.stop();
        DialogoVitoria.setVisible(false);
        try {
            this.piscaSequencia();
            this.tempo=false;
            t.start();
        } catch (Exception ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_RestartVitoriaActionPerformed

    private void RestartDerrotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartDerrotaActionPerformed
        controle.zeraIndice();
        this.tempo = true;
        controle.setNivel();
        controle.geraSequencia();
        t.stop();
        DialogoDerrota.setVisible(false);
        try {
            this.piscaSequencia();
            this.tempo = false;
            t.start();
        } catch (Exception ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RestartDerrotaActionPerformed
    
   public void loopCompara(int entrada){
       int resultado = controle.compara(entrada);
       if(resultado==2){
           t.stop();
           controle.zeraIndice();
           this.tempo = true;
           System.out.println("Nivel = " + controle.getNivel());
           try {
            this.piscaSequencia();
            this.tempo = false;
            t.start();
        } catch (Exception ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
       if(resultado ==3){;
           t.stop();
           DialogoVitoria.setVisible(true);
       }
       if(resultado==0){
           t.stop();
           DialogoDerrota.setVisible(true);
       }
       if(resultado==1){
          t.stop();
       }
       
   }                                          
    
     
   public void piscaSequencia() throws Exception{
        for(int i = 0;i<controle.getNivel();i++)           
                switch (controle.getSequencia().get(i)){
                    case 0:
                        Button1.setBackground(Color.gray);
                        update(getGraphics());
                        Thread.sleep(1000);
                        Button1.setBackground(Color.white);
                        update(getGraphics());
                        break;
                    case 1:
                        Button2.setBackground(Color.gray);
                        update(getGraphics());
                        Thread.sleep(1000);
                        Button2.setBackground(Color.white);
                        update(getGraphics());
                        break;
                    case 2:
                        Button3.setBackground(Color.gray);
                        update(getGraphics());
                        Thread.sleep(1000);
                        Button3.setBackground(Color.white);
                        update(getGraphics());
                        break;
                    case 3:
                        Button4.setBackground(Color.gray);
                        update(getGraphics());
                        Thread.sleep(1000);
                        Button4.setBackground(Color.white);
                        update(getGraphics());
                        break;
                }
                
            }
               
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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainScreen Tela = new MainScreen();
                java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
                Tela.setBounds((screenSize.width-316)/2, (screenSize.height-300)/2,316,300);
                
                Tela.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JDialog DialogoDerrota;
    private javax.swing.JDialog DialogoVitoria;
    private javax.swing.JButton RestartDerrota;
    private javax.swing.JButton RestartVitoria;
    private javax.swing.JButton StartButton;
    private javax.swing.JLabel labelDerrota;
    private javax.swing.JLabel labelVitora;
    // End of variables declaration//GEN-END:variables
}
