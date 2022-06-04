package org.objot.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class Content {

	public static JPanel panel = new JPanel();
	public Content() {
		panel.setBackground(Color.CYAN);
	}

	public static void changeBgColor(Integer r, Integer g, Integer b) {
		Color color = new Color(r, g, b);
		panel.setBackground(color);
	}
}
