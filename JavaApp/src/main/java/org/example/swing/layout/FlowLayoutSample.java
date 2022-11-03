package org.example.swing.layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutSample extends JFrame {
    public FlowLayoutSample() {
        Container ct = getContentPane();
        FlowLayout f1 = new FlowLayout(FlowLayout.RIGHT, 10, 15);
        ct.setLayout(f1);
        for (int i = 0; i < 15; i++) ct.add(new JButton("버튼" + i));
        setTitle("FlowLayout Sample");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutSample();
    }
}
