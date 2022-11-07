package org.example.swing.layout;

import javax.swing.*;
import java.awt.*;

public class GridLayoutSample extends JFrame {
    public GridLayoutSample() {
        Container ct = getContentPane();
        GridLayout g1 = new GridLayout(4,5,10,10);
        ct.setLayout(g1);
        for (int i = 0; i < 20; i++) {
            ct.add(new JButton("버튼" + i));
        }
        setTitle("GridLayout Sample");
        setSize(800,800);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutSample();
    }
}
