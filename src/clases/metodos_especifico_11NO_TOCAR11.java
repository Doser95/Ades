/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import registro_login.Login;
import static registro_login.Login.user;
import registro_login.Registro;
import static registro_login.Registro.pass;
import modulo_ventanilla.Ventanilla;
import modulo_almacen.almacen;
import modulo_almacen.añadir_prod;
import modulo_almacen.ver_productos;

/**
 *
 * @author l
 */
public class metodos_especifico_11NO_TOCAR11 {

    conexion cn = new conexion();
    Connection con = cn.conectar();

    //Login
    public void area(int c) {

        if (c == 1) {
            almacen al = new almacen();
            al.setLocationRelativeTo(null);
            al.setVisible(true);

            al.n_usuario.setText(user.getText());
        } else {
            if (c == 2) {

            } else {
                if (c == 3) {
                    Ventanilla al = new Ventanilla();
                    al.setLocationRelativeTo(null);
                    al.setVisible(true);

                    al.n_usuario.setText(user.getText());
                }
            }
        }
    }

    //Registro
    //Fuerza la revalidación de disponibilidad de nombre de usuario
    public void revalidar(JTextField campo) {
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c) || Character.isLetter(c) || !Character.isLetterOrDigit(c)) {
                    Registro.pass.enable(false);
                    Registro.pass2.enable(false);
                    Registro.nombre.enable(false);
                    Registro.s_nombre.enable(false);
                    Registro.p_apellido.enable(false);
                    Registro.s_apellido.enable(false);
                    cambiar_color.color_rojo_backGround(Registro.pass);
                    cambiar_color.color_rojo_backGround(Registro.pass2);
                    cambiar_color.color_rojo_backGround(Registro.nombre);
                    cambiar_color.color_rojo_backGround(Registro.s_nombre);
                    cambiar_color.color_rojo_backGround(Registro.p_apellido);
                    cambiar_color.color_rojo_backGround(Registro.s_apellido);
                    Registro.disponibilidad.hide();
                    Registro.disponibilidad.setText("");
                    Registro.error_icono.hide();
                    Registro.glob = 0;
                }
            }
        });
    }

    //hace reset a registro
    public void reset() {
        Registro.user.setText("");
        Registro.pass.setText("");
        Registro.pass2.setText("");
        Registro.nombre.setText("");
        Registro.s_nombre.setText("");
        Registro.p_apellido.setText("");
        Registro.s_apellido.setText("");
        Registro.error_icono.setVisible(false);
        Registro.disponibilidad.setVisible(false);
    }

    //Almacen/Agregar producto
    public void verificar_id() {

        int n1 = ver_productos.tabla1.getRowCount();
        String num = String.valueOf(n1 + 1);

        añadir_prod.idLabel.setText(num);

    }

    //Solo se permiten letras
    public void solo_letras(JTextField campo) {
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
    }

    //No se permiten caracteres especiales
    public void solo_especiales(JTextField campo) {
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetterOrDigit(c)) {
                    e.consume();
                }
            }
        });
    }

    //Solo se permiten numeros
    public void solo_numeros(JTextField campo) {
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                    e.consume();
                }
            }
        });
    }

    //Limitar número de caracteres
    public void limitar_caracteres(JTextField campo, int x) {
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                int max = campo.getText().length();
                if (max >= x) {
                    e.consume();
                }
            }
        });
    }

    //Cierre al enter
    public void cerrar_form_enter(JFrame x, JButton y) {
        x.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (c == evt.VK_ENTER) {
                    y.doClick();
                }
            }
        });
    }

    //Busqueda al escribir
    //utilizando keyListener se realiza Query a db utilizando like '%example%'
    public void busqueda_al_escribir(JTextField cpm, JTable tb, JComboBox cb, JComboBox cv) {
        cpm.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetterOrDigit(c) || !Character.isLetterOrDigit(c)) {
                    Integer tipo = cv.getSelectedIndex();
                    String comodin2 = cb.getSelectedItem().toString();
                    String code = null;
                    String texto = cpm.getText();

                    DefaultTableModel nm = new DefaultTableModel();
                    if (tipo == 0 /*&& comodin2.equalsIgnoreCase("Todo")*/) {
                        if (comodin2.equals("Todo")) {
                            code = "select nombre_prod, TIPO, clave, stock_minimo, existencia, stock_maximo, localizacion from productos where nombre_prod like '%" + texto + "%'";
                            nm.addColumn("Nombre del producto");
                            nm.addColumn("Tipo");
                            nm.addColumn("Clave");
                            nm.addColumn("Stock minimo");
                            nm.addColumn("Existencia");
                            nm.addColumn("Stock maximo");
                            nm.addColumn("Localización");

                        } else {
                            code = "select nombre_prod, TIPO, clave, stock_minimo, existencia, stock_maximo, localizacion from productos where TIPO = '" + comodin2 + "' and nombre_prod like '%" + texto + "%'";
                            nm.addColumn("Nombre del producto");
                            nm.addColumn("Tipo");
                            nm.addColumn("Clave");
                            nm.addColumn("Stock minimo");
                            nm.addColumn("Existencia");
                            nm.addColumn("Stock maximo");
                            nm.addColumn("Localización");
                        }
                    } else {
                        if (tipo == 1) {
                            if (comodin2.equals("Todo")) {
                                code = "select nombre, presentacion, clave, stock_minimo, existencia, stock_maximo, controlado from medicamentos where nombre like '%" + texto + "%'";
                                nm.addColumn("Nombre del producto");
                                nm.addColumn("presentacion");
                                nm.addColumn("Clave");
                                nm.addColumn("Stock minimo");
                                nm.addColumn("Existencia");
                                nm.addColumn("Stock maximo");
                                nm.addColumn("controlado");
                            } else {
                                int ccc;
                                if (comodin2.equals("No controlado")){
                                    ccc = 0;
                                }else{
                                    ccc = 1;
                                }
                                code = "select nombre, presentacion, clave, stock_minimo, existencia, stock_maximo, controlado from medicamentos where controlado = " + ccc + " and nombre like '%" + texto + "%'";
                                nm.addColumn("Nombre del producto");
                                nm.addColumn("presentacion");
                                nm.addColumn("Clave");
                                nm.addColumn("Stock minimo");
                                nm.addColumn("Existencia");
                                nm.addColumn("Stock maximo");
                                nm.addColumn("controlado");
                            }
                        }

                    }

                    tb.setModel(nm);

                    String var[] = new String[7];

                    try {
                        Statement ps = con.createStatement();
                        ResultSet rs = ps.executeQuery(code);
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
                        tb.setModel(nm);
                        tb.getColumnModel().getColumn(0).setPreferredWidth(500);
                    } catch (SQLException ex) {
                        java.util.logging.Logger.getLogger(metodos_especifico_11NO_TOCAR11.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }

    //Timer
    public void timer(JFrame x) {
        Thread mith = Thread.currentThread();
        try {
            long start = 5000;
            while (start > 0) {
                start = System.currentTimeMillis();
                mith.sleep(5000);
                x.show();
            }
        } catch (InterruptedException c) {
            System.out.println(c);
        }
    }

    //ocultar forms
    public void ocultar_forms(JPanel x) {
        x.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Ventanilla.ip.dispose();
                Ventanilla.vc.dispose();
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }

        });
    }
}
