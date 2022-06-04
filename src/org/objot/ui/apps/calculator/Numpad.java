package org.objot.ui.apps.calculator;

import javax.swing.*;
import java.awt.*;

public class Numpad extends JPanel {
    private JLabel num1, num2, num3, num4, num5, num6, num7, num8, num9;

    public Numpad() {
        num1 = new JLabel("1");
        num2 = new JLabel("2");
        num3 = new JLabel("3");
        num4 = new JLabel("4");
        num5 = new JLabel("5");
        num6 = new JLabel("6");
        num7 = new JLabel("7");
        num8 = new JLabel("8");
        num9 = new JLabel("9");

        this.setLayout(new GridLayout(3, 3));
        this.setBackground(new Color(15, 15, 15));
        this.setForeground(Color.WHITE);
        this.add(num1);
        this.add(num2);
        this.add(num3);
        this.add(num4);
        this.add(num5);
        this.add(num6);
        this.add(num7);
        this.add(num8);
        this.add(num9);
    }
}
