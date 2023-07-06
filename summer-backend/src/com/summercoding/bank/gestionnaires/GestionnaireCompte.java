/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.summercoding.bank.gestionnaires;

import com.summercoding.bank.entities.Compte;
import java.sql.SQLException;
import com.summercoding.bank.entities.Admin;
import com.summercoding.bank.entities.Utilisateur;

/**
 *
 * @author Moi
 */
public class GestionnaireCompte {
    private  Compte compte = new Compte();
    
    public void saveCompte (double solde, int idutilisateur, int idadmin) throws SQLException {
        compte.save(solde, idutilisateur, idadmin);
    }
        
}
