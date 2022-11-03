package org.example.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MakeFrame extends Frame implements ActionListener {
    List list;
    Panel panel;
    TextField textField;
    Button okBtn;
    Button exitBtn;

    public MakeFrame() {
        list = new List();
        panel = new Panel();
        textField = new TextField();
        okBtn = new Button("확인");
        exitBtn = new Button("종료");

        setLayout(new BorderLayout());
        add(panel, BorderLayout.NORTH);
        add(list, BorderLayout.CENTER);

        panel.add(new Label("write"));
        panel.add(textField);
        panel.add(okBtn);
        panel.add(exitBtn);

//        okBtn.addActionListener(this);
        okBtn.addActionListener(e -> list.add(textField.getText()));
        exitBtn.addActionListener(this);


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
//                setVisible(false);
//                dispose();
//                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == okBtn) {
            list.add(textField.getText());
        } else if (e.getSource() == exitBtn) {
            setVisible(false);
            dispose();
            System.exit(0);
        }

    }
}
