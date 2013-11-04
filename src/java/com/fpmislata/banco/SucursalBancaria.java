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
public class SucursalBancaria {
   private int idSucursalBancaria ;//Pk de la sucursal 
private EntidadBancaria entidadBancaria; //Entidad Bancaria a la que pertenece la sucursal 
private int codigoSucursal; //Código de la Sucursal 
private String nombre;

 private List<CuentaBancaria> listaCuentas = new ArrayList<CuentaBancaria>();

    public int getIdSucursalBancaria() {
        return idSucursalBancaria;
    }

    public List<CuentaBancaria> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(List<CuentaBancaria> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }
    

    public void setIdSucursalBancaria(int idSucursalBancaria) {
        this.idSucursalBancaria = idSucursalBancaria;
    }

    public EntidadBancaria getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(EntidadBancaria entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public int getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(int codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public void anyadirCuenta(CuentaBancaria cuenta){
    listaCuentas.add(cuenta);
       
    
    }


}
