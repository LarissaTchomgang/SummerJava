/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.summercoding.bank.controlleur;

import com.summercoding.bank.entities.Admin;
import com.summercoding.bank.entities.Compte;
import com.summercoding.bank.entities.Utilisateur;
import com.summercoding.bank.gestionnaires.GestionnaireAdmin;
import com.summercoding.bank.gestionnaires.GestionnaireCompte;
import com.summercoding.bank.gestionnaires.GestionnaireUtilisateur;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Moi
 */
public class Controlleur {
    
    GestionnaireAdmin gestionnaireadmin = new GestionnaireAdmin();
    
    GestionnaireUtilisateur gestionnaireutilisateur = new GestionnaireUtilisateur();
    
    GestionnaireCompte gestionnairecompte = new GestionnaireCompte();
    
    
    public Admin routeVersLoginAdministrateur(String login, String password) throws SQLException {
        return gestionnaireadmin.login(login, password);// controlleur du login pour admin
    }
    
    public Utilisateur routeVersLoginUtilisateur(String login, String password) throws SQLException{
        return gestionnaireutilisateur.login(login, password); 
    }
        
    
    
    /*public void Utilisateur routeVersLogin(String login, String password) throws SQLException {
        gestionnaireutilisateur.loginUtilisateur(login, password);// controlleur du login pour admin
    }*/
    
    public void routeVersSaveAdmin(String login, String password, String nom) throws SQLException {
         gestionnaireadmin.saveAdmin(login, password, nom); // controlleur de l'admin
    }
    
    public void routeVersSaveUtilisateur(String login, String password, String nom, String prenom, LocalDate DateNaissance, String genre, int idadmin) throws SQLException {
        gestionnaireutilisateur.saveUtilisateur(login, password, nom, prenom, DateNaissance, genre, idadmin); // controlleur de l'utilisateur
    }
    
    public void routeVersSaveCompte(double solde, int idutilisateur, int idadmin) throws SQLException {
        gestionnairecompte.saveCompte(solde, idutilisateur, idadmin); // controlleur du compte
    }
    
    public List<Admin>routeVersListAllAdmin() throws SQLException {// pour les listes des admins qui se dérouleront avec le combobox
        return gestionnaireadmin.listAllAdmin();
    } 
    
   
    public List<Utilisateur>routeVersListAllUtilisateur() throws SQLException {//pour les listes des utilisateurs qui se derouleront avec le combobox
        return gestionnaireutilisateur.listAllUtilisateur();
    }
    
    public List<Compte>routeVersListAllCompte() throws SQLException {
        return gestionnairecompte.listAllCompte();
    }
}
