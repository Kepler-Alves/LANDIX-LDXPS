/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldxps.Persistencia;

import java.util.ArrayList;
import ldxps.Model.Cliente;

/**
 *
 * @author Kepler
 */
public abstract class AbstractClienteDAO {
    
    public abstract int insert(Cliente cliente);
    
    public abstract int update(Cliente cliente);
    
    public abstract int delete(Cliente cliente);
    
    public abstract ArrayList<Cliente> findAll();
    
    
}
