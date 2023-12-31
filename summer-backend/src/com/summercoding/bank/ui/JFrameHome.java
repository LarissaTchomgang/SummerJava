/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.summercoding.bank.ui;

import com.summercoding.bank.controlleur.Controlleur;
import com.summercoding.bank.entities.Admin;
import com.summercoding.bank.entities.Compte;
import com.summercoding.bank.entities.Utilisateur;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Moi
 */
public class JFrameHome extends javax.swing.JFrame {
    Controlleur controlleur = new Controlleur();
    JFrameSaveAdmin frameSaveAdmin = new JFrameSaveAdmin();

    /**
     * Creates new form JFrameHome
     */
    public JFrameHome() {
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

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuAdministrateur = new javax.swing.JMenu();
        MenuCreerA = new javax.swing.JMenuItem();
        MenuListerA = new javax.swing.JMenuItem();
        MenuUtilisateur = new javax.swing.JMenu();
        MenuCréerU = new javax.swing.JMenuItem();
        MenuListerU = new javax.swing.JMenuItem();
        MenuCompte = new javax.swing.JMenu();
        MenuCreerC = new javax.swing.JMenuItem();
        MenuListerC = new javax.swing.JMenuItem();
        MenuApropos = new javax.swing.JMenu();
        MenuAide = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("jMenu7");

        jMenuItem1.setText("jMenuItem1");

        jMenu11.setText("jMenu11");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("File");
        jMenuBar3.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar3.add(jMenu2);

        jMenu8.setText("File");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar4.add(jMenu9);

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PAGE D'ACCUEIL");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        MenuAdministrateur.setText("Administrateur");
        MenuAdministrateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdministrateurActionPerformed(evt);
            }
        });

        MenuCreerA.setText("Créer");
        MenuCreerA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCreerAActionPerformed(evt);
            }
        });
        MenuAdministrateur.add(MenuCreerA);

        MenuListerA.setText("Lister");
        MenuListerA.setToolTipText("");
        MenuListerA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListerAActionPerformed(evt);
            }
        });
        MenuAdministrateur.add(MenuListerA);

        jMenuBar1.add(MenuAdministrateur);

        MenuUtilisateur.setText("Utilisateur");

        MenuCréerU.setText("Créer");
        MenuCréerU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCréerUActionPerformed(evt);
            }
        });
        MenuUtilisateur.add(MenuCréerU);

        MenuListerU.setText("Lister");
        MenuListerU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListerUActionPerformed(evt);
            }
        });
        MenuUtilisateur.add(MenuListerU);

        jMenuBar1.add(MenuUtilisateur);

        MenuCompte.setText("Compte");

        MenuCreerC.setText("Créer");
        MenuCreerC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCreerCActionPerformed(evt);
            }
        });
        MenuCompte.add(MenuCreerC);

        MenuListerC.setText("Lister");
        MenuListerC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListerCActionPerformed(evt);
            }
        });
        MenuCompte.add(MenuListerC);

        jMenuBar1.add(MenuCompte);

        MenuApropos.setText("A Propos");
        jMenuBar1.add(MenuApropos);

        MenuAide.setText("Aide");
        jMenuBar1.add(MenuAide);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCreerAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCreerAActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false); on ne ferme pas la page home car c'est de la qu'on pourra aller où nous voulons
        new JFrameSaveAdmin().setVisible(true);
    }//GEN-LAST:event_MenuCreerAActionPerformed

    private void MenuAdministrateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAdministrateurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuAdministrateurActionPerformed

    private void MenuListerAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListerAActionPerformed
        try {
            // TODO add your handling code here:
            //ajout manuel des données
            /*String[] columns = new String [] {
                "Id", "Nom", "Login"
            };
            
            String[] [] datas = new String [] [] {
                {"1", "ad", "adminus"},
                {"2", "root", "root"},
                {"3", "iro", "iro"},
                {"4", "toto", "toto"},
                {"5", "tata", "tata"}
            };*/
            List<Admin> listAdmin = controlleur.routeVersListAllAdmin();
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Id");
            model.addColumn("Nom");
            model.addColumn("Login");
            
            for (Admin ad : listAdmin) {
                model.addRow(new String[] {ad.getIdadmin()+"", ad.getNom()+"", ad.getLogin()});
            }
            
            table.setModel(model );
        } catch (SQLException ex) {
            Logger.getLogger(JFrameHome.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erreur!!! \n Svp veillez réessayer");
        }
    }//GEN-LAST:event_MenuListerAActionPerformed

    private void MenuCréerUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCréerUActionPerformed
        // TODO add your handling code here:
        new JFrameSaveUtilisateur1().setVisible(true);
    }//GEN-LAST:event_MenuCréerUActionPerformed

    private void MenuListerUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListerUActionPerformed
        try {
            // TODO add your handling code here:
            List<Utilisateur> listUtilisateur = controlleur.routeVersListAllUtilisateur();
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Id");
            model.addColumn("Login");
            model.addColumn("Nom");
            model.addColumn("Prenom");
            model.addColumn("Date de Naissance");
            model.addColumn("genre");
            model.addColumn("Id Admin");
            
            for (Utilisateur ad : listUtilisateur) {
                model.addRow(new Object[] {ad.getIdutilisateur()+"", ad.getLogin()+"",  ad.getNom()+"", ad.getPrenom()+"", ad.getDatenaissance()+"", ad.getGenre()+"", ad.getIdadmin()});
            }
            
            table.setModel(model);
                    } catch (SQLException ex) {
            Logger.getLogger(JFrameHome.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erreur!!! \n Svp veillez réessayer");
        }
    }//GEN-LAST:event_MenuListerUActionPerformed

    private void MenuCreerCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCreerCActionPerformed
        // TODO add your handling code here:
        new JFrameSaveCompte().setVisible(true);
    }//GEN-LAST:event_MenuCreerCActionPerformed

    private void MenuListerCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListerCActionPerformed
        try {
            // TODO add your handling code here:
            List<Compte> listCompte = controlleur.routeVersListAllCompte();
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Id Compte");
            model.addColumn("Solde");
            model.addColumn("Id Utilisateur");
            model.addColumn("Id Admin"); 
            
            for (Compte ad : listCompte) {
                model.addRow(new Object [] {ad.getIdcompte()+"", ad.getSolde()+"", ad.getIdutilisateur()+"", ad.getIdadmin()});
            }
            
            table.setModel(model);
            
        } catch (SQLException ex) {
            Logger.getLogger(JFrameHome.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erreur!!! \n Svp veillez réessayer");
        }
    }//GEN-LAST:event_MenuListerCActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAdministrateur;
    private javax.swing.JMenu MenuAide;
    private javax.swing.JMenu MenuApropos;
    private javax.swing.JMenu MenuCompte;
    private javax.swing.JMenuItem MenuCreerA;
    private javax.swing.JMenuItem MenuCreerC;
    private javax.swing.JMenuItem MenuCréerU;
    private javax.swing.JMenuItem MenuListerA;
    private javax.swing.JMenuItem MenuListerC;
    private javax.swing.JMenuItem MenuListerU;
    private javax.swing.JMenu MenuUtilisateur;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
