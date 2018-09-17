/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdenPares;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Alejandro
 */
public class Nivel extends javax.swing.JFrame {

    private AleatorioNivel2 log = new AleatorioNivel2();
    private boolean caraArriba = false;
    private ImageIcon img1;
    private ImageIcon img2;
    private JButton[] pbtn = new JButton[2];
    private boolean segundo = false;
    private int puntuacion = 0;

    public Nivel() {
        initComponents();
        imagenesBotonesAleatorio();
    }

    public void imagenesBotonesAleatorio() {
        int numeros[] = log.getBotonesAleatorios();
        boton1.setDisabledIcon(new ImageIcon(getClass().getResource("/images/fruit" + numeros[0] + ".png")));
        boton2.setDisabledIcon(new ImageIcon(getClass().getResource("/images/fruit" + numeros[1] + ".png")));
        boton3.setDisabledIcon(new ImageIcon(getClass().getResource("/images/fruit" + numeros[2] + ".png")));
        boton4.setDisabledIcon(new ImageIcon(getClass().getResource("/images/fruit" + numeros[3] + ".png")));
        boton5.setDisabledIcon(new ImageIcon(getClass().getResource("/images/fruit" + numeros[4] + ".png")));
        boton6.setDisabledIcon(new ImageIcon(getClass().getResource("/images/fruit" + numeros[5] + ".png")));
        boton7.setDisabledIcon(new ImageIcon(getClass().getResource("/images/fruit" + numeros[6] + ".png")));
        boton8.setDisabledIcon(new ImageIcon(getClass().getResource("/images/fruit" + numeros[7] + ".png")));
        boton9.setDisabledIcon(new ImageIcon(getClass().getResource("/images/fruit" + numeros[8] + ".png")));
        boton10.setDisabledIcon(new ImageIcon(getClass().getResource("/images/fruit" + numeros[9] + ".png")));
        boton11.setDisabledIcon(new ImageIcon(getClass().getResource("/images/fruit" + numeros[10] + ".png")));
        boton12.setDisabledIcon(new ImageIcon(getClass().getResource("/images/fruit" + numeros[11] + ".png")));
        boton13.setDisabledIcon(new ImageIcon(getClass().getResource("/images/fruit" + numeros[12] + ".png")));
        boton14.setDisabledIcon(new ImageIcon(getClass().getResource("/images/fruit" + numeros[13] + ".png")));
        boton15.setDisabledIcon(new ImageIcon(getClass().getResource("/images/fruit" + numeros[14] + ".png")));
        boton16.setDisabledIcon(new ImageIcon(getClass().getResource("/images/fruit" + numeros[15] + ".png")));
        boton17.setDisabledIcon(new ImageIcon(getClass().getResource("/images/fruit" + numeros[16] + ".png")));
        boton18.setDisabledIcon(new ImageIcon(getClass().getResource("/images/fruit" + numeros[17] + ".png")));
        boton19.setDisabledIcon(new ImageIcon(getClass().getResource("/images/fruit" + numeros[18] + ".png")));
        boton20.setDisabledIcon(new ImageIcon(getClass().getResource("/images/fruit" + numeros[19] + ".png")));

    }

    private void habiDesa(JButton btn) {

        if (!caraArriba) {
            btn.setEnabled(false);
            img1 = (ImageIcon) btn.getDisabledIcon();
            pbtn[0] = btn;
            caraArriba = true;
            segundo = false;
            puntuacion += 20;

        } else {
            btn.setEnabled(false);
            img2 = (ImageIcon) btn.getDisabledIcon();
            pbtn[1] = btn;
            segundo = true;

            ganar();

        }
    }

    private void comparacion() {
        if (caraArriba && segundo) {

            if (img1.getDescription().compareTo(img2.getDescription()) != 0) {
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
                if (puntuacion > 10) {
                    puntuacion -= 10;
                }

            }

            caraArriba = false;
        }
    }

    private void reinicio() {
        boton1.setEnabled(true);
        boton2.setEnabled(true);
        boton3.setEnabled(true);
        boton4.setEnabled(true);
        boton5.setEnabled(true);
        boton6.setEnabled(true);
        boton7.setEnabled(true);
        boton8.setEnabled(true);
        boton9.setEnabled(true);
        boton10.setEnabled(true);
        boton11.setEnabled(true);
        boton12.setEnabled(true);
        boton13.setEnabled(true);
        boton14.setEnabled(true);
        boton15.setEnabled(true);
        boton16.setEnabled(true);
        boton17.setEnabled(true);
        boton18.setEnabled(true);
        boton19.setEnabled(true);
        boton20.setEnabled(true);
        segundo = false;
        caraArriba = false;
        puntuacion = 0;

    }

