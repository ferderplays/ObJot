package org.objot.ui.loading;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoadingScreen extends JFrame {
	
	private Icon loader;
	private JLabel label;
	
	public LoadingScreen() {
		
		loader = new ImageIcon(System.getProperty("user.home") + "\\Desktop\\ObJot-v1.0.2\\resources\\loading.gif");
		label = new JLabel(loader);
		
		this.setUndecorated(true);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.BLACK);
		this.getContentPane().add(label);
		this.pack();
	}
}
