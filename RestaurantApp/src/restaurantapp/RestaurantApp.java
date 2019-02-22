/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aarab
 */
public class RestaurantApp {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection conn = null;
        try{
            String driverName="oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName = "localhost";
            String serverPort = "1521";
            String sid = "orcl";
            String url = "jdbc:oracle:thin:@"+serverName+":"+serverPort+":"+sid;
            String username = "hr";
            String password = "hr";
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Successfully connected to the database");
        }catch(ClassNotFoundException e){
            System.out.println("Could not find the database driver "+e.getMessage());
        }catch(SQLException e){
            System.out.println("Could not connect to the database "+e.getMessage());
        }
        try{
            String sql = "Select * from employees where EMPLOYEE_ID = 100";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String empId = rs.getString(1);
                String empName = rs.getString(2);
                System.err.println("Employee ID is : "+empId+" and his name is : "+empName);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
