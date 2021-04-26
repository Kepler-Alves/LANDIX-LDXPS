/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldxps.Persistencia;

import java.sql.Connection;

/**
 *
 * @author Kepler
 */
public abstract class AbstractConexaoBanco {
    private Connection connection;
    
        public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
}
