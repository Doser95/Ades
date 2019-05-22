/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author l
 */
public class cambiar_color {

    // BOTONES
    public void color_boton_verde(JButton x) {
        x.setBackground(new Color(51, 255, 51));
    }

    public void color_boton_gris(JButton x) {
        x.setBackground(new Color(153, 153, 153));
    }
    
    public void color_boton_rojo(JButton x) {
        x.setBackground( Color.red);
    }

    // LABELS
    public void color_label_verde(JLabel x) {
        x.setForeground(new Color(0, 204, 0));
    }

    public void color_label_rojo(JLabel x) {
        x.setForeground(new Color(255, 0, 0));
    }

    //TEXTFIELDS
    public void color_rojo_border(JTextField j) {
        j.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red));
    }

    public void color_negro_border(JTextField j) {
        j.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
    }

    public static void color_rojo_backGround(JTextField j) {
        j.setBackground(new Color(255, 153, 153));
    }
    
    public void color_blanco_backGround(JTextField j) {
        j.setBackground(new Color(255, 255, 255));
    }
    //Combobox
    public void color_rojo_borde(JComboBox j) {
        j.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red));
    }
    
    //MOUSELiSTENER
    public void hover_azul(JLabel x) {
        x.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {

            }

            @Override
            public void mousePressed(MouseEvent me) {

            }

            @Override
            public void mouseReleased(MouseEvent me) {

            }

            @Override
            public void mouseEntered(MouseEvent me) {
                x.setForeground(Color.blue);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                x.setForeground(Color.black);
            }

        });
    }

    public void clic_border_color(JTextField x) {
        x.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                x.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
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
