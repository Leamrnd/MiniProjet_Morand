
import java.awt.Color;
import java.util.Random;
//import java.util.Timer;
//import java.util.TimerTask;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author EPF
 */
public class fenetreDeJeu extends javax.swing.JFrame {
        int cpt_pts;
        int record = 0;
        int  nb_parties = -1;
        int cpt_coup = 0;
        Timer chrono;
        Timer chrono60;
        Timer chronotemp;
        
    /**
     * Creates new form fenetreDeJeu
     */
    public fenetreDeJeu() {
        initComponents();
        InitialiserPartie();
        
        fenetre_tempsecoule fenetretemps = new fenetre_tempsecoule();
        
        
        
        ActionListener tache_recur= new ActionListener() {
            int time = 30;
            
            @Override
            public void actionPerformed(ActionEvent e1) {
                
                if (time == 0) {
                    System.out.println("Temps écoulé ! ");
                    chrono.stop();
                    fenetretemps.setVisible(true);
                    timeout();
                    time = 30;
                }
                
                else{
                time--;
                tps_rest.setText(time + "");
                System.out.println(time);
                }
                
            }
        ;};
       
         chrono = new Timer(1000, tache_recur);
         
         
         ActionListener tache_recur2= new ActionListener() {
            int time = 60;
            
            @Override
            public void actionPerformed(ActionEvent e1) {
                
                if (time == 0) {
                    System.out.println("Temps écoulé ! ");
                    chrono.stop();
                    fenetretemps.setVisible(true);
                    timeout();
                    time = 60;
                }
                
                else{
                time--;
                tps_rest.setText(time + "");
                System.out.println(time);
                }
                
            }
        ;};
         
         
       chrono60 = new Timer(1000,tache_recur2); 
        
      chronotemp = chrono;
        
    }
    
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panneau_grille = new javax.swing.JPanel();
        Bouton1 = new javax.swing.JButton();
        Bouton2 = new javax.swing.JButton();
        Bouton3 = new javax.swing.JButton();
        Bouton4 = new javax.swing.JButton();
        Bouton5 = new javax.swing.JButton();
        Bouton6 = new javax.swing.JButton();
        Bouton7 = new javax.swing.JButton();
        Bouton8 = new javax.swing.JButton();
        Bouton9 = new javax.swing.JButton();
        panneau_nom = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panneau_chrono = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tps_rest = new javax.swing.JLabel();
        jRadioButton30s = new javax.swing.JRadioButton();
        jRadioButton60s = new javax.swing.JRadioButton();
        panneau_scores = new javax.swing.JPanel();
        jlab1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Label_Record = new javax.swing.JLabel();
        Label_Score = new javax.swing.JLabel();
        score_max = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nb_part = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(770, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(153, 153, 153));
        panneau_grille.setLayout(new java.awt.GridLayout(3, 3));

