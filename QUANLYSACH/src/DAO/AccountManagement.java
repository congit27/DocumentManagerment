/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Account;
import java.sql.*;

/**
 *
 * @author TGDD
 */
public class AccountManagement extends JDBCConnection{

    private int resultUserAdding;
    private ResultSet resultUserLogin;
    public void addUser(Account user) {
        Connection conn = JDBCConnection.getJDBCConnection();
        
        String sqlQuerry = "set dateformat dmy "
                + "insert into Users values (?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            stm.setString(1, user.getUsername());
            stm.setString(2, user.getPasswords());
            stm.setString(3, user.getRoles());
            stm.setString(4, user.getFullName());
            stm.setString(5, user.getPhoneNumber());
            stm.setString(6, user.getGender());
            stm.setString(7, user.getdOB());
            
            resultUserAdding = stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getresultUserAdding() {
        return resultUserAdding;
    }
    
    public void loginAccountHandle(Account account) {
        Connection conn = JDBCConnection.getJDBCConnection();
        
        String sqlQuerry = "select roles from Users where username = ? and passwords = ?";
        
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            stm.setString(1, account.getUsername());
            stm.setString(2, account.getPasswords());
            
            resultUserLogin = stm.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ResultSet getResultUserLogin() {
        return resultUserLogin;
    }
}