    private void ganar() {
        if (!boton1.isEnabled()
                && !boton2.isEnabled()
                && !boton3.isEnabled()
                && !boton4.isEnabled()
                && !boton5.isEnabled()
                && !boton6.isEnabled()
                && !boton7.isEnabled()
                && !boton8.isEnabled()
                && !boton9.isEnabled()
                && !boton10.isEnabled()
                && !boton11.isEnabled()
                && !boton12.isEnabled()
                && !boton13.isEnabled()
                && !boton14.isEnabled()
                && !boton15.isEnabled()
                && !boton16.isEnabled()
                && !boton17.isEnabled()
                && !boton18.isEnabled()
                && !boton19.isEnabled()
                && !boton20.isEnabled()) {
//            JOptionPane.showMessageDialog(this, "su puntaje es: " + puntuacion);
            puntaje.setText("" + puntuacion);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton10 = new javax.swing.JButton();
        boton11 = new javax.swing.JButton();
        boton12 = new javax.swing.JButton();
        boton13 = new javax.swing.JButton();
        boton14 = new javax.swing.JButton();
        boton15 = new javax.swing.JButton();
        boton16 = new javax.swing.JButton();
        boton17 = new javax.swing.JButton();
        boton18 = new javax.swing.JButton();
        boton19 = new javax.swing.JButton();
        boton20 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        puntaje = new javax.swing.JLabel();
        reiniciar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz.png"))); // NOI18N
        boton1.setBorder(null);
        boton1.setBorderPainted(false);
        boton1.setContentAreaFilled(false);
        boton1.setFocusable(false);
        boton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz1.png"))); // NOI18N
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

        boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz.png"))); // NOI18N
        boton2.setBorder(null);
        boton2.setBorderPainted(false);
        boton2.setContentAreaFilled(false);
        boton2.setFocusable(false);
        boton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz1.png"))); // NOI18N
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

        boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz.png"))); // NOI18N
        boton3.setBorder(null);
        boton3.setBorderPainted(false);
        boton3.setContentAreaFilled(false);
        boton3.setFocusable(false);
        boton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz1.png"))); // NOI18N
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

        boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz.png"))); // NOI18N
        boton4.setBorder(null);
        boton4.setBorderPainted(false);
        boton4.setContentAreaFilled(false);
        boton4.setFocusable(false);
        boton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz1.png"))); // NOI18N
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

        boton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz.png"))); // NOI18N
        boton5.setBorder(null);
        boton5.setBorderPainted(false);
        boton5.setContentAreaFilled(false);
        boton5.setFocusable(false);
        boton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz1.png"))); // NOI18N
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

        boton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz.png"))); // NOI18N
        boton6.setBorder(null);
        boton6.setBorderPainted(false);
        boton6.setContentAreaFilled(false);
        boton6.setFocusable(false);
        boton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz1.png"))); // NOI18N
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

        boton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz.png"))); // NOI18N
        boton7.setBorder(null);
        boton7.setBorderPainted(false);
        boton7.setContentAreaFilled(false);
        boton7.setFocusable(false);
        boton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz1.png"))); // NOI18N
        boton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton7MouseExited(evt);
            }
        });
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });

        boton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz.png"))); // NOI18N
        boton8.setBorder(null);
        boton8.setBorderPainted(false);
        boton8.setContentAreaFilled(false);
        boton8.setFocusable(false);
        boton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz1.png"))); // NOI18N
        boton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton8MouseExited(evt);
            }
        });
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });

        boton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz.png"))); // NOI18N
        boton9.setBorder(null);
        boton9.setBorderPainted(false);
        boton9.setContentAreaFilled(false);
        boton9.setFocusable(false);
        boton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz1.png"))); // NOI18N
        boton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton9MouseExited(evt);
            }
        });
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });

        boton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz.png"))); // NOI18N
        boton10.setBorder(null);
        boton10.setBorderPainted(false);
        boton10.setContentAreaFilled(false);
        boton10.setFocusable(false);
        boton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz1.png"))); // NOI18N
        boton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton10MouseExited(evt);
            }
        });
        boton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton10ActionPerformed(evt);
            }
        });

        boton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz.png"))); // NOI18N
        boton11.setBorder(null);
        boton11.setBorderPainted(false);
        boton11.setContentAreaFilled(false);
        boton11.setFocusable(false);
        boton11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz1.png"))); // NOI18N
        boton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton11MouseExited(evt);
            }
        });
        boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton11ActionPerformed(evt);
            }
        });

        boton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz.png"))); // NOI18N
        boton12.setBorder(null);
        boton12.setBorderPainted(false);
        boton12.setContentAreaFilled(false);
        boton12.setFocusable(false);
        boton12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz1.png"))); // NOI18N
        boton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton12MouseExited(evt);
            }
        });
        boton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton12ActionPerformed(evt);
            }
        });

        boton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz.png"))); // NOI18N
        boton13.setBorder(null);
        boton13.setBorderPainted(false);
        boton13.setContentAreaFilled(false);
        boton13.setFocusable(false);
        boton13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz1.png"))); // NOI18N
        boton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton13MouseExited(evt);
            }
        });
        boton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton13ActionPerformed(evt);
            }
        });

        boton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz.png"))); // NOI18N
        boton14.setBorder(null);
        boton14.setBorderPainted(false);
        boton14.setContentAreaFilled(false);
        boton14.setFocusable(false);
        boton14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz1.png"))); // NOI18N
        boton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton14MouseExited(evt);
            }
        });
        boton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton14ActionPerformed(evt);
            }
        });

        boton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz.png"))); // NOI18N
        boton15.setBorder(null);
        boton15.setBorderPainted(false);
        boton15.setContentAreaFilled(false);
        boton15.setFocusable(false);
        boton15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz1.png"))); // NOI18N
        boton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton15MouseExited(evt);
            }
        });
        boton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton15ActionPerformed(evt);
            }
        });

        boton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz.png"))); // NOI18N
        boton16.setBorder(null);
        boton16.setBorderPainted(false);
        boton16.setContentAreaFilled(false);
        boton16.setFocusable(false);
        boton16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz1.png"))); // NOI18N
        boton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton16MouseExited(evt);
            }
        });
        boton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton16ActionPerformed(evt);
            }
        });

        boton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz.png"))); // NOI18N
        boton17.setBorder(null);
        boton17.setBorderPainted(false);
        boton17.setContentAreaFilled(false);
        boton17.setFocusable(false);
        boton17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz1.png"))); // NOI18N
        boton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton17MouseExited(evt);
            }
        });
        boton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton17ActionPerformed(evt);
            }
        });

        boton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz.png"))); // NOI18N
        boton18.setBorder(null);
        boton18.setBorderPainted(false);
        boton18.setContentAreaFilled(false);
        boton18.setFocusable(false);
        boton18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz1.png"))); // NOI18N
        boton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton18MouseExited(evt);
            }
        });
        boton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton18ActionPerformed(evt);
            }
        });

        boton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz.png"))); // NOI18N
        boton19.setBorder(null);
        boton19.setBorderPainted(false);
        boton19.setContentAreaFilled(false);
        boton19.setFocusable(false);
        boton19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz1.png"))); // NOI18N
        boton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton19MouseExited(evt);
            }
        });
        boton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton19ActionPerformed(evt);
            }
        });

        boton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz.png"))); // NOI18N
        boton20.setBorder(null);
        boton20.setBorderPainted(false);
        boton20.setContentAreaFilled(false);
        boton20.setFocusable(false);
        boton20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feliz1.png"))); // NOI18N
        boton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton20MouseExited(evt);
            }
        });
        boton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton16, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boton13, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton10, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton11, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton14, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton15, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton18, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton19, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton20, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton17, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton16, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boton17, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton20, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton13, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton14, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton18, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton15, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ACIERTOS:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ERRORES:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("PUNTAJE:");

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        puntaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        reiniciar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reiniciar.setText("REINICIAR");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("MENU PRINCIPAL");
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
                .addContainerGap(627, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)))
                                    .addComponent(reiniciar))
                                .addGap(1, 1, 1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(puntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(121, 121, 121))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(351, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(puntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(170, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseExited
        comparacion();
    }//GEN-LAST:event_boton1MouseExited

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        habiDesa(boton1);
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MouseExited
        comparacion();
    }//GEN-LAST:event_boton2MouseExited

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        habiDesa(boton2);
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseExited
        comparacion();
    }//GEN-LAST:event_boton3MouseExited

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        habiDesa(boton3);
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MouseExited
        comparacion();
    }//GEN-LAST:event_boton4MouseExited

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        habiDesa(boton4);
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MouseExited
        comparacion();
    }//GEN-LAST:event_boton5MouseExited

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        habiDesa(boton5);
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton6MouseExited
        comparacion();
    }//GEN-LAST:event_boton6MouseExited

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        habiDesa(boton6);
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton7MouseExited
        comparacion();
    }//GEN-LAST:event_boton7MouseExited

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        habiDesa(boton7);
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton8MouseExited
        comparacion();
    }//GEN-LAST:event_boton8MouseExited

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        habiDesa(boton8);
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton9MouseExited
        comparacion();
    }//GEN-LAST:event_boton9MouseExited

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        habiDesa(boton9);
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton10MouseExited
        comparacion();
    }//GEN-LAST:event_boton10MouseExited

    private void boton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton10ActionPerformed
        habiDesa(boton10);
    }//GEN-LAST:event_boton10ActionPerformed

    private void boton11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton11MouseExited
        comparacion();
    }//GEN-LAST:event_boton11MouseExited

    private void boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton11ActionPerformed
        habiDesa(boton11);
    }//GEN-LAST:event_boton11ActionPerformed

    private void boton12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton12MouseExited
        comparacion();
    }//GEN-LAST:event_boton12MouseExited

    private void boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton12ActionPerformed
        habiDesa(boton12);
    }//GEN-LAST:event_boton12ActionPerformed

    private void boton13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton13MouseExited
        comparacion();
    }//GEN-LAST:event_boton13MouseExited

    private void boton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton13ActionPerformed
        habiDesa(boton13);
    }//GEN-LAST:event_boton13ActionPerformed

    private void boton14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton14MouseExited
        comparacion();
    }//GEN-LAST:event_boton14MouseExited

    private void boton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton14ActionPerformed
        habiDesa(boton14);
    }//GEN-LAST:event_boton14ActionPerformed

    private void boton15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton15MouseExited
        comparacion();
    }//GEN-LAST:event_boton15MouseExited

    private void boton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton15ActionPerformed
        habiDesa(boton15);
    }//GEN-LAST:event_boton15ActionPerformed

    private void boton16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton16MouseExited
        comparacion();
    }//GEN-LAST:event_boton16MouseExited

    private void boton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton16ActionPerformed
        habiDesa(boton16);
    }//GEN-LAST:event_boton16ActionPerformed

    private void boton17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton17MouseExited
        comparacion();
    }//GEN-LAST:event_boton17MouseExited

    private void boton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton17ActionPerformed
        habiDesa(boton17);
    }//GEN-LAST:event_boton17ActionPerformed

    private void boton18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton18MouseExited
        comparacion();
    }//GEN-LAST:event_boton18MouseExited

    private void boton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton18ActionPerformed
        habiDesa(boton18);
    }//GEN-LAST:event_boton18ActionPerformed

    private void boton19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton19MouseExited
        comparacion();
    }//GEN-LAST:event_boton19MouseExited

    private void boton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton19ActionPerformed
        habiDesa(boton19);
    }//GEN-LAST:event_boton19ActionPerformed

    private void boton20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton20MouseExited
        comparacion();
    }//GEN-LAST:event_boton20MouseExited

    private void boton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton20ActionPerformed
        habiDesa(boton20);
    }//GEN-LAST:event_boton20ActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        reinicio();
    }//GEN-LAST:event_reiniciarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton10;
    private javax.swing.JButton boton11;
    private javax.swing.JButton boton12;
    private javax.swing.JButton boton13;
    private javax.swing.JButton boton14;
    private javax.swing.JButton boton15;
    private javax.swing.JButton boton16;
    private javax.swing.JButton boton17;
    private javax.swing.JButton boton18;
    private javax.swing.JButton boton19;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton20;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel puntaje;
    private javax.swing.JButton reiniciar;
    // End of variables declaration//GEN-END:variables
}
