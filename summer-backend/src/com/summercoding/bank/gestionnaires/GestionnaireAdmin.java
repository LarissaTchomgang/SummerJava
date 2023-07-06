/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.summercoding.bank.gestionnaires;

import com.summercoding.bank.entities.Admin;
import java.sql.SQLException;
import java.util.List;



/**
 *
 * @author Moi
 */
public class GestionnaireAdmin {
    private Admin admin = new Admin();// attribu qu'on appele admin
    public Admin login(String login, String password) throws SQLException {
        return admin.getByLoginAndPassword(login, password);
    }
    
    public void saveAdmin(String login, String password, String nom) throws SQLException {
        admin.save(login, password, nom);
        
            
        
    }
    
    public List<Admin> listAllAdmin() throws SQLException {
        return admin.getAllAdmin();
    }
}
