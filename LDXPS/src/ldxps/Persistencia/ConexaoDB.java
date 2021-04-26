/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldxps.Persistencia;

/**
 *
 * @author Kepler
 */
import java.sql.*;

public class ConexaoDB extends AbstractConexaoBanco {
    
    
    private static ConexaoDB instance;
    
    private ConexaoDB(){
        conectar();
    }


    
    
    public static ConexaoDB getInstance(){
        if (instance == null){
            instance = new ConexaoDB();
        }
        return instance;
    }
    
    private boolean conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String server = "localhost:3306";
            String database = "ldxps";
            String url = "jdbc:mysql://"+server+"/"+database;
            String user = "root";
            String pass = "KeplerDB";
            
            setConnection (DriverManager.getConnection(url, user, pass));
            
            if(getConnection() != null)
                return true;
        }
        catch(Exception e){
            return false;
            
        }
        return true;
    }
}
