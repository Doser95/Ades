/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro_login;

import modulo_ventanilla.Ventanilla;
import alertas.campo_vacio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import clases.cambiar_color;
import clases.conexion;
import clases.metodos_especifico_11NO_TOCAR11;

/**
 *
 * @author l
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    conexion cn = new conexion();
    Connection ccn = cn.conectar();

    Registro r = new Registro();
    cambiar_color cc = new cambiar_color();
    campo_vacio cv = new campo_vacio();
    Ventanilla p = new Ventanilla();
    metodos_especifico_11NO_TOCAR11 me = new metodos_especifico_11NO_TOCAR11();

    public Login() {
        initComponents();
        cc.color_boton_verde(login);
        cc.clic_border_color(user);
        cc.clic_border_color(pass);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panel_info = new javax.swing.JPanel();
        pass = new javax.swing.JPasswordField();
        ingresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        registro = new javax.swing.JButton();
        login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        jPanel1.setFocusCycleRoot(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/scaled2.jpg"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setText("¿No tienes una cuenta?, Registrate ahora.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        panel_info.setBackground(new java.awt.Color(204, 204, 204));
        panel_info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pass.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passKeyTyped(evt);
            }
        });
        panel_info.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 180, 20));

        ingresar.setBackground(new java.awt.Color(153, 153, 153));
        ingresar.setText("Ingresar");
        ingresar.setBorder(null);
        ingresar.setFocusPainted(false);
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        panel_info.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 180, 20));

        jLabel1.setText("Hospital general de Candelaria");
        panel_info.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel4.setText("Usuario");
        panel_info.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jLabel5.setText("Contraseña");
        panel_info.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        user.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userKeyTyped(evt);
            }
        });
        panel_info.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 180, -1));

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setText("¿Has olvidado tu contraseña?");
        jButton4.setBorder(null);
        jButton4.setFocusPainted(false);
        panel_info.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 180, 20));

        registro.setBackground(new java.awt.Color(153, 153, 153));
        registro.setText("Registro");
        registro.setBorder(null);
        registro.setFocusPainted(false);
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(153, 153, 153));
        login.setText("Login");
        login.setBorder(null);
        login.setFocusPainted(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registro, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_info, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        cc.color_boton_verde(registro);
        cc.color_boton_gris(login);
        r.setLocationRelativeTo(panel_info);
        r.setVisible(true);
        r.setAlwaysOnTop(rootPaneCheckingEnabled);

    }//GEN-LAST:event_registroActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        r.dispose();
        cc.color_boton_verde(login);
        cc.color_boton_gris(registro);
    }//GEN-LAST:event_loginActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        if (user.getText().equals("") || pass.getText().equals("")) {

            cv.setLocationRelativeTo(null);
            cv.setVisible(true);
            if (user.getText().equals("")) {
                cc.color_rojo_border(user);
            }
            if (pass.getText().equals("")) {
                cc.color_rojo_border(pass);
            }
        } else {
            try {
                ResultSet rs = null;
                PreparedStatement cc = ccn.prepareStatement("select usuario, contraseña, acceso, area from usuarios where usuario = ?");
                cc.setString(1, user.getText());
                rs = cc.executeQuery();
                if (rs.next()) {
                    if (rs.getString(2).equals(pass.getText())) {
                        int acceso, area;
                        acceso = rs.getInt(3);
                        area = rs.getInt(4);
                        if (acceso == 0) {
                            campo_vacio ad = new campo_vacio();
                            ad.setLocationRelativeTo(null);
                            ad.setVisible(true);
                            ad.texto.setText("Acceso denegado, contacte al Administrador");
                            ad.setAlwaysOnTop(rootPaneCheckingEnabled);
                        } else {
                            if (acceso == 1) {
                                me.area(area);
                                this.hide();
                            } else {
                                if (acceso == 2) {
                                    //Pendiente
                                }
                            }
                        }

                    } else {                        
                        campo_vacio bv = new campo_vacio();
                        bv.setLocationRelativeTo(null);
                        bv.setVisible(true);
                        bv.texto.setText("Contraseña incorrecta, favor de verificar");
                    }
                } else {
                    campo_vacio bvv = new campo_vacio();
                    bvv.setLocationRelativeTo(null);
                    bvv.setVisible(true);                    
                    bvv.texto.setText("Usuario no existe, favor de verificar");                    
                }

            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ingresarActionPerformed

    private void passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyTyped
        char c = evt.getKeyChar();
        if (c == evt.VK_ENTER) {
            ingresar.doClick();
        }
    }//GEN-LAST:event_passKeyTyped

    private void userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyTyped
        char c = evt.getKeyChar();
        if (c == evt.VK_ENTER) {
            ingresar.doClick();
        }
    }//GEN-LAST:event_userKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ingresar;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JButton login;
    private javax.swing.JPanel panel_info;
    private javax.swing.JPasswordField pass;
    public static javax.swing.JButton registro;
    public static javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
