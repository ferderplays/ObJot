package org.objot.ui.apps.settings.colors;

import org.objot.ui.AppBar;
import org.objot.ui.Content;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ColorSettings extends JFrame {

    private JPanel panel = new JPanel();
    private JLabel label1 = new JLabel("AppBar color Settings:"), label2 = new JLabel("Main Display Color:"), label3 = new JLabel("Change");
    private JTextArea text1 = new JTextArea(), text2 = new JTextArea();

    public ColorSettings() {
        this.setTitle("ObJot v1.0.0 - Settings/Colors");
        this.add(panel);
        panel.setBackground(new Color(15, 15, 15));
        panel.setLayout(new GridLayout(5, 1));
        panel.add(label1);
        panel.add(text1);
        panel.add(label2);
        panel.add(text2);
        panel.add(label3);
        label3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String txt1 = text1.getText();
                if (txt1 == "") System.out.println("");
                else if (txt1.equals("red")) AppBar.changeBgColor(255, 0, 0);
                else if (txt1.equals("black")) AppBar.changeBgColor(0, 0, 0);
                else if (txt1.equals("blue")) AppBar.changeBgColor(0, 0, 255);
                else if (txt1.equals("cyan")) AppBar.changeBgColor(0, 255, 255);
                else if (txt1.equals("dark gray")) AppBar.changeBgColor(20, 20, 20);
                else if (txt1.equals("gray")) AppBar.changeBgColor(50, 50, 50);
                else if (txt1.equals("green")) AppBar.changeBgColor(0, 255, 0);
                else if (txt1.equals("light gray")) AppBar.changeBgColor(92, 92, 92);
                else if (txt1.equals("magenta")) AppBar.changeBgColor(255, 0, 225);
                else if (txt1.equals("orange")) AppBar.changeBgColor(255, 145, 0);
                else if (txt1.equals("pink")) AppBar.changeBgColor(255, 125, 225);
                else if (txt1.equals("white")) AppBar.changeBgColor(255, 255, 255);
                else if (txt1.equals("yellow")) AppBar.changeBgColor(255, 255, 0);
                String txt2 = text2.getText();
                if (txt2 == "") System.out.println("");
                else if (txt2.equals("red")) Content.changeBgColor(255, 0, 0);
                else if (txt2.equals("black")) Content.changeBgColor(0, 0, 0);
                else if (txt2.equals("blue")) Content.changeBgColor(0, 0, 255);
                else if (txt2.equals("cyan")) Content.changeBgColor(0, 255, 255);
                else if (txt2.equals("dark gray")) Content.changeBgColor(20, 20, 20);
                else if (txt2.equals("gray")) Content.changeBgColor(50, 50, 50);
                else if (txt2.equals("green")) Content.changeBgColor(0, 255, 0);
                else if (txt2.equals("light gray")) Content.changeBgColor(92, 92, 92);
                else if (txt2.equals("magenta")) Content.changeBgColor(255, 0, 225);
                else if (txt2.equals("orange")) Content.changeBgColor(255, 145, 0);
                else if (txt2.equals("pink")) Content.changeBgColor(255, 125, 225);
                else if (txt2.equals("white")) Content.changeBgColor(255, 255, 255);
                else if (txt2.equals("yellow")) Content.changeBgColor(255, 255, 0);
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
