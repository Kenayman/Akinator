package akinatorlol;

import javafx.scene.layout.Background;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Eduardo
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface2
     */
    Arbol ar = new Arbol();

    public Interface() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        BtSim.setVisible(false);
        BtNao.setVisible(false);
        BtJogar.setVisible(false);
        ar.CriarArvore();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        LPergunta = new javax.swing.JLabel();
        LImagem = new javax.swing.JLabel();
        BtIniciar = new javax.swing.JButton();
        BtNao = new javax.swing.JButton();
        BtJogar = new javax.swing.JButton();
        BtSim = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        LPergunta.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        LPergunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LPergunta.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BtIniciar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtIniciar.setText("INICIAR");
        BtIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtIniciarActionPerformed(evt);
            }
        });

        BtNao.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtNao.setText("No");
        BtNao.setEnabled(false);
        BtNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtNaoActionPerformed(evt);
            }
        });

        BtJogar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtJogar.setText("Jugar Nuevamente");
        BtJogar.setEnabled(false);
        BtJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtJogarActionPerformed(evt);
            }
        });

        BtSim.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtSim.setText("Si");
        BtSim.setEnabled(false);
        BtSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LPergunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtSim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(BtJogar)
                        .addGap(308, 308, 308)
                        .addComponent(BtNao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 1215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(346, 346, 346))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(LPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtSim, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtNao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Fundo.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtIniciarActionPerformed
        // TODO add your handling code here:
        ar.inicio();
        BtSim.setEnabled(true);
        BtSim.setVisible(true);
        BtNao.setEnabled(true);
        BtNao.setVisible(true);
        BtIniciar.setEnabled(false);
        BtIniciar.setVisible(false);
        LPergunta.setText(ar.peguntas(ar.temp));
    }//GEN-LAST:event_BtIniciarActionPerformed

    private void BtSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSimActionPerformed
        // TODO add your handling code here:
        LPergunta.setText(ar.peguntas(ar.temp.getEsq()));
        if (ar.temp.getEsq() == null) {
            BtSim.setEnabled(false);
            BtSim.setVisible(false);
            BtNao.setEnabled(false);
            BtNao.setVisible(false);
            BtJogar.setVisible(true);
            BtJogar.setEnabled(true);
            LImagem.setIcon(new javax.swing.ImageIcon("C:\\Users\\edrye\\Documents\\NetBeansProjects\\AkinatorLOL\\League\\"+ar.temp.getvalor+".jpg"));
        }
    }//GEN-LAST:event_BtSimActionPerformed

    private void BtNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtNaoActionPerformed
           // TODO add your handling code here:
        LPergunta.setText(ar.peguntas(ar.temp.getDir()));
        if (ar.temp.getDir() == null) {
            BtSim.setEnabled(false);
            BtSim.setVisible(false);
            BtNao.setEnabled(false);
            BtNao.setVisible(false);
            BtJogar.setVisible(true);
            BtJogar.setEnabled(true);
            LImagem.setIcon(new javax.swing.ImageIcon("C:\\Users\\edrye\\Documents\\NetBeansProjects\\AkinatorLOL\\League\\"+ar.temp.getvalor+".jpg"));
        }
    }//GEN-LAST:event_BtNaoActionPerformed

    private void BtJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtJogarActionPerformed
        // TODO add your handling code here:
        BtIniciar.setEnabled(true);
        BtIniciar.setVisible(true);
        BtJogar.setVisible(false);
        BtJogar.setEnabled(false);
        LPergunta.setText("");
        LImagem.setIcon(null);
    }//GEN-LAST:event_BtJogarActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtIniciar;
    private javax.swing.JButton BtJogar;
    private javax.swing.JButton BtNao;
    private javax.swing.JButton BtSim;
    private javax.swing.JLabel LImagem;
    private javax.swing.JLabel LPergunta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
