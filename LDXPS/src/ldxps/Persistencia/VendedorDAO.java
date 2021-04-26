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
import ldxps.Model.Vendedor;

/**
 *
 * @author Kepler
 */
public class VendedorDAO extends AbstractVendedorDAO {
    private Connection conexao = ConexaoDB.getInstance().getConnection();
    
    private static VendedorDAO instance;{
    
    }
    
    public static VendedorDAO getInstance(){
        if (instance == null)
            instance = new VendedorDAO();
        
        return instance;
    }
            
    @Override
    public int insert(Vendedor vendedor) {
         try{
            PreparedStatement insert = conexao.prepareStatement
        ("INSERT INTO VENDEDORES (DSNOME, CDTAB, DTNASC) VALUES (?, ?, ?, ?)");
            insert.setString(1, vendedor.getDSNOME());
            
            int resultado = insert.executeUpdate();
            insert.close();
            return resultado;
            
            
        }
        catch(Exception e){
            return - 1;
        }
    }

    @Override
    public int update(Vendedor vendedor) {
         try{
            PreparedStatement update = conexao.prepareStatement
        ("UPDATE VENDEDORES SET DSNOME = ?, DTNASC = ?, CDTAB = ? WHERE CDVEND = ?");
            update.setString(1, vendedor.getDSNOME());
            update.setString(3, vendedor.getCDVEND());
            update.setInt(4, vendedor.getCDTAB());
            update.setString(5, vendedor.getDTNASC());
            
            int resultado = update.executeUpdate();
            update.close();
            return resultado;
            
            
        }
        catch(Exception e){
            return - 1;
        }
    }

    @Override
    public int delete(Vendedor vendedor) {
        try{
            Connection conexao = ConexaoDB.getInstance().getConnection();
            PreparedStatement delete = conexao.prepareStatement
        ("DELETE FROM VENDEDORES WHERE CDVEND = ?");
            delete.setString(1, vendedor.getCDVEND());
            
            int resultado = delete.executeUpdate();
            delete.close();
            return resultado;
            
            
        }
        catch(Exception e){
            return - 1;
        }
    }

    @Override
    public ArrayList<Vendedor> findAll() {
        
        ArrayList<Vendedor> lista = new ArrayList<Vendedor>();
        try{
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM VENDEDORES");
            
            while (rs.next()){
                Vendedor v = new Vendedor(rs.getString("CDVEND"), rs.getString("DSNOME"), rs.getInt("CDTAB"), rs.getString("DATANASC"));
                lista.add(v);
            }
            stmt.close();
        }
        catch(Exception e){
            System.out.println("Erro");
        }
        return lista;
    }
    
}

