package me.railrunner16.lib.ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class WrapperFrame extends JFrame {
    public void exitOnClose() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void centerOnScreen() {
        this.setLocationRelativeTo(null);
    }

    public void fillScreen() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
    }
}