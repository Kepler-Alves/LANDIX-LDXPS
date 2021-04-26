/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ldxps.Model.Cliente;

/**
 *
 * @author Kepler
 */
public class ClienteController {
    public RetornoPersonalizado cadastrarCliente(String DSNOME, String IDTIPO, double DSLIM){
        
        if(DSNOME == null || DSNOME.isEmpty()){
        RetornoPersonalizado retorno = new RetornoPersonalizado(false,"Nome não preenchido corretamente");
        return retorno;
        }
        Cliente c = new Cliente(DSNOME,IDTIPO,DSLIM);
        int resultado = c.insert();
        
        if (resultado <= 0){
            RetornoPersonalizado retorno = new RetornoPersonalizado(false, "Erro");
            return retorno;
        }
        RetornoPersonalizado retorno = new RetornoPersonalizado(true, "Cadastrado com sucesso");
            return retorno;
        
    }
}
