/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantapp;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author aarab
 */
public class db {
        public static Connection java_db(){
        try{
            String driverName="oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName = "localhost";
            String serverPort = "1521";
            String sid = "orcl";
            String url = "jdbc:oracle:thin:@"+serverName+":"+serverPort+":"+sid;
            String username = "hr";
            String password = "hr";
            Connection conn = DriverManager.getConnection(url, username, password);
            //System.out.println("Successfully connected to the database");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        }
}
