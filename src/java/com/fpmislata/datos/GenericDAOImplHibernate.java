/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.datos;


import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author alumno
 */
public class GenericDAOImplHibernate<T, ID extends Serializable> implements GenericDAO<T, ID> {

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public GenericDAOImplHibernate() {
    }

    public Session getCurrentSession() {
        //se puede poner directamente el sessionFactory.getCurrentSession(), en cada metodo despues de session Session
        Session session = sessionFactory.getCurrentSession();
        return session;

    }


    @Override
    public T read(ID id) {
        Session session = getCurrentSession();
        session.beginTransaction();

        T t = (T) session.get(getEntityClass(), id);
        session.getTransaction().commit();

        return t;
    }

    @Override
    public List<T> findAll() {
        Session session = getCurrentSession();
        Query query = session.createQuery("SELECT entidad FROM EntidadBancaria entidad");
        List<T> listaT = query.list();

        return listaT;
    }

    @Override
    public void insert(T objeto) {
        Session session = getCurrentSession();
        session.beginTransaction();
        session.save(objeto);
        session.getTransaction().commit();

    }

    @Override
    public void update(ID id) {
        Session session = getCurrentSession();
        session.beginTransaction();
        T t = (T) session.get(getEntityClass(), id);
        //t.setCodigoEntidad(1111);
        session.update(t);
        session.getTransaction().commit();

    }

    @Override
    public void delete(ID id) {
        Session session = getCurrentSession();
        com.fpmislata.banco.EntidadBancaria entidadBancaria = ( com.fpmislata.banco.EntidadBancaria) session.get( com.fpmislata.banco.EntidadBancaria.class, id);
        session.delete(entidadBancaria);
        session.getTransaction().commit();

    }
    private Class<T> getEntityClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
    public String encontrar(ID id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void anyadir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<T> encontrarNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
