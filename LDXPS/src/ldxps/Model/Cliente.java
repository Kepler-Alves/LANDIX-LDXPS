/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldxps.Model;

import java.util.ArrayList;
import ldxps.Persistencia.AbstractClienteDAO;
import ldxps.Persistencia.ClienteDAO;

/**
 *
 * @author Kepler
 */
public class Cliente {
    
    private String CDCL;
    private String DSNOME;
    private String IDTIPO;
    private String CDVEND;
    private double DSLIM;
    
      public Cliente(){
        
    }
          public Cliente(String DSNOME, String IDTIPO, double DSLIM) {
        this.DSNOME = DSNOME;
        this.IDTIPO = IDTIPO;
        this.DSLIM = DSLIM;
    }

      
    public Cliente(String CDCL, String DSNOME, String IDTIPO, String CDVEND, double DSLIM) {
        this.CDCL = CDCL;
        this.DSNOME = DSNOME;
        this.IDTIPO = IDTIPO;
        this.CDVEND = CDVEND;
        this.DSLIM = DSLIM;
    }

   

    public String getCDCL() {
        return CDCL;
    }

    public void setCDCL(String CDCL) {
        this.CDCL = CDCL;
    }

    public String getDSNOME() {
        return DSNOME;
    }

    public void setDSNOME(String DSNOME) {
        this.DSNOME = DSNOME;
    }

    public String getIDTIPO() {
        return IDTIPO;
    }

    public void setIDTIPO(String IDTIPO) {
        this.IDTIPO = IDTIPO;
    }

    public String getCDVEND() {
        return CDVEND;
    }

    public void setCDVEND(String CDVEND) {
        this.CDVEND = CDVEND;
    }

    public double getDSLIM() {
        return DSLIM;
    }

    public void setDSLIM(double DSLIM) {
        this.DSLIM = DSLIM;
    }
    
    public int insert(){

        return ClienteDAO.getInstance().insert(this);
    }
    
    public int update(){
 
        return ClienteDAO.getInstance().update(this);
    }
    
    public int delete(){

        return ClienteDAO.getInstance().delete(this);
    }
    
    public static ArrayList<Cliente> findALL(){
        return ClienteDAO.getInstance().findAll();
    }
   
    

    
}