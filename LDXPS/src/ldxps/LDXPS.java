/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldxps;

import View.Home;
import ldxps.Persistencia.ConexaoDB;
import java.sql.*;
import java.util.ArrayList;
import ldxps.Model.Cliente;

/**
 *
 * @author Kepler
 */
public class LDXPS {

 
    public static void main(String[] args) {

        Home home = new Home();
        home.setVisible(true);
    }
   
}