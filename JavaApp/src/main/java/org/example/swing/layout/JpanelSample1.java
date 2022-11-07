package org.example.swing.layout;

import javax.swing.*;
import java.awt.*;

public class JpanelSample1 extends JFrame {
    public JpanelSample1() {
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        ct.add(new JRadioButton("java"));
        ct.add(new JRadioButton("jsp"));
        ct.add(new JRadioButton("spring"));
        ct.add(new JButton("java"));
        ct.add(new JButton("jsp"));
        ct.add(new JButton("spring"));

        setTitle("Jpanel Sample 1");
        setSize(300,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JpanelSample1();
    }
}
