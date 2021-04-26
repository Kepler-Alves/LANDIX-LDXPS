/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldxps.Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import ldxps.Model.Cliente;

/**
 *
 * @author Kepler
 */
public class ClienteDAO extends AbstractClienteDAO {

    private Connection conexao = ConexaoDB.getInstance().getConnection();
    
    private static ClienteDAO instance;
    private ClienteDAO(){
        
    }
    
    public static ClienteDAO getInstance(){
        if (instance == null)
            instance = new ClienteDAO();
        
        return instance;
    }
    
            
    @Override
    public int insert(Cliente cliente) {
         try{
            PreparedStatement insert = conexao.prepareStatement
        ("INSERT INTO CLIENTES ( DSNOME, IDTIPO, CDVEND, DSLIM) VALUES (?, ?, ?, ?, ?)");
            insert.setString(1, cliente.getDSNOME());
            
            int resultado = insert.executeUpdate();
            insert.close();
            return resultado;
            
            
        }
        catch(Exception e){
            return - 1;
        }
    }

    @Override
    public int update(Cliente cliente) {
         try{
            PreparedStatement update = conexao.prepareStatement
        ("UPDATE CLIENTES SET DSNOME = ?, IDTIPO = ?, CDVEND = ?, DSLIM = ? WHERE CDCL = ?");
            update.setString(1, cliente.getDSNOME());
            update.setString(2, cliente.getIDTIPO());
            update.setString(3, cliente.getCDVEND());
            update.setDouble(4, cliente.getDSLIM());
            update.setString(5, cliente.getCDCL());
            
            int resultado = update.executeUpdate();
            update.close();
            return resultado;
            
            
        }
        catch(Exception e){
            return - 1;
        }
    }

    @Override
    public int delete(Cliente cliente) {
        try{
            Connection conexao = ConexaoDB.getInstance().getConnection();
            PreparedStatement delete = conexao.prepareStatement
        ("DELETE FROM CLIENTES WHERE CDCL = ?");
            delete.setString(1, cliente.getCDCL());
            
            int resultado = delete.executeUpdate();
            delete.close();
            return resultado;
            
            
        }
        catch(Exception e){
            return - 1;
        }
    }

    @Override
    public ArrayList<Cliente> findAll() {
        
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        try{
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM CLIENTES");
            
            while (rs.next()){
                Cliente c = new Cliente(rs.getString("CDCL"), rs.getString("DSNOME"), rs.getString("IDTIPO"), rs.getString("CDVEND"), rs.getDouble("DSLIM"));
                lista.add(c);
            }
            stmt.close();
        }
        catch(Exception e){
            System.out.println("Erro");
        }
        return lista;
    }
    
}
