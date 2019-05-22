/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import modulo_almacen.lista_productos;

/**
 *
 * @author l
 */

public class modificadores_tabla extends JTable {
lista_productos lp = new lista_productos();
    public Component prepareRendert(TableCellRenderer renderer, int rowIndex, int columnIndex) {
        Component component = super.prepareRenderer(renderer, rowIndex, columnIndex);

        //if ((Integer.class.equals(this.getColumnClass(columnIndex))) && (getValueAt(rowIndex, columnIndex) != null)) {
            //Integer VAL = lp.x();
            String v = this.getValueAt(rowIndex, 4).toString();
            Integer VAL = Integer.parseInt(v);
            if (VAL <= 10) {
                component.setBackground(Color.red);
                component.setForeground(Color.white);
            } else {
                component.setBackground(Color.white);
                component.setForeground(Color.black);
            }
        //}
        return this;
    }
}
