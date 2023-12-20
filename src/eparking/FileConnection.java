/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eparking;

import java.sql.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author ThinkPad
 */
public class FileConnection {
    private static Connection koneksi;
    public static Connection GetConnection() throws SQLException
    {
        if (koneksi == null) {
            Driver driver = new Driver();
            koneksi = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/eparking?zeroDateTimeBehavior=convertToNull", "root", "");
        }
        return koneksi;
    }
    
    
}
