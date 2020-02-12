/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdpeliculas_173089;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.resources.logging;


        
public class Conexion {
    Connection con;
    public Conexion() {
        try{
        
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/peliculas","root","");
        }catch(SQLException e){
            Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    public Connection getConexion(){
        return con;
    }
}

