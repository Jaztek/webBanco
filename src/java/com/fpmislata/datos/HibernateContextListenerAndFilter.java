/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.datos;


import java.io.IOException;
import java.util.logging.LogRecord;
import javax.servlet.Filter;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author alumno
 */
public class HibernateContextListenerAndFilter implements Filter, ServletContextListener {

    public HibernateContextListenerAndFilter() {
    }

    

    @Override
    public void contextInitialized(ServletContextEvent sce) {
       HibernateUtil.buildSessionFactory();
        System.out.println("arrancando");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        HibernateUtil.closeSessionFactory();
        System.out.println("apagando");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       try{
           HibernateUtil.openSessionAndBindToThread();
           filterChain.doFilter(servletRequest, servletResponse);
       }finally{
           HibernateUtil.closeSessionAndUnbindFromThread();
       }
    }

    @Override
    public void destroy() {
       
    }

   
    
}
