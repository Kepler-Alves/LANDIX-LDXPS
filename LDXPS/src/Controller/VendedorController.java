/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ldxps.Model.Vendedor;

/**
 *
 * @author Kepler
 */
public class VendedorController {
    
    public RetornoPersonalizado cadastrarVendedor(String CDVEND,String DSNOME, int CDTAB, String DTNASC){
        
        if(DSNOME == null || DSNOME.isEmpty()){
        RetornoPersonalizado retorno = new RetornoPersonalizado(false,"Nome não preenchido corretamente");
        return retorno;
        }
        Vendedor v = new Vendedor(DSNOME,CDTAB,DTNASC);
        int resultado = v.insert();
        
        if (resultado <= 0){
            RetornoPersonalizado retorno = new RetornoPersonalizado(false, "Erro");
            return retorno;
        }
        RetornoPersonalizado retorno = new RetornoPersonalizado(true, "Cadastrado com sucesso");
            return retorno;
        
    }
    
}
