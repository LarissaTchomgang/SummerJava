/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.summercoding.bank.entities;

import com.summercoding.bank.utils.JDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class Compte {
    int idcompte;
    double solde;
    int idutilisateur;
    int idadmin;
    public void save ( double solde, int idutilisateur, int idadmin) throws SQLException {
        
            String command = "INSERT INTO `compte` ( `solde`, `idutilisateur`, `idamin`) VALUES ( ?, ?, ?)";
            PreparedStatement addstmt = JDBC.getConnexion().prepareStatement(command);
            addstmt.setObject(1, solde);
            addstmt.setObject(2, idutilisateur);
            addstmt.setObject(3, idadmin);
            addstmt.execute();
    }
    
    
    public void update ( int idcompte, double solde, int idutilisateur, int idadmin) throws SQLException {
        
            String command = "UPDATE `compte` SET `solde` = ?, `idutilisateur` = ?, `idamin` = ? WHERE `compte`.`idcompte` = ?;";
            PreparedStatement addstmt = JDBC.getConnexion().prepareStatement(command);
            addstmt.setObject(1, solde);
            addstmt.setObject(2, idutilisateur);
            addstmt.setObject(3, idadmin);
            addstmt.setObject(4, idcompte);
            addstmt.execute();
    }

    public void delete ( int idcompte) throws SQLException {
        
            String command = "DELETE FROM admin WHERE `compte`.`idcompte` = ?";
            PreparedStatement addstmt = JDBC.getConnexion().prepareStatement(command);
            addstmt.setObject(1, idcompte);
            addstmt.execute();
    }

    public Compte() {
    }// constructeur par defaut

    public Compte(int idcompte, double solde, int idutilisateur, int idadmin) {
        this.idcompte = idcompte;
        this.solde = solde;
        this.idutilisateur = idutilisateur;
        this.idadmin = idadmin;
    }
    


    public Compte getOne(int idcompte) throws SQLException {
        String cmd = "select * from compte where `compte`.`idcompte` = ?";// afficher toutes les informations de l'id choisi
        
        PreparedStatement stmt = JDBC.getConnexion().prepareStatement(cmd);
        stmt.setObject(1, idcompte);
        ResultSet rs=stmt.executeQuery();
        while (rs.next()) {
            return new Compte (rs.getInt(1), rs.getDouble(2), rs.getInt(3), rs.getInt(4));
        }
        
        return null;
    }
    
    
    public Compte getByLoginAndPassword(int idcompte) throws SQLException {
        String cmd = "select * from compte where idcompte = ?"; 
        
        PreparedStatement stmt = JDBC.getConnexion().prepareStatement(cmd);
        stmt.setObject(1, idcompte); 
        ResultSet rs=stmt.executeQuery();
        while (rs.next()) {
            return new Compte (rs.getInt(1), rs.getDouble(2), rs.getInt(3), rs.getInt(4));
        }
        
        return null;
    }
    
    public List<Compte> getAllCompte() throws SQLException {
        String cmd = "select * from compte";
        
        PreparedStatement stmt = JDBC.getConnexion().prepareStatement(cmd);
        
        ResultSet rs=stmt.executeQuery();
        List<Compte> listCompte = new ArrayList<>();
        while (rs.next()) {
            listCompte.add(new Compte (rs.getInt(1), rs.getDouble(2), rs.getInt(3), rs.getInt(4)));
        }
        
        return listCompte;
    }
    
    
        
    
    
    public int getIdcompte() {
        return idcompte;
    }
    
    public void setIdcompte(int idcompte) {
        this.idcompte = idcompte;
    }
    
    public double getSolde() {
        return solde;
    }
    
    public void setSolde() {
        this.solde = solde;
    }
    
    public int getIdutilisateur() {
        return idutilisateur;
    }
    
    public void setIdutilisateur() {
        this.idutilisateur = idutilisateur;
    }
    
    public int getIdadmin() {
        return idadmin;
    }
    
    public void setIdadmin() {
        this.idadmin = idadmin;
    }
    
    public static void main (String arg[]) throws SQLException {
        try {
            Compte compte = new Compte();
            //compte.save(550, 2, 1);
            //compte.save(175, 5, 3);
            //compte.update (1, 2000, 3, 2);
            String result = compte.getOne(1).toString();
            System.out.println(result);
        
            result = compte.getAllCompte().toString();
            System.out.println(result);

            result = compte.getByLoginAndPassword(1).toString();
                System.out.println(result);
        } catch (SQLException ex) {
            Logger.getLogger(Compte.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
    
    
            
        
    }



