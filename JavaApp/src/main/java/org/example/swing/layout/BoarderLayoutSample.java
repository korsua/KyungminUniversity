package org.example.swing.layout;

import javax.swing.*;
import java.awt.*;

public class BoarderLayoutSample extends JFrame {
    public BoarderLayoutSample() {
        Container ct = getContentPane();
        BorderLayout b1 = new BorderLayout(50,50);
        ct.setLayout(b1);

        ct.add(new JButton("right"), BorderLayout.EAST);
        ct.add(new JButton("left"), BorderLayout.WEST);
        ct.add(new JButton("top"), BorderLayout.NORTH);
        ct.add(new JButton("bottom"), BorderLayout.SOUTH);
        ct.add(new JButton("center"), BorderLayout.CENTER);

        setTitle("BorderLayout Sample");
        setSize(400, 300);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BoarderLayoutSample();
    }

}
