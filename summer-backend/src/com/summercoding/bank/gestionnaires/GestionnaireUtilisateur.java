/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.summercoding.bank.gestionnaires;

import com.summercoding.bank.entities.Admin;
import com.summercoding.bank.entities.Utilisateur;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author Moi
 */
public class GestionnaireUtilisateur {
    //
    private Utilisateur utilisateur = new Utilisateur();
    public Utilisateur login(String login, String password) throws SQLException{
        return utilisateur.getByLoginAndPassword(login, password);
    }
    
    public void saveUtilisateur(String login, String password, String nom, String prenom, LocalDate DateNaissance, String genre, int idadmin) throws SQLException {
        utilisateur.save(login, password, nom, prenom, DateNaissance, genre, idadmin);
        //if()
    }

    public List<Utilisateur> listAllUtilisateur() throws SQLException {
        return utilisateur.getAllUtilisateur();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
