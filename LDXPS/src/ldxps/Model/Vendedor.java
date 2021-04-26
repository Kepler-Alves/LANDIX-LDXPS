/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldxps.Model;

import java.util.ArrayList;
import ldxps.Persistencia.AbstractVendedorDAO;
import ldxps.Persistencia.VendedorDAO;

/**
 *
 * @author Kepler
 */
public class Vendedor {
    private String CDVEND;
    private String DSNOME;
    private int CDTAB;
    private String DTNASC;

    public Vendedor(){
        
    }
    
    public Vendedor(String DSNOME, int CDTAB,String DTNASC){
        this.DSNOME = DSNOME;
        this.CDTAB = CDTAB;
        this.DTNASC = DTNASC;
    }

    public String getCDVEND() {
        return CDVEND;
    }

    public void setCDVEND(String CDVEND) {
        this.CDVEND = CDVEND;
    }

    public String getDSNOME() {
        return DSNOME;
    }

    public void setDSNOME(String DSNOME) {
        this.DSNOME = DSNOME;
    }

    public int getCDTAB() {
        return CDTAB;
    }

    public void setCDTAB(int CDTAB) {
        this.CDTAB = CDTAB;
    }

    public String getDTNASC() {
        return DTNASC;
    }

    public void setDTNASC(String DTNASC) {
        this.DTNASC = DTNASC;
    }

    public Vendedor(String CDVEND, String DSNOME, int CDTAB, String DTNASC) {
        
        this.CDVEND = CDVEND;
        this.DSNOME = DSNOME;
        this.CDTAB = CDTAB;
        this.DTNASC = DTNASC;
    }
    public int insert(){
        
        return VendedorDAO.getInstance().insert(this);
    }
    
    public int update(){
       
        return VendedorDAO.getInstance().update(this);
    }
    
    public int delete(){
        
        return VendedorDAO.getInstance().delete(this);
    }
    
    public static ArrayList<Vendedor> findALL(){
        return VendedorDAO.getInstance().findAll();
    }

}