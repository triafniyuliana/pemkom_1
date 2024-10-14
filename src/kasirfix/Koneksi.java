/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasirfix;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author FLEX5
 */
public class Koneksi {
    static final String url = "jdbc:mysql://localhost/db_kasir";
    static final String username_laragon = "root";
    static final String password_laragon = "";
    static Connection con;
    

//    public static void main(String[] args) {
//        try {
//            con = DriverManager.getConnection(url,username_laragon,password_laragon);
//            System.out.println("koneksi database berhasil");
//        } catch (Exception e) {
//            JOptionPane.showInternalMessageDialog(null, e.getMessage());
//        }
//    }
    public void connect(){
        try {
            con = DriverManager.getConnection(url,username_laragon,password_laragon);
//            System.out.println("koneksi database berhasil");
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, e.getMessage());
        }
    }
    public Connection getCon(){
        return con;
    }
}


