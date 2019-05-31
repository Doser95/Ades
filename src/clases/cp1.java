/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modulo_almacen.añadir_prod;
import modulo_almacen.ver_productos;

/**
 *
 * @author l
 */


public class cp1 {
    conexion cn = new conexion();
    Connection con = cn.conectar();
    public void verificar_id() {

        int n1 = ver_productos.tabla1.getRowCount();
        int i = 267;
        String num = String.valueOf(n1 - i);
        
        añadir_prod.idLabel.setText(num);

    }
}
