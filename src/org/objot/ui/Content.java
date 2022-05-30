package org.objot.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class Content extends JPanel {
	public Content() {
		this.setBackground(Color.CYAN);
		this.add(new MainScreen(), BorderLayout.CENTER);
	}
}
