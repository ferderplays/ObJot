package org.objot.ui.apps.calculator;

import javax.swing.*;

public class Calculator extends JFrame {
    public Calculator() {
        this.setTitle("Calculator");
        this.add(new SecPanel());
        this.add(new Numpad());
        this.setVisible(true);
        this.pack();
    }
}