        Bouton1.setBackground(new java.awt.Color(0, 0, 204));
        Bouton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton1ActionPerformed(evt);
            }
        });
        panneau_grille.add(Bouton1);

        Bouton2.setBackground(new java.awt.Color(0, 0, 204));
        Bouton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton2ActionPerformed(evt);
            }
        });
        panneau_grille.add(Bouton2);

        Bouton3.setBackground(new java.awt.Color(0, 0, 204));
        Bouton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton3ActionPerformed(evt);
            }
        });
        panneau_grille.add(Bouton3);

        Bouton4.setBackground(new java.awt.Color(0, 0, 204));
        Bouton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton4ActionPerformed(evt);
            }
        });
        panneau_grille.add(Bouton4);

        Bouton5.setBackground(new java.awt.Color(0, 0, 204));
        Bouton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton5ActionPerformed(evt);
            }
        });
        panneau_grille.add(Bouton5);

        Bouton6.setBackground(new java.awt.Color(0, 0, 204));
        Bouton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton6ActionPerformed(evt);
            }
        });
        panneau_grille.add(Bouton6);

        Bouton7.setBackground(new java.awt.Color(0, 0, 204));
        Bouton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton7ActionPerformed(evt);
            }
        });
        panneau_grille.add(Bouton7);

        Bouton8.setBackground(new java.awt.Color(0, 0, 204));
        Bouton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton8ActionPerformed(evt);
            }
        });
        panneau_grille.add(Bouton8);

        Bouton9.setBackground(new java.awt.Color(0, 0, 204));
        Bouton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton9ActionPerformed(evt);
            }
        });
        panneau_grille.add(Bouton9);

        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 410, 440));

        panneau_nom.setBackground(new java.awt.Color(0, 0, 204));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Wide Latin", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("SpeedClick");

        javax.swing.GroupLayout panneau_nomLayout = new javax.swing.GroupLayout(panneau_nom);
        panneau_nom.setLayout(panneau_nomLayout);
        panneau_nomLayout.setHorizontalGroup(
            panneau_nomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_nomLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panneau_nomLayout.setVerticalGroup(
            panneau_nomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_nomLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(panneau_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 430, 100));

        panneau_chrono.setBackground(new java.awt.Color(0, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Chrono");

        jLabel4.setText("sec");

        buttonGroup1.add(jRadioButton30s);
        jRadioButton30s.setSelected(true);
        jRadioButton30s.setText("30 secondes");
        jRadioButton30s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton30sActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton60s);
        jRadioButton60s.setText("60 secondes");
        jRadioButton60s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton60sActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panneau_chronoLayout = new javax.swing.GroupLayout(panneau_chrono);
        panneau_chrono.setLayout(panneau_chronoLayout);
        panneau_chronoLayout.setHorizontalGroup(
            panneau_chronoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_chronoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panneau_chronoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton60s)
                    .addComponent(jRadioButton30s))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(tps_rest, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(37, 37, 37))
            .addGroup(panneau_chronoLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panneau_chronoLayout.setVerticalGroup(
            panneau_chronoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_chronoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(16, 16, 16)
                .addGroup(panneau_chronoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panneau_chronoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jRadioButton30s))
                    .addComponent(tps_rest, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton60s)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panneau_chrono, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 280, -1));

        panneau_scores.setBackground(new java.awt.Color(102, 102, 102));

        jlab1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlab1.setForeground(new java.awt.Color(255, 255, 255));
        jlab1.setText("Scores");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Score actuel :");

        Label_Record.setForeground(new java.awt.Color(255, 255, 255));
        Label_Record.setText("Record :");

        Label_Score.setForeground(new java.awt.Color(255, 255, 255));

        score_max.setForeground(new java.awt.Color(255, 255, 255));

        jButton10.setText("Rejouer");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de parties jouées :");

        nb_part.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panneau_scoresLayout = new javax.swing.GroupLayout(panneau_scores);
        panneau_scores.setLayout(panneau_scoresLayout);
        panneau_scoresLayout.setHorizontalGroup(
            panneau_scoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_scoresLayout.createSequentialGroup()
                .addGroup(panneau_scoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panneau_scoresLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panneau_scoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Label_Record)
                            .addComponent(jLabel2))
                        .addGap(44, 44, 44)
                        .addGroup(panneau_scoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Score, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nb_part, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(score_max, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panneau_scoresLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButton10))
                    .addGroup(panneau_scoresLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jlab1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panneau_scoresLayout.setVerticalGroup(
            panneau_scoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_scoresLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panneau_scoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panneau_scoresLayout.createSequentialGroup()
                        .addComponent(jlab1)
                        .addGap(26, 26, 26)
                        .addComponent(Label_Score, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(panneau_scoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(score_max, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Record, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(panneau_scoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nb_part, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addComponent(jButton10)
                .addGap(38, 38, 38))
        );

        getContentPane().add(panneau_scores, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 260, 290));

        jButton1.setText("Version 4 x 4");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 110, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/saturne.jpg"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(770, 570));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 610));

        setBounds(0, 0, 814, 613);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        chrono.stop();
        timein();
        InitialiserPartie();
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void Bouton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton1ActionPerformed
        // TODO add your handling code here:
        
        if (Bouton1.getBackground() == Color.CYAN) {
            Bouton1.setBackground(Color.BLUE);
            supp_bouton_blanc();
            allumerCaseAlea();
            allumerpiege();
            cpt_pts += 1;
            Label_Score.setText(cpt_pts + "");
            cpt_coup += 1;
            if (cpt_coup == 1) {
              chrono.start();
              if (chrono == chronotemp) {
                PlayMusic("v3x3_30sec.wav");
                jButton1.setEnabled(false);
                jButton10.setEnabled(false);
              }
              else {
                PlayMusic("v3x3_60sec.wav");  
                jButton1.setEnabled(false);
                jButton10.setEnabled(false);
              }
              
            }
        }
        else if(Bouton1.getBackground() == Color.white) {
            cpt_pts -= 3;
            Label_Score.setText(cpt_pts + "");
            Bouton1.setBackground(Color.BLUE);
            
        }
        else{
            cpt_pts -= 1;
            Label_Score.setText(cpt_pts + "");
        }
    }//GEN-LAST:event_Bouton1ActionPerformed

    private void Bouton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton5ActionPerformed
        // TODO add your handling code here:
        
        if (Bouton5.getBackground() == Color.CYAN) {
            Bouton5.setBackground(Color.BLUE);
            supp_bouton_blanc();
            allumerCaseAlea();
            allumerpiege();
            cpt_pts += 1;
            Label_Score.setText(cpt_pts + "");
            cpt_coup += 1;
            if (cpt_coup == 1) {
              chrono.start();
              if (chrono == chronotemp) {
                PlayMusic("v3x3_30sec.wav");
                jButton1.setEnabled(false);
                jButton10.setEnabled(false);
              }
              else {
                PlayMusic("v3x3_60sec.wav");  
                jButton1.setEnabled(false);
                jButton10.setEnabled(false);
              }
            }
        }
        else if(Bouton5.getBackground() == Color.white) {
            cpt_pts -= 3;
            Label_Score.setText(cpt_pts + "");
            Bouton5.setBackground(Color.BLUE);
            
        }
        else{
            cpt_pts -= 1;
            Label_Score.setText(cpt_pts + "");
        }
    }//GEN-LAST:event_Bouton5ActionPerformed

    private void Bouton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton2ActionPerformed
        // TODO add your handling code here:
        
        if (Bouton2.getBackground() == Color.CYAN) {
            Bouton2.setBackground(Color.BLUE);
            supp_bouton_blanc();
            allumerCaseAlea();
            allumerpiege();
            cpt_pts += 1;
            Label_Score.setText(cpt_pts + "");
            cpt_coup += 1;
            if (cpt_coup == 1) {
              chrono.start();
              if (chrono == chronotemp) {
                PlayMusic("v3x3_30sec.wav");
                jButton1.setEnabled(false);
                jButton10.setEnabled(false);
              }
              else {
                PlayMusic("v3x3_60sec.wav");  
                jButton1.setEnabled(false);
                jButton10.setEnabled(false);
              }
              
            }
        }
        else if(Bouton2.getBackground() == Color.white) {
            cpt_pts -= 3;
            Label_Score.setText(cpt_pts + "");
            Bouton2.setBackground(Color.BLUE);
            
        }
        else{
            cpt_pts -= 1;
            Label_Score.setText(cpt_pts + "");
        }
    }//GEN-LAST:event_Bouton2ActionPerformed

    private void Bouton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton3ActionPerformed
        // TODO add your handling code here:
        
        if (Bouton3.getBackground() == Color.CYAN) {
            Bouton3.setBackground(Color.BLUE);
            supp_bouton_blanc();
            allumerCaseAlea();
            allumerpiege();
            cpt_pts += 1;
            Label_Score.setText(cpt_pts + "");
            cpt_coup += 1;
            if (cpt_coup == 1) {
              chrono.start();
              if (chrono == chronotemp) {
                PlayMusic("v3x3_30sec.wav");
                jButton1.setEnabled(false);
                jButton10.setEnabled(false);
              }
              else {
                PlayMusic("v3x3_60sec.wav");  
                jButton1.setEnabled(false);
                jButton10.setEnabled(false);
              }
              
            }
        }
        else if(Bouton3.getBackground() == Color.white) {
            cpt_pts -= 3;
            Label_Score.setText(cpt_pts + "");
            Bouton3.setBackground(Color.BLUE);
            
        }
        else{
            cpt_pts -= 1;
            Label_Score.setText(cpt_pts + "");
        }
    }//GEN-LAST:event_Bouton3ActionPerformed

    private void Bouton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton4ActionPerformed
        // TODO add your handling code here:
        
        if (Bouton4.getBackground() == Color.CYAN) {
            Bouton4.setBackground(Color.BLUE);
            supp_bouton_blanc();
            allumerCaseAlea();
            allumerpiege();
            cpt_pts += 1;
            Label_Score.setText(cpt_pts + "");
            cpt_coup += 1;
            if (cpt_coup == 1) {
              chrono.start();
              if (chrono == chronotemp) {
                PlayMusic("v3x3_30sec.wav");
                jButton1.setEnabled(false);
                jButton10.setEnabled(false);
              }
              else {
                PlayMusic("v3x3_60sec.wav");  
                jButton1.setEnabled(false);
                jButton10.setEnabled(false);
              }
              
            }
        }
        else if(Bouton4.getBackground() == Color.white) {
            cpt_pts -= 3;
            Label_Score.setText(cpt_pts + "");
            Bouton4.setBackground(Color.BLUE);
            
        }
        else{
            cpt_pts -= 1;
            Label_Score.setText(cpt_pts + "");
        }
    }//GEN-LAST:event_Bouton4ActionPerformed

    private void Bouton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton6ActionPerformed
        // TODO add your handling code here:
        
        if (Bouton6.getBackground() == Color.CYAN) {
            Bouton6.setBackground(Color.BLUE);
            supp_bouton_blanc();
            allumerCaseAlea();
            allumerpiege();
            cpt_pts += 1;
            Label_Score.setText(cpt_pts + "");
            cpt_coup += 1;
            if (cpt_coup == 1) {
              chrono.start();
              if (chrono == chronotemp) {
                PlayMusic("v3x3_30sec.wav");
                jButton1.setEnabled(false);
                jButton10.setEnabled(false);
              }
              else {
                PlayMusic("v3x3_60sec.wav");  
                jButton1.setEnabled(false);
                jButton10.setEnabled(false);
              }
              
            }
        }
        else if(Bouton6.getBackground() == Color.white) {
            cpt_pts -= 3;
            Label_Score.setText(cpt_pts + "");
            Bouton6.setBackground(Color.BLUE);
            
        }
        else{
            cpt_pts -= 1;
            Label_Score.setText(cpt_pts + "");
        }
    }//GEN-LAST:event_Bouton6ActionPerformed

    private void Bouton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton7ActionPerformed
        // TODO add your handling code here:
        
        if (Bouton7.getBackground() == Color.CYAN) {
            Bouton7.setBackground(Color.BLUE);
            supp_bouton_blanc();
            allumerCaseAlea();
            allumerpiege();
            cpt_pts += 1;
            Label_Score.setText(cpt_pts + "");
            cpt_coup += 1;
            if (cpt_coup == 1) {
              chrono.start();
              if (chrono == chronotemp) {
                PlayMusic("v3x3_30sec.wav");
                jButton1.setEnabled(false);
                jButton10.setEnabled(false);
              }
              else {
                PlayMusic("v3x3_60sec.wav");  
                jButton1.setEnabled(false);
                jButton10.setEnabled(false);
              }
              
            }
        }
        else if(Bouton7.getBackground() == Color.white) {
            cpt_pts -= 3;
            Label_Score.setText(cpt_pts + "");
            Bouton7.setBackground(Color.BLUE);
            
        }
        else{
            cpt_pts -= 1;
            Label_Score.setText(cpt_pts + "");
        }
    }//GEN-LAST:event_Bouton7ActionPerformed

    private void Bouton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton8ActionPerformed
        // TODO add your handling code here:
      
        if (Bouton8.getBackground() == Color.CYAN) {
            Bouton8.setBackground(Color.BLUE);
            supp_bouton_blanc();
            allumerCaseAlea();
            allumerpiege();
            cpt_pts += 1;
            Label_Score.setText(cpt_pts + "");
            cpt_coup += 1;
            if (cpt_coup == 1) {
              chrono.start();
              if (chrono == chronotemp) {
                PlayMusic("v3x3_30sec.wav");
                jButton1.setEnabled(false);
                jButton10.setEnabled(false);
              }
              else {
                PlayMusic("v3x3_60sec.wav");  
                jButton1.setEnabled(false);
                jButton10.setEnabled(false);
              }
              
            }
        }
        else if(Bouton8.getBackground() == Color.white) {
            cpt_pts -= 3;
            Label_Score.setText(cpt_pts + "");
            Bouton8.setBackground(Color.BLUE);
            
        }
        else{
            cpt_pts -= 1;
            Label_Score.setText(cpt_pts + "");
        }
    }//GEN-LAST:event_Bouton8ActionPerformed

    private void Bouton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton9ActionPerformed
        // TODO add your handling code here:
        if (Bouton9.getBackground() == Color.CYAN) {
            Bouton9.setBackground(Color.BLUE);
            supp_bouton_blanc();
            allumerCaseAlea();
            allumerpiege();
            cpt_pts += 1;
            Label_Score.setText(cpt_pts + "");
            cpt_coup += 1;
            if (cpt_coup == 1) {
              chrono.start();
              if (chrono == chronotemp) {
                PlayMusic("v3x3_30sec.wav");
                jButton1.setEnabled(false);
                jButton10.setEnabled(false);
              }
              else {
                PlayMusic("v3x3_60sec.wav");  
                jButton1.setEnabled(false);
                jButton10.setEnabled(false);
              }
              
            }
        }
        else if(Bouton9.getBackground() == Color.white) {
            cpt_pts -= 3;
            Label_Score.setText(cpt_pts + "");
            Bouton9.setBackground(Color.BLUE);
            
        }
        else {
            cpt_pts -= 1;
            Label_Score.setText(cpt_pts + "");
        }
    }//GEN-LAST:event_Bouton9ActionPerformed

    private void jRadioButton30sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton30sActionPerformed
        // TODO add your handling code here:
        if (jRadioButton30s.isSelected() == true) {
            chrono = chronotemp;
        }
    }//GEN-LAST:event_jRadioButton30sActionPerformed

    private void jRadioButton60sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton60sActionPerformed
        // TODO add your handling code here:
        
        if (jRadioButton60s.isSelected() == true) {
            chronotemp = chrono;
            chrono = chrono60;
        }
    }//GEN-LAST:event_jRadioButton60sActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        fenetrev4x4 fen4 = new fenetrev4x4();
        fen4.setVisible(true);
        fenetreDeJeu.super.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDeJeu().setVisible(true);
                
                               
            }
        });
    }
    
    public void allumerCaseAlea() {
        int nbbutt;
        int bouton_piege;
        int presence_piege;
        nbbutt = new Random().nextInt(9)+ 1 ;
        System.out.println(nbbutt);
        
        if (nbbutt == 1) {
            Bouton1.setBackground(Color.CYAN);
        }
        if (nbbutt == 2) {
            Bouton2.setBackground(Color.CYAN);
        }
        if (nbbutt == 3) {
            Bouton3.setBackground(Color.CYAN);
        }
        if (nbbutt == 4) {
            Bouton4.setBackground(Color.CYAN);
        }
        if (nbbutt == 5) {
            Bouton5.setBackground(Color.CYAN);
        }
        if (nbbutt == 6) {
            Bouton6.setBackground(Color.CYAN);
        }
        if (nbbutt == 7) {
            Bouton7.setBackground(Color.CYAN);
        }
        if (nbbutt == 8) {
            Bouton8.setBackground(Color.CYAN);
        }
        if (nbbutt == 9) {
            Bouton9.setBackground(Color.CYAN);
        }
    }
        
        
    public void allumerpiege() {  
        int presence_piege;
        int bouton_piege;
        presence_piege = new Random().nextInt(5) + 1;
        
        if (presence_piege == 4) {
        
            bouton_piege = new Random().nextInt(9) + 1;

             if (bouton_piege == 1 && Bouton1.getBackground() != Color.CYAN) {
                Bouton1.setBackground(Color.white);
            }

             if (bouton_piege == 2 && Bouton2.getBackground() != Color.CYAN) {
                Bouton2.setBackground(Color.white);
            }

             if (bouton_piege == 3 && Bouton3.getBackground() != Color.CYAN) {
                Bouton3.setBackground(Color.white);
            }

             if (bouton_piege == 4 && Bouton4.getBackground() != Color.CYAN) {
                Bouton4.setBackground(Color.white);
            }

             if (bouton_piege == 5 && Bouton5.getBackground() != Color.CYAN) {
                Bouton5.setBackground(Color.white);
            }

             if (bouton_piege == 6 && Bouton6.getBackground() != Color.CYAN) {
                Bouton6.setBackground(Color.white);
            }

              if (bouton_piege == 7 && Bouton7.getBackground() != Color.CYAN) {
                Bouton7.setBackground(Color.white);
            }

              if (bouton_piege == 8 && Bouton8.getBackground() != Color.CYAN) {
                Bouton8.setBackground(Color.white);
            }

              if (bouton_piege == 9 && Bouton9.getBackground() != Color.CYAN) {
                Bouton9.setBackground(Color.white);
            }
        } 
    }
    
    
    public void supp_bouton_blanc() {
        if (Bouton1.getBackground() == Color.white) {
            Bouton1.setBackground(Color.blue);
        }
        
        if (Bouton2.getBackground() == Color.white) {
            Bouton2.setBackground(Color.blue);
        }
        
        if (Bouton3.getBackground() == Color.white) {
            Bouton3.setBackground(Color.blue);
        }
        
        if (Bouton4.getBackground() == Color.white) {
            Bouton4.setBackground(Color.blue);
        }
        
        if (Bouton5.getBackground() == Color.white) {
            Bouton5.setBackground(Color.blue);
        }
        
        if (Bouton6.getBackground() == Color.white) {
            Bouton6.setBackground(Color.blue);
        }
        
        if (Bouton7.getBackground() == Color.white) {
            Bouton7.setBackground(Color.blue);
        }
        
        if (Bouton8.getBackground() == Color.white) {
            Bouton8.setBackground(Color.blue);
        }
        
        if (Bouton9.getBackground() == Color.white) {
            Bouton9.setBackground(Color.blue);
        }
    }
    
    
    public void timeout() {
      Bouton1.setEnabled(false);
      Bouton2.setEnabled(false);
      Bouton3.setEnabled(false);
      Bouton4.setEnabled(false);
      Bouton5.setEnabled(false);
      Bouton6.setEnabled(false);
      Bouton7.setEnabled(false);
      Bouton8.setEnabled(false);
      Bouton9.setEnabled(false);
      
      jButton1.setEnabled(true);
      jButton10.setEnabled(true);
      
    }
  
  
    public void timein() {
      Bouton1.setEnabled(true);
      Bouton2.setEnabled(true);
      Bouton3.setEnabled(true);
      Bouton4.setEnabled(true);
      Bouton5.setEnabled(true);
      Bouton6.setEnabled(true);
      Bouton7.setEnabled(true);
      Bouton8.setEnabled(true);
      Bouton9.setEnabled(true);
      
      jButton1.setEnabled(false);
      
    }
    
    
    
    
    public void InitialiserPartie() {
        if (cpt_pts > record) {
            record = cpt_pts;
        }
        cpt_pts = 0;
        cpt_coup = 0;
        nb_parties += 1;
        nb_part.setText(nb_parties +"");
        score_max.setText(record + "");
        Label_Score.setText(cpt_pts + "");
        Bouton1.setBackground(Color.blue);
        Bouton2.setBackground(Color.blue);
        Bouton3.setBackground(Color.blue);
        Bouton4.setBackground(Color.blue);
        Bouton5.setBackground(Color.blue);
        Bouton6.setBackground(Color.blue);
        Bouton7.setBackground(Color.blue);
        Bouton8.setBackground(Color.blue);
        Bouton9.setBackground(Color.blue);
        
        allumerCaseAlea();
        
        //remettre le chrono au debut
    }
    
    
    public static void PlayMusic(String location) {
        try {
            File musicPath = new File(location);
            if(musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            }
            else {
                System.out.println("Trouve pas le fichier");
            }
        }catch(Exception e) {
           
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bouton1;
    private javax.swing.JButton Bouton2;
    private javax.swing.JButton Bouton3;
    private javax.swing.JButton Bouton4;
    private javax.swing.JButton Bouton5;
    private javax.swing.JButton Bouton6;
    private javax.swing.JButton Bouton7;
    private javax.swing.JButton Bouton8;
    private javax.swing.JButton Bouton9;
    private javax.swing.JLabel Label_Record;
    private javax.swing.JLabel Label_Score;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton30s;
    private javax.swing.JRadioButton jRadioButton60s;
    private javax.swing.JLabel jlab1;
    private javax.swing.JLabel nb_part;
    private javax.swing.JPanel panneau_chrono;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_nom;
    private javax.swing.JPanel panneau_scores;
    private javax.swing.JLabel score_max;
    private javax.swing.JLabel tps_rest;
    // End of variables declaration//GEN-END:variables
}
