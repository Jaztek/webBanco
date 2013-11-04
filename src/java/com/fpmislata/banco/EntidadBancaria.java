/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class EntidadBancaria {
  private int idEntidadBancaria ;
 private int codigoEntidad ;
 private String nombreEntidad ;
private String cif  ;

 
  private List<SucursalBancaria> listaSucursales = new ArrayList<SucursalBancaria>();

  public EntidadBancaria(){
      
  } 

    public List<SucursalBancaria> getListaSucursales() {
        return listaSucursales;
    }

    public void setListaSucursales(List<SucursalBancaria> listaSucursales) {
        this.listaSucursales = listaSucursales;
    }
  
  
  public int getIdEntidad() {
        return idEntidadBancaria;
    }

    public void setIdEntidad(int idEntidad) {
        this.idEntidadBancaria = idEntidad;
    }

    public int getCodigoEntidad() {
        return codigoEntidad;
    }

    public void setCodigoEntidad(int codigoEntidad) {
        this.codigoEntidad = codigoEntidad;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

//    public TipoEntidadBancaria getTipoEntidadBancaria() {
//        return tipoEntidadBancaria;
//    }
//
//    public void setTipoEntidadBancaria(TipoEntidadBancaria tipoEntidadBancaria) {
//        this.tipoEntidadBancaria = tipoEntidadBancaria;
//    }
     public void anyadirSucursal(SucursalBancaria sucursal){
    listaSucursales.add(sucursal);
       
    
    }

    public int getIdEntidadBancaria() {
        return idEntidadBancaria;
    }
     
 
 
}
