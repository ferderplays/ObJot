package org.objot.ui;

import org.objot.ui.apps.calculator.Calculator;
import org.objot.ui.apps.settings.SettingsApp;
import org.objot.utils.FileUtil;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AppBar {

	public static JPanel panel = new JPanel();
	private Icon icon1;
	private JLabel button, button2, button3, button4, button5;

	public AppBar() {
		icon1 = new ImageIcon(System.getProperty("user.home") + "\\Desktop\\ObJot-v1.0.2\\resources\\calculator.png");
		button = new JLabel(icon1);
		button2 = new JLabel("Turn OFF");
		button3 = new JLabel("Discord");
		button5 = new JLabel("Chrome");
		button4 = new JLabel("Settings");

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
						File file = new File(System.getProperty("user.home") + "\\AppData\\Local\\Discord\\app-1.0.9004\\Discord.exe");
						try {
							FileUtil.open(file);
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
		button4.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switch (e.getClickCount()) {
					case 1:
						new SettingsApp();
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
		button5.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switch (e.getClickCount()) {
					case 1:
						File file = new File("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
						try {
							FileUtil.open(file);
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

		panel.setLayout(new GridLayout(1, 1));
		panel.setBackground(new Color(15, 15, 15));
		panel.add(button2);
		panel.add(button3);
		panel.add(button5);
		panel.add(button4);
		panel.add(button);
		panel.add(new JLabel());
	}

	public static void changeBgColor(Integer r, Integer g, Integer b) {
		Color bgcolor = new Color(r, g, b);
		panel.setBackground(bgcolor);
	}
}
