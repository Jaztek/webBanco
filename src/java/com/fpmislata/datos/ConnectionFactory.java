/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alumno
 */
public interface ConnectionFactory {
    
    public Connection getConnection() throws ClassNotFoundException, SQLException;
        
       
        
    
    
}
