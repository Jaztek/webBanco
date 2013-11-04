/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.datos;

import java.sql.Connection;


import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.sql.DataSource;

/**
 *
 * @author alumno
 */
public class ConnectionFactoryImplDataResource implements ConnectionFactory{
//    private DataSource datasource;

    
    
    @Override
    public Connection getConnection()  {
      try {
        Context initContext = null;
       
            initContext = new
        InitialContext();
        
   Context envContext = null;
       
   DataSource datasource = null;
        Connection connection = datasource.getConnection();
       return connection;
      
      } catch (Exception ex) {
           throw new RuntimeException ("fallo etc etc", ex);
        }
  
   
  
    }
        
        
        
        
        
//        try {
// //Create a datasource for pooled connections.
// datasource = (DataSource) getServletContext().
// getAttribute("DBCPool");
//
//  //Register the driver for non-pooled connections.
//  Class.forName("com.mysql.jdbc.Driver").
//      newInstance();
//    }
//    catch (Exception e) {
//      throw new ServletException(e.getMessage());
//    }
//        return null;
//  }
////    private synchronized Connection getConnection
////    (boolean pooledConnection)
////    throws SQLException {
////  if (pooledConnection) {
////     pooledCount++;
////
////    // Allocate and use a connection from the pool
////    return datasource.getConnection();
////  }
////  else {
////
////    nonPooledCount++;
////    Connection con = DriverManager.getConnection(
////      "jdbc:mysql://localhost/dbcptest","kunal",
////      "java_facier");
////    return con;   //return a newly created object
////    }
////  }
//    
////    public Connection getConnection() throws ClassNotFoundException, SQLException {
////        Class.forName("com.mysql.jdbc.Driver");
////    Connection conn=null;
////    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco","root","root"); 
////    return conn;
//       
//   

}
    

