package org.objot.ui;

import org.objot.ui.apps.calculator.Calculator;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AppBar extends JPanel {
	
	private Icon icon1;
	private JLabel button, button2, button3;
	
	public AppBar() {
		icon1 = new ImageIcon(System.getProperty("user.home") + "\\Desktop\\ObJot-v1.0.0\\resources\\calculator.png");
		button = new JLabel(icon1);
		button2 = new JLabel("Turn OFF");
		button3 = new JLabel("Discord");
		
		button.setBackground(new Color(15, 15, 15));
		button.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switch (e.getClickCount()) {
					case 1:
						new Calculator();
				}
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
		button2.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				switch (e.getClickCount()) {
					case 1:
						MainWindow.end();
				}
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
		button3.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switch (e.getClickCount()) {
					case 1:
						Desktop desktop = Desktop.getDesktop();
						try {
							desktop.open(new File("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Discord Inc\\Discord.exe"));
						} catch (IOException ioException) {
							ioException.printStackTrace();
						}
				}
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
		button2.setBackground(new Color(15, 15, 15));
		
		this.setLayout(new GridLayout(1, 1));
		this.setBackground(new Color(15, 15, 15));
		this.add(button2);
		this.add(button3);
		this.add(button);
	}
}
