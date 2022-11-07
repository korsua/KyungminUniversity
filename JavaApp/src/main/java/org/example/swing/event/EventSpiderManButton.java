package org.example.swing.event;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventSpiderManButton implements ActionListener {
    JLabel j1;
    public EventSpiderManButton(JLabel j1) {
        this.j1 = j1;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        j1.setText("스파이더맨 버튼누름");
    }
}
