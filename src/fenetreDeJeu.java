
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author EPF
 */
public class fenetreDeJeu extends javax.swing.JFrame {

    /**
     * Creates new form fenetreDeJeu
     */
    public fenetreDeJeu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_grille = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        panneau_nom = new javax.swing.JPanel();
        panneau_chrono = new javax.swing.JPanel();
        panneau_scores = new javax.swing.JPanel();
        jlab1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        score_partie = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        score_max = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(153, 153, 153));
        panneau_grille.setLayout(new java.awt.GridLayout(3, 3));

        jButton1.setBackground(new java.awt.Color(0, 0, 204));
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panneau_grille.add(jButton1);

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setText("jButton2");
        panneau_grille.add(jButton2);

        jButton4.setBackground(new java.awt.Color(0, 0, 204));
        jButton4.setText("jButton4");
        panneau_grille.add(jButton4);

        jButton3.setBackground(new java.awt.Color(0, 0, 204));
        jButton3.setText("jButton3");
        panneau_grille.add(jButton3);

        jButton5.setBackground(new java.awt.Color(0, 0, 204));
        jButton5.setText("jButton5");
        panneau_grille.add(jButton5);

        jButton7.setBackground(new java.awt.Color(0, 0, 204));
        jButton7.setText("jButton7");
        panneau_grille.add(jButton7);

        jButton6.setBackground(new java.awt.Color(0, 0, 204));
        jButton6.setText("jButton6");
        panneau_grille.add(jButton6);

        jButton8.setBackground(new java.awt.Color(0, 0, 204));
        jButton8.setText("jButton8");
        panneau_grille.add(jButton8);

        jButton9.setBackground(new java.awt.Color(0, 0, 204));
        jButton9.setText("jButton9");
        panneau_grille.add(jButton9);

        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 410, 440));

        panneau_nom.setBackground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout panneau_nomLayout = new javax.swing.GroupLayout(panneau_nom);
        panneau_nom.setLayout(panneau_nomLayout);
        panneau_nomLayout.setHorizontalGroup(
            panneau_nomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        panneau_nomLayout.setVerticalGroup(
            panneau_nomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(panneau_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 430, -1));

        panneau_chrono.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout panneau_chronoLayout = new javax.swing.GroupLayout(panneau_chrono);
        panneau_chrono.setLayout(panneau_chronoLayout);
        panneau_chronoLayout.setHorizontalGroup(
            panneau_chronoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        panneau_chronoLayout.setVerticalGroup(
            panneau_chronoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(panneau_chrono, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 280, -1));

        panneau_scores.setBackground(new java.awt.Color(204, 204, 204));

        jlab1.setText("Scores");

        jLabel1.setText("Score actuel :");

        score_partie.setText("jLabel2");

        jLabel2.setText("Record :");

        score_max.setText("jLabel3");

        jButton10.setText("Rejouer");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panneau_scoresLayout = new javax.swing.GroupLayout(panneau_scores);
        panneau_scores.setLayout(panneau_scoresLayout);
        panneau_scoresLayout.setHorizontalGroup(
            panneau_scoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_scoresLayout.createSequentialGroup()
                .addGroup(panneau_scoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panneau_scoresLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jlab1))
                    .addGroup(panneau_scoresLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panneau_scoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panneau_scoresLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(score_max))
                            .addGroup(panneau_scoresLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(53, 53, 53)
                                .addComponent(score_partie))))
                    .addGroup(panneau_scoresLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButton10)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        panneau_scoresLayout.setVerticalGroup(
            panneau_scoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_scoresLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jlab1)
                .addGap(36, 36, 36)
                .addGroup(panneau_scoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(score_partie))
                .addGap(41, 41, 41)
                .addGroup(panneau_scoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(score_max))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(38, 38, 38))
        );

        getContentPane().add(panneau_scores, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 260, 290));

        setBounds(0, 0, 814, 613);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        this.allumerCaseAlea();
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setBackground(Color.CYAN);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlab1;
    private javax.swing.JPanel panneau_chrono;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_nom;
    private javax.swing.JPanel panneau_scores;
    private javax.swing.JLabel score_max;
    private javax.swing.JLabel score_partie;
    // End of variables declaration//GEN-END:variables
}
