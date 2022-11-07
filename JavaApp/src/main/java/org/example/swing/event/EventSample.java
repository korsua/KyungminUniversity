package org.example.swing.event;

import jdk.jfr.Event;

import javax.swing.*;
import java.awt.*;

public class EventSample extends JFrame {
    JLabel j1;
    JButton jb1, jb2,jb3;
    public EventSample(){
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());


        jb1 = new JButton("눌러봐~!");
        jb2 = new JButton("아이언맨!");
        jb3 = new JButton("스파이더맨");
        j1 = new JLabel("Click Button");
        jb1.addActionListener(new EventClickButton(j1));
        jb2.addActionListener(new EventIronManButton(j1));
        jb3.addActionListener(new EventSpiderManButton(j1));

        ct.add(jb1);
        ct.add(jb2);
        ct.add(jb3);
        ct.add(j1);


        setTitle("Event Example");
        setSize(400,300);
        setVisible(true);
    }

}