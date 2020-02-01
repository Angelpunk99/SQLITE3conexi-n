/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlprueba;

/**
 *
 * @author Angel
 */
import java.sql.*;
public class Sqlprueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection c= null;
        
        try{
            Class.forName("org.sqlite.JDBC");
            c=DriverManager.getConnection("jdbc:sqlite:PUNTO_VENTAS.db");
            System.out.println("CONEXION EXITOSA");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
