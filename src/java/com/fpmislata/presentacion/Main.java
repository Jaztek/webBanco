/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.presentacion;

import com.fpmislata.banco.EntidadBancaria;
import com.fpmislata.banco.TipoEntidadBancaria;
import com.fpmislata.datos.EntidadBancariaDAO;
import com.fpmislata.datos.EntidadBancariaDAOImplJDBC;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Main {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, ClassNotFoundException, SQLException {
        
     
      int opcion=0;
        EntidadBancariaDAOImplJDBC entDAO=new EntidadBancariaDAOImplJDBC();
         Scanner sc=new Scanner(System.in);
         
         
         System.out.println("Introduce opcion");
         System.out.println("1.Encontrar Entidad por id \n2. Insertar Entidad \n"
                 + "3. Actualizar nombre de la entidad \n4.Eliminar una entidad "
                 + "\n5.Añadir datos y mostrarlos ");
         opcion=sc.nextInt();
         
        switch (opcion) {
            case 1:
                
        System.out.println("Introduce la Id de la entidad que quieras encontrar");
       
        int idEB=sc.nextInt();
//        entDAO.encontrarEntidad(idEB);
        
                
                break;
                
                case 2:
                     EntidadBancaria entidadBanc1= new EntidadBancaria();
         
        entidadBanc1.setCif("Whatever");
        entidadBanc1.setCodigoEntidad(123456);
        System.out.println("Introduce id de banco nuevo");
        int id=sc.nextInt();
        entidadBanc1.setIdEntidad(id);
        entidadBanc1.setNombreEntidad("MalaMadre");
      //  entidadBanc1.setTipoEntidadBancaria(TipoEntidadBancaria.Banco);
        
//        entDAO.añadirlista(entidadBanc1);
////        
//     entDAO.insertarEntidad(entidadBanc1);

break;

                case 3:
                     System.out.println("Introduce la Id de la entidad que quieras Actualizar");
        Scanner cs=new Scanner(System.in);
        int idEBanc=cs.nextInt();
        
        System.out.println("Nombre nuevo que le quieres poner");
        String nombre=cs.next();
        
//        entDAO.updateEntidad(idEBanc, nombre);



                break;

                case 4:
                System.out.println("Introduce la Id de la entidad que quieras Eliminar");
                  int idEBanco=sc.nextInt();
        
//              entDAO.eliminaerEntidadDAO(idEBanco);


                break;

                case 5:
//            entDAO.anyadirDatos();
//            entDAO.recorrerEntidades();

                break;
            default:
                throw new AssertionError();
        }
        
        
        //insertar entidad, funciona, pero no deja meter Pk repetidas asi que lo comento
        
        
        
        
        //update
       
        
        //eliminar
          
        
        
        
       
        
        
        
        
        
        
//        //entidades
//        
//        EntidadBancaria entidadBanc1= new EntidadBancaria();
//        entidadBanc1.setCif("Whatever");
//        entidadBanc1.setCodigoEntidad(123456);
//        entidadBanc1.setIdEntidad(1);
//        entidadBanc1.setNombreEntidad("MalaMadre");
//        entidadBanc1.setTipoEntidadBancaria(TipoEntidadBancaria.Banco);
//        
//        //sucursales
//        
//        SucursalBancaria sucursal1=new SucursalBancaria();
//        sucursal1.setCodigoSucursal(654321);
//        sucursal1.setEntidadBancaria(entidadBanc1);
//        sucursal1.setIdSucursalBancaria(1);
//        sucursal1.setNombre("Palomino");
//        
//        entidadBanc1.anyadirSucursal(sucursal1);
//        
//        SucursalBancaria sucursal2=new SucursalBancaria();
//        sucursal2.setCodigoSucursal(8952314);
//        sucursal2.setEntidadBancaria(entidadBanc1);
//        sucursal2.setIdSucursalBancaria(2);
//        sucursal2.setNombre("Ranita");
//        
//        entidadBanc1.anyadirSucursal(sucursal2);
//        
//        //cuentas
//        
//        CuentaBancaria cuentaB=new CuentaBancaria();
//        cuentaB.setCif("145ert");
//        cuentaB.setDc(7);
//        cuentaB.setNumeroCuenta(147852369);
//        cuentaB.setSaldo(6000);
//        cuentaB.setSucursalBancaria(sucursal1);
//        
//        sucursal1.anyadirCuenta(cuentaB);
//        
//        
//        CuentaBancaria cuentaB2=new CuentaBancaria();
//        cuentaB2.setCif("54h7yt65");
//        cuentaB2.setDc(12);
//        cuentaB2.setNumeroCuenta(787965214);
//        cuentaB2.setSaldo(2000);
//        cuentaB2.setSucursalBancaria(sucursal1);
//        
//        sucursal1.anyadirCuenta(cuentaB2);
//        
//        //movimientos
//        
//         MovimientoBancario movimiento1=new MovimientoBancario();
//          
////         String startDate = "10/30/2013";
////      DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
////        Date fecha = df.parse(startDate);
//        
//        Calendar cal = GregorianCalendar.getInstance();
//        cal.set(2000,Calendar.AUGUST, 31);
//        Date fecha = cal.getTime();
//        
//        movimiento1.setFecha(fecha);
//         movimiento1.setConcepto("Trabajo");
//         movimiento1.setIdMovimientoBancario(1);
//         movimiento1.setImporte(new BigDecimal(30));
//         movimiento1.setSaldoTotal(new BigDecimal(5000));
//         movimiento1.setTipoMovimientoBancario(TipoMovimientoBancario.Haber);
//         
//         cuentaB.anyadirMovimiento(movimiento1);
//         
//         
//         MovimientoBancario movimiento2=new MovimientoBancario();
//         
//         
//         
//         
//
//        Calendar cal2 = GregorianCalendar.getInstance();
//        cal.set(2000,Calendar.AUGUST, 31);
//        Date fecha2 = cal2.getTime();
//        
//        movimiento2.setFecha(fecha2);
//         movimiento2.setConcepto("Ocio");
//         movimiento2.setIdMovimientoBancario(2);
//         movimiento2.setImporte(new BigDecimal(90));
//         movimiento2.setSaldoTotal(new BigDecimal(5000));
//         movimiento2.setTipoMovimientoBancario(TipoMovimientoBancario.Debe);
//         
//         cuentaB.anyadirMovimiento(movimiento2);
//         
//         //mostrar cuenta y movimientos
//         
//         System.out.println("Entidad:  "+cuentaB.getSucursalBancaria().getEntidadBancaria().getNombreEntidad()+
//                 " .Codigo: "+cuentaB.getSucursalBancaria().getEntidadBancaria().getCodigoEntidad()+".  Sucursal: "+ cuentaB.getSucursalBancaria().getNombre()+". Codigo: "+ cuentaB.getSucursalBancaria().getCodigoSucursal()+
//                  ". DC "+cuentaB.getDc()+ ". CIF "+cuentaB.getCif());
//         System.out.println("Movimientos:");
//        
//         for(MovimientoBancario mov: cuentaB.getListaMovimiento()){
//             System.out.println("Id: "+mov.getIdMovimientoBancario()
//                     +"   Fecha: "+mov.getFecha()+"    Importe: "+ mov.getImporte()+"   Concepto:"+ mov.getConcepto()
//                     +"   Saldo Total:  "+mov.getSaldoTotal()+"     Tipo de movimiento:"+ mov.getTipoMovimientoBancario());
//            // System.out.println(fecha2.get(Calendar.ERA));
       //  }
       
        
                
    }
}
