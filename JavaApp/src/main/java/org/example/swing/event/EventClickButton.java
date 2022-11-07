package org.example.swing.event;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventClickButton implements ActionListener {
    JLabel j1;
    public EventClickButton(JLabel j1) {
        // 의존관계
        this.j1 = j1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        j1.setText("누른다고 진짜 누르냐");
    }
}
