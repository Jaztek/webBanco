/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.datos;

import com.fpmislata.banco.EntidadBancaria;
import com.fpmislata.banco.TipoEntidadBancaria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public interface EntidadBancariaDAO extends GenericDAO<EntidadBancaria, Integer>{
   
    
}
       
        
        
   
    
//    
//    public  String encontrarEntidad(int idEntidadBancaria) throws ClassNotFoundException, SQLException {
//        
//  
//    
//    String selectSQL="SELECT * FROM entidadbancaria WHERE idEntidadBancaria=?";
//    
//    PreparedStatement preparedStatement= connectionFactory.getConnection().prepareStatement(selectSQL);
//    preparedStatement.setInt(1, idEntidadBancaria);
//    ResultSet rs= preparedStatement.executeQuery();
//    
//    
//   String nombreEntidad;
//    if(rs.next()==true){
//       nombreEntidad=rs.getString("nombreEntidad");
//        System.out.println(nombreEntidad);
//       
//       
//    }
//    else{
//        RuntimeException runtimeException=new RuntimeException ("no existe la cuenta");
//        throw runtimeException;
//    }
//    connectionFactory.getConnection().close();
//    return nombreEntidad;
//    }
//    
//   
//    
//    
//    
//    public void updateEntidad(int idEB, String nombre) throws ClassNotFoundException, SQLException{
//        
//      
//        
//    String updateTableSQL="UPDATE entidadBancaria SET nombreEntidad=? WHERE idEntidadBancaria=?";
//     
//     PreparedStatement preparedStatement= connectionFactory.getConnection().prepareStatement(updateTableSQL);
//     preparedStatement.setString(1,nombre);
//     preparedStatement.setInt(2,idEB);
//     preparedStatement.executeUpdate();
//    }
//    
//    public void añadirlista(EntidadBancaria EB){
//        listaEntidades.add(EB);
//    }
//    
//    public void eliminaerEntidadDAO(int idEntidad) throws ClassNotFoundException, SQLException{
//       
//        
//    String updateTableSQL="DELETE FROM entidadBancaria  WHERE idEntidadBancaria=?";
//     
//     PreparedStatement preparedStatement= connectionFactory.getConnection().prepareStatement(updateTableSQL);
//     preparedStatement.setInt(1,idEntidad);
//     preparedStatement.executeUpdate();
//    }
//    
//   
//    
//    public void anyadirDatos() throws ClassNotFoundException, SQLException{
//            String selectSQL="SELECT * FROM entidadbancaria ";
//    PreparedStatement preparedStatement= connectionFactory.getConnection().prepareStatement(selectSQL);
//    
//    ResultSet rs= preparedStatement.executeQuery();
//    int idEntidad;
//    int codigoEnt;
//    String nombreEntidad;
//    String cif;
//    String tipoEntidad;
//    
//    while (rs.next()) {
//   
//    
//        EntidadBancaria ent=new EntidadBancaria();
//       idEntidad=rs.getInt("idEntidadBancaria");
//       codigoEnt=rs.getInt("codigoEntidad");
//       nombreEntidad=rs.getString("nombreEntidad");
//       cif=rs.getString("cif");
//       tipoEntidad=rs.getString("tipoEntidadBancaria");
//       
//       ent.setIdEntidad(idEntidad);ent.setCodigoEntidad(codigoEnt);ent.setNombreEntidad(nombreEntidad);
//       ent.setCif(cif);
//       
//       ent.setTipoEntidadBancaria(TipoEntidadBancaria.valueOf(tipoEntidad));
//       
//       listaEntidades.add(ent);
//       
//       
////        if(rs.next()){
////            throw new RuntimeException("no existe ,as de una entidad bancaria");
////        }
//    
//    
//    
//    }
//
//        connectionFactory.getConnection().close();
//       
//    }
//    public void recorrerEntidades(){
//        
//}
//
//    public List<EntidadBancaria> getListaEntidades() {
//        return listaEntidades;
//    }
//    

  //  }


    

