/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.datos;

import java.util.List;

/**
 *
 * @author alumno
 */
public interface GenericDAO<T,ID>{
    T read (ID id);
    List <T> findAll();
    
    public String encontrar(ID id);
    public void insert(T objeto);
    public void update(ID id);
     public void delete(ID id);
      public void anyadir();
       public List <T> encontrarNombre(String nombre);
    
}
