/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.summercoding.bank.entities;

import com.summercoding.bank.utils.JDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Moi
 */
public class Utilisateur {

    int idutilisateur;
    String login;
    String password;
    String nom;
    String prenom;
    LocalDate datenaissance;
    String genre;
    int idadmin;

    public void save(String login, String password, String nom, String prenom, LocalDate datenaissance, String genre, int idadmin) throws SQLException {
        
            String command = "INSERT INTO `utilisateur` (`login`, `password`, `nom`, `prenom`, `datenaissance`, `genre`, `idadmin`) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement addstmt = JDBC.getConnexion().prepareStatement(command);
            addstmt.setObject(1, login);
            addstmt.setObject(2, password);
            addstmt.setObject(3, nom);
            addstmt.setObject(4, prenom);
            addstmt.setObject(5, datenaissance);
            addstmt.setObject(6, genre);
            addstmt.setObject(7, idadmin);
            addstmt.execute();
    }
    
    public void update(int idutilisateur, String login, String password, String nom, String prenom, LocalDate datenaissance, String genre, int idadmin) throws SQLException {
        
            String command = "UPDATE `utilisateur` SET `login` = ?, `password` = ?, `nom` = ?, `prenom` = ?, `datenaissance` = ?, `genre` = ?, `idadmin` = ? WHERE `utilisateur`.`idutilisateur` = ?";
            PreparedStatement addstmt = JDBC.getConnexion().prepareStatement(command);
            addstmt.setObject(1, login);
            addstmt.setObject(2, password);
            addstmt.setObject(3, nom);
            addstmt.setObject(4, prenom);
            addstmt.setObject(5, datenaissance);
            addstmt.setObject(6, genre);
            addstmt.setObject(7, idadmin);
            addstmt.setObject(8, idutilisateur);
            addstmt.execute();
    }
    
    public void delete(int idutilisateur) throws SQLException {
        
            String command = "DELETE FROM utilisateur WHERE `utilisateur`.`idutilisateur` = ? ";
            PreparedStatement addstmt = JDBC.getConnexion().prepareStatement(command);
            addstmt.setObject(1, idutilisateur);
            addstmt.execute();
    }
    
    public Utilisateur getOne(int idutilisateur) throws SQLException {
        String cmd = "select * from utilisateur where idutilisateur = ?";
        
        PreparedStatement stmt = JDBC.getConnexion().prepareStatement(cmd);
        stmt.setObject(1, idutilisateur);
        ResultSet rs=stmt.executeQuery();
        while (rs.next()) {
            return new Utilisateur (rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6).toLocalDate(), rs.getString(7), rs.getInt(8));             
        }
        
        return null;
    }
    
    public Utilisateur getByLoginAndPassword(String login, String password) throws SQLException {
        String cmd = "select * from utilisateur where login = ? and password = ?";
        
        PreparedStatement stmt = JDBC.getConnexion().prepareStatement(cmd);
        stmt.setObject(1, login); 
        stmt.setObject(2, password); 
        ResultSet rs=stmt.executeQuery();
        while (rs.next()) {
            return new Utilisateur (rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6).toLocalDate(), rs.getString(7), rs.getInt(8));
                    
        }
        
        return null;
    }
    
    public List<Utilisateur> getAllUtilisateur() throws SQLException {
        String cmd = "select * from utilisateur";
        
        PreparedStatement stmt = JDBC.getConnexion().prepareStatement(cmd);
        
        ResultSet rs=stmt.executeQuery();
        List<Utilisateur> listUtilisateur = new ArrayList<>();
        while (rs.next()) {
            listUtilisateur.add(new Utilisateur(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6).toLocalDate(), rs.getString(7), rs.getInt(8)));
                    
        }
        
        return listUtilisateur;
    }

    
    public Utilisateur() {
    }
    

    public Utilisateur(int idutilisateur, String login, String password, String nom, String prenom, LocalDate datenaissance, String genre, int idadmin) {
        this.idutilisateur = idutilisateur;
        this.login = login;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.datenaissance = datenaissance;
        this.genre = genre;
        this.idadmin = idadmin;
    }
    
    
    
   

    public int getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(int idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(LocalDate datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }

    public static void main(String arg[]) {
        try{
            Utilisateur utilisateur = new Utilisateur();
            //utilisateur.save("lari", "lari", "lari", "lari",LocalDate.of(2005, Month.MARCH, 5) , "feminin", 2);
            //utilisateur.save("nel", "nel123", "nella", "solf", LocalDate.of(2005, Month.MARCH, 8), "feminin", 3);
            //utilisateur.update(1, "lali", "lali123", "lali", "lali", LocalDate.of(2006, Month.JUNE, 8), "feminin", 4);
            utilisateur.delete(41);
            String result = utilisateur.getOne(3).toString();
            System.out.println(result);
            
            result = utilisateur.getAllUtilisateur().toString();
            System.out.println(result);
            
            
        } catch (SQLException ex){
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

}
