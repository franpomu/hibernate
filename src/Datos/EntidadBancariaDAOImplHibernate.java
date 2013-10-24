/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.EntidadBancaria;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author alumno
 */
public class EntidadBancariaDAOImplHibernate implements EntidadBancariaDAO{

    public EntidadBancariaDAOImplHibernate() {
        
    } 
   

    @Override
    public EntidadBancaria read(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(EntidadBancaria entidadBancaria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(EntidadBancaria entidadBancaria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EntidadBancaria> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EntidadBancaria> findByName(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EntidadBancaria> findByCodigo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
