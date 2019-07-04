/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_almacen;

import clases.conexion;
import clases.metodos_especifico_11NO_TOCAR11;
import clases.rellenos_combobox;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author l
 */
public class ver_productos extends javax.swing.JInternalFrame {

    /**
     * Creates new form ver_productos
     */
    conexion cn = new conexion();
    Connection con = cn.conectar();
    rellenos_combobox rc = new rellenos_combobox();
    metodos_especifico_11NO_TOCAR11 me = new metodos_especifico_11NO_TOCAR11();

    public ver_productos() {
        initComponents();
        mostrar_tabla();
        me.busqueda_al_escribir(texto_tb, tabla1, filtro_cb, tipo);
        tabla1.getColumnModel().getColumn(0).setPreferredWidth(500);
    }

    public void mostrar_tabla() {
        String query = "";
        DefaultTableModel nm = new DefaultTableModel();

        if (tipo.getSelectedIndex() == 0) {
            query = "select nombre_prod, TIPO, clave, stock_minimo, existencia, stock_maximo, localizacion from productos";

            nm.addColumn("Nombre del producto");
            nm.addColumn("Tipo");
            nm.addColumn("Clave");
            nm.addColumn("Stock minimo");
            nm.addColumn("Existencia");
            nm.addColumn("Stock maximo");
            nm.addColumn("Localización");

        } else {
            query = "select nombre, presentacion, clave, stock_minimo, existencia, stock_maximo, controlado from medicamentos";

            nm.addColumn("Nombre del producto");
            nm.addColumn("presentacion");
            nm.addColumn("Clave");
            nm.addColumn("Stock minimo");
            nm.addColumn("Existencia");
            nm.addColumn("Stock maximo");
            nm.addColumn("controlado");
        }

        tabla1.setModel(nm);

        String var[] = new String[7];
        try {

            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                var[0] = rs.getString(1);
                var[1] = rs.getString(2);
                var[2] = rs.getString(3);
                var[3] = rs.getString(4);
                var[4] = rs.getString(5);
                var[5] = rs.getString(6);
                var[6] = rs.getString(7);
                nm.addRow(var);

            }
            tabla1.setModel(nm);

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ver_productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        texto_tb = new javax.swing.JTextField();
        filtro_cb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();

        setClosable(true);
        setFrameIcon(null);

        jLabel2.setText("Buscar por:");

        filtro_cb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                filtro_cbMouseEntered(evt);
            }
        });

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla1);

        jLabel1.setText("Tipo:");

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Material", "Medicamentos" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filtro_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(texto_tb, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(filtro_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtro_cbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtro_cbMouseEntered
        if (tipo.getSelectedIndex() == 0) {
            filtro_cb.removeAllItems();
            filtro_cb.addItem("Todo");
            rc.tipos_productos_busqueda_material(filtro_cb);
        } else {
            filtro_cb.removeAllItems();
            filtro_cb.addItem("Todo");
            rc.tipos_productos_busqueda_medicamentos(filtro_cb);
        }
    }//GEN-LAST:event_filtro_cbMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> filtro_cb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabla1;
    public static javax.swing.JTextField texto_tb;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
