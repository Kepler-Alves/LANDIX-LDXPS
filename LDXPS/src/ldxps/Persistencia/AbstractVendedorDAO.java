/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldxps.Persistencia;

import java.util.ArrayList;
import ldxps.Model.Vendedor;

/**
 *
 * @author Kepler
 */
public abstract class AbstractVendedorDAO {
    
    public abstract int insert(Vendedor vendedor);
    
    public abstract int update(Vendedor vendedor);
    
    public abstract int delete(Vendedor vendedor);
    
    public abstract ArrayList<Vendedor> findAll();
}
