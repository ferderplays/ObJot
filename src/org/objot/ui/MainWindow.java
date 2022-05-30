package org.objot.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainWindow {

	private static JFrame frame = new JFrame();
	
	public MainWindow() {
		frame.setTitle("ObJot v-test-0.0.1");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.add(new Content());
		frame.add(new AppBar(), BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void end() {
		frame.dispose();
	}
}
