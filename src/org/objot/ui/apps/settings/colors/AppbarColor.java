package org.objot.ui.apps.settings.colors;

import org.objot.ui.AppBar;

import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;

public class AppbarColor extends JFrame {
    private JPanel panel = new JPanel();
    private JLabel label1, label3;
    private JTextArea textfield;

    public AppbarColor() {
        label1 = new JLabel("Appbar color:");
        textfield = new JTextArea();
        label3 = new JLabel("Change");

        this.setTitle("ObJot v1.0.0 - Settings/Appbar Color");
        this.add(panel);
        panel.setBackground(new Color(15, 15, 15));
        panel.setLayout(new GridLayout(3, 1));
        panel.add(label1);
        panel.add(textfield);
        panel.add(label3);
        label3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String text = textfield.getText();
                if (text == "") System.out.println(" ");
                else if (text.equals("red")) AppBar.changeBgColor(255, 0, 0);
                else if (text.equals("black")) AppBar.changeBgColor(0, 0, 0);
                else if (text.equals("blue")) AppBar.changeBgColor(0, 0, 255);
                else if (text.equals("cyan")) AppBar.changeBgColor(0, 255, 255);
                else if (text.equals("dark gray")) AppBar.changeBgColor(20, 20, 20);
                else if (text.equals("gray")) AppBar.changeBgColor(50, 50, 50);
                else if (text.equals("green")) AppBar.changeBgColor(0, 255, 0);
                else if (text.equals("light gray")) AppBar.changeBgColor(92, 92, 92);
                else if (text.equals("magenta")) AppBar.changeBgColor(255, 0, 225);
                else if (text.equals("orange")) AppBar.changeBgColor(255, 145, 0);
                else if (text.equals("pink")) AppBar.changeBgColor(255, 125, 225);
                else if (text.equals("white")) AppBar.changeBgColor(255, 255, 255);
                else if (text.equals("yellow")) AppBar.changeBgColor(255, 255, 0);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        this.pack();
        this.setVisible(true);
    }
}
