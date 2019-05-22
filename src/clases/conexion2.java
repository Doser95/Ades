/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.sql.*;
/**
 *
 * @author l
 */
public class conexion2 {
    Connection cn;

    public Connection conectar() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=proyect_hospital", "sa", "123");
            System.out.println("conexion exitosa");
        } catch (Exception e) {
            System.out.println("Error al conectar");
        }
        return cn;
    }
    
   Statement createStatemen() {
        throw new UnsupportedOperationException("no soportado");
    }
    
    public void desconectar(){
        cn = null;
        System.out.println("Desconexion exitosa");
    }
}
