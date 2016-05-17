/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Moussa
 */
public class CO {
    
        // <editor-fold defaultstate="collapsed" desc="Classe : Connexion à la base de données">
    public static Connection com;
    public static void getConnection(){
        
        try {
        Class.forName("com.mysql.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/bdaeroport";
String user = "root";
String passwd = "";
com=DriverManager.getConnection(url, user, passwd);
        } catch (ClassNotFoundException|SQLException e) {
        }
}
    // </editor-fold>
    
}
