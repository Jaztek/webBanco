/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.datos;

import com.fpmislata.banco.EntidadBancaria;
import com.fpmislata.banco.TipoEntidadBancaria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class EntidadBancariaDAOImplJDBC implements EntidadBancariaDAO {

    ConnectionFactory connectionFactory = new ConnectionFactoryImplDataResource();
    List<EntidadBancaria> listaEntidadesBancarias = new ArrayList();

    @Override
    public EntidadBancaria read(Integer idEntidadBancaria) {
        EntidadBancaria entidad = new EntidadBancaria();



        try {
            String selectSQL = "SELECT * FROM entidadbancaria WHERE idEntidadBancaria=?";
            PreparedStatement preparedStatement = connectionFactory.getConnection().prepareStatement(selectSQL);
            preparedStatement.setInt(1, idEntidadBancaria);
            ResultSet rs = preparedStatement.executeQuery();


            int idEntidad;
            int codigoEnt;
            String nombreEntidad;
            String cif;
            String tipoEntidad;
            if (rs.next() == true) {



                idEntidad = rs.getInt("idEntidadBancaria");
                codigoEnt = rs.getInt("codigoEntidad");
                nombreEntidad = rs.getString("nombreEntidad");
                cif = rs.getString("cif");
                tipoEntidad = rs.getString("tipoEntidadBancaria");

                entidad.setIdEntidad(idEntidad);
                entidad.setCodigoEntidad(codigoEnt);
                entidad.setNombreEntidad(nombreEntidad);
                entidad.setCif(cif);
                //entidad.setTipoEntidadBancaria(TipoEntidadBancaria.valueOf(tipoEntidad));
                System.out.println(nombreEntidad);
                connectionFactory.getConnection().close();

            }



        } catch (Exception ex) {
            throw new RuntimeException("fallo etc etc", ex);
        }

        return entidad;
    }

    @Override
    public List<EntidadBancaria> findAll() {
        anyadir();
        for (EntidadBancaria ent : listaEntidadesBancarias) {
      //      System.out.println(ent.getIdEntidad() + "  " + ent.getCodigoEntidad() + "  " + ent.getCif() + "  " + ent.getTipoEntidadBancaria());

        }

        return listaEntidadesBancarias;
    }

    @Override
    public String encontrar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(EntidadBancaria objeto) {
        try {
            EntidadBancaria entidadBancaria = new EntidadBancaria();
            String insertTableSQL = "INSERT INTO entidadbancaria"
                    + "(idEntidadBancaria, codigoEntidad,nombreEntidad, cif, tipoEntidadBancaria) VALUES"
                    + "(?,?,?,?,?)";;
            PreparedStatement preparedStatement;

            preparedStatement = connectionFactory.getConnection().prepareStatement(insertTableSQL);

            preparedStatement.setInt(1, entidadBancaria.getIdEntidad());
            preparedStatement.setInt(2, entidadBancaria.getCodigoEntidad());
            preparedStatement.setString(3, entidadBancaria.getNombreEntidad());
            preparedStatement.setString(4, entidadBancaria.getCif());

           // preparedStatement.setString(5, entidadBancaria.getTipoEntidadBancaria().name());

            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("fallo etc etc", ex);
        } catch (SQLException ex) {
            throw new RuntimeException("fallo en SQL al insertar etc etc", ex);
        }
    }

    @Override
    public void update(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void anyadir() {

        try {
            String selectSQL = "SELECT * FROM entidadbancaria ";
            PreparedStatement preparedStatement = connectionFactory.getConnection().prepareStatement(selectSQL);

            ResultSet rs = preparedStatement.executeQuery();
            int idEntidad;
            int codigoEnt;
            String nombreEntidad;
            String cif;
            String tipoEntidad;

            while (rs.next()) {


                EntidadBancaria ent = new EntidadBancaria();
                idEntidad = rs.getInt("idEntidadBancaria");
                codigoEnt = rs.getInt("codigoEntidad");
                nombreEntidad = rs.getString("nombreEntidad");
                cif = rs.getString("cif");
                tipoEntidad = rs.getString("tipoEntidadBancaria");

                ent.setIdEntidad(idEntidad);
                ent.setCodigoEntidad(codigoEnt);
                ent.setNombreEntidad(nombreEntidad);
                ent.setCif(cif);

           //     ent.setTipoEntidadBancaria(TipoEntidadBancaria.valueOf(tipoEntidad));

                listaEntidadesBancarias.add(ent);


            }
            connectionFactory.getConnection().close();


        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("añadir fallo etc etc", ex);
        } catch (SQLException ex) {
            throw new RuntimeException("añadir fallo2 etc etc", ex);
        }
    }

    @Override
    public List <EntidadBancaria> encontrarNombre(String dato) {
        List <EntidadBancaria> entidades= new ArrayList();
        try {
            EntidadBancaria ent = new EntidadBancaria();
            String selectSQL = "SELECT * FROM entidadbancaria WHERE nombreEntidad LIKE=?;";
            PreparedStatement preparedStatement = connectionFactory.getConnection().prepareStatement(selectSQL);
            ResultSet rs = preparedStatement.executeQuery();
            preparedStatement.setString(1, "%"+dato.trim()+"%");
            
            int idEntidad;
            int codigoEnt;
            String nombreEntidad;
            String cif;
            String tipoEntidad;

            while (rs.next()) {
                 idEntidad = rs.getInt("idEntidadBancaria");
                codigoEnt = rs.getInt("codigoEntidad");
                nombreEntidad = rs.getString("nombreEntidad");
                cif = rs.getString("cif");
                tipoEntidad = rs.getString("tipoEntidadBancaria");

                ent.setIdEntidad(idEntidad);
                ent.setCodigoEntidad(codigoEnt);
                ent.setNombreEntidad(nombreEntidad);
                ent.setCif(cif);

           //     ent.setTipoEntidadBancaria(TipoEntidadBancaria.valueOf(tipoEntidad));
                entidades.add(ent);



            }
            connectionFactory.getConnection().close();
            return entidades;

        } catch (Exception ex) {
            throw new RuntimeException("fallo al insertar por URL",ex);
        }

    }
}
