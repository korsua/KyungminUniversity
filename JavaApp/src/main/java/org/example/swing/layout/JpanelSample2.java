package org.example.swing.layout;

import javax.swing.*;
import java.awt.*;

public class JpanelSample2 extends JFrame {
    public JpanelSample2() {
        Container ct = getContentPane();
        ct.setLayout(new BorderLayout());


        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(3,1));
        jp1.add(new JRadioButton("java"));
        jp1.add(new JRadioButton("jsp"));
        jp1.add(new JRadioButton("spring"));

        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout(3,1));
        jp2.add(new JButton("java"));
        jp2.add(new JButton("jsp"));
        jp2.add(new JButton("spring"));

        ct.add(jp1, BorderLayout.WEST);
        ct.add(jp2, BorderLayout.EAST);

        setTitle("Jpanel Sample 1");
        setSize(300,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JpanelSample2();
    }
}
