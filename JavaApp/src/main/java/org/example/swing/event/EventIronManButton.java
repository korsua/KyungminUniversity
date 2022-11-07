package org.example.swing.event;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventIronManButton implements ActionListener {
    JLabel j1;
    public EventIronManButton(JLabel j1) {
        this.j1 = j1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        j1.setText("아이어맨 버튼 누름");

    }
}
