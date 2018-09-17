/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdenPares;

import OrdenPares.AleatorioBotones;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    private AleatorioBotones log = new AleatorioBotones();
    private boolean caraArriba = false;
    private ImageIcon img1;
    private ImageIcon img2;
    private JButton[] pbtn = new JButton[2];
    private boolean segundo = false;

    public Interfaz() {
        initComponents();
        imagenesBotones();

    }

    private void imagenesBotones() {
        int[] numeros = log.getPosicionBotonesAleatorios();
        boton1.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/num" + numeros[0] + ".png")));
        boton2.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/num" + numeros[1] + ".png")));
        boton3.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/num" + numeros[2] + ".png")));
        boton4.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/num" + numeros[3] + ".png")));
        boton5.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/num" + numeros[4] + ".png")));
        boton6.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/num" + numeros[5] + ".png")));
    }

    private void habilitarDesabilitar(JButton btn) {

        if (!caraArriba) {
            btn.setEnabled(false);
            img1 = (ImageIcon) btn.getDisabledIcon();
            pbtn[0] = btn;
            caraArriba = true;
            segundo = false;
        } else {
            btn.setEnabled(false);
            img2 = (ImageIcon) btn.getDisabledIcon();
            pbtn[1] = btn;
            segundo = true;

        }
    }

    private void comparacion() {
        if (caraArriba && segundo) {

            if (img1.getDescription().compareTo(img2.getDescription()) != 0) {
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);

            }

            caraArriba = false;
        }
    }

    private void reiniciar() {
        boton1.setEnabled(true);
        boton2.setEnabled(true);
        boton3.setEnabled(true);
        boton4.setEnabled(true);
        boton5.setEnabled(true);
        boton6.setEnabled(true);
        segundo = false;
        caraArriba = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boton4 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grafico.png"))); // NOI18N
        boton4.setBorderPainted(false);
        boton4.setContentAreaFilled(false);
        boton4.setDefaultCapable(false);
        boton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccio1.png"))); // NOI18N
        boton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton4MouseExited(evt);
            }
        });
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grafico.png"))); // NOI18N
        boton3.setBorderPainted(false);
        boton3.setContentAreaFilled(false);
        boton3.setDefaultCapable(false);
        boton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccio1.png"))); // NOI18N
        boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton3MouseExited(evt);
            }
        });
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grafico.png"))); // NOI18N
        boton2.setBorderPainted(false);
        boton2.setContentAreaFilled(false);
        boton2.setDefaultCapable(false);
        boton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccio1.png"))); // NOI18N
        boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton2MouseExited(evt);
            }
        });
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grafico.png"))); // NOI18N
        boton1.setBorderPainted(false);
        boton1.setContentAreaFilled(false);
        boton1.setDefaultCapable(false);
        boton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccio1.png"))); // NOI18N
        boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton1MouseExited(evt);
            }
        });
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grafico.png"))); // NOI18N
        boton6.setBorderPainted(false);
        boton6.setContentAreaFilled(false);
        boton6.setDefaultCapable(false);
        boton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccio1.png"))); // NOI18N
        boton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton6MouseExited(evt);
            }
        });
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        boton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grafico.png"))); // NOI18N
        boton5.setBorderPainted(false);
        boton5.setContentAreaFilled(false);
        boton5.setDefaultCapable(false);
        boton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccio1.png"))); // NOI18N
        boton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton5MouseExited(evt);
            }
        });
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jButton1.setText("REINICIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        habilitarDesabilitar(boton1);
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        habilitarDesabilitar(boton2);
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        habilitarDesabilitar(boton3);
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        habilitarDesabilitar(boton4);
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        habilitarDesabilitar(boton6);
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseExited
        comparacion();
    }//GEN-LAST:event_boton1MouseExited

    private void boton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MouseExited
        comparacion();
    }//GEN-LAST:event_boton2MouseExited

    private void boton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseExited
        comparacion();
    }//GEN-LAST:event_boton3MouseExited

    private void boton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MouseExited
        comparacion();
    }//GEN-LAST:event_boton4MouseExited

    private void boton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MouseExited
        comparacion();
    }//GEN-LAST:event_boton5MouseExited

    private void boton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton6MouseExited
        comparacion();
    }//GEN-LAST:event_boton6MouseExited

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        habilitarDesabilitar(boton5);
    }//GEN-LAST:event_boton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      reiniciar();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
