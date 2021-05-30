/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author gin0612
 */
public class DatabaseConnection {
    public static Connection getKoneksi(String host, String port, String Username, String password, String db) {
    String konString = "jdbc:mysql://" + host + ":" + port + "/" + db;
    Connection koneksi = null;
    try {
    Class.forName("com.mysql.jdbc.Driver");
        String username = null;
    koneksi = DriverManager.getConnection(konString, username, password);
    System.out.println("Koneksi Berhasil");
    } catch (Exception ex){
    ex.printStackTrace();
    JOptionPane.showMessageDialog(null, "Koneksi Database Error");
    koneksi = null;
    }
    return koneksi;
    }
    
    
}


