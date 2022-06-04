package org.objot.ui.apps.settings;

import org.objot.ui.apps.settings.colors.ColorSettings;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SettingsApp extends JFrame {

    private JLabel label1 = new JLabel("Colors");

    public SettingsApp() {
        this.setTitle("ObJot v1.0.0 - Settings");
        this.add(label1);
        label1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                switch (e.getClickCount()) {
                    case 1:
                        new ColorSettings();
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
        this.setVisible(true);
    }
}
