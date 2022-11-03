package org.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MakeComponent extends JFrame implements ActionListener {
    private JButton jButtonExit;
    private JPanel jPanel;
    private JLabel jLabel;
    private JLabel jLabelBlank;
    private JButton jButton;
    private JTextField jtextField;
    private JComboBox<String> jComboBox;
    private JCheckBox jCheckBox;
    private String[] items = {"박남일", "배수지", "박보검"};

    public MakeComponent() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jPanel = (JPanel) getContentPane();
        jPanel.setLayout(new FlowLayout()); // layout Manager

        jLabel = new JLabel("라벨");
        jButton = new JButton("버튼");
        jtextField = new JTextField(20);
        jComboBox = new JComboBox<>(items);
        jCheckBox = new JCheckBox();
        jLabelBlank = new JLabel();
        jButtonExit = new JButton("Exit");
        jCheckBox.add(new PopupMenu("hello"));

        jPanel.add(jLabel);
        jPanel.add(jButton);
        jPanel.add(jtextField);
        jPanel.add(jComboBox);
        jPanel.add(jCheckBox);
        jPanel.add(jLabelBlank);
        jPanel.add(jButtonExit);

        jLabel.setPreferredSize(new Dimension(50, 50));
        jButton.setPreferredSize(new Dimension(100, 50));
        jtextField.setPreferredSize(new Dimension(300, 50));
        jComboBox.setPreferredSize(new Dimension(100, 50));
        jCheckBox.setPreferredSize(new Dimension(100, 50));
        jLabelBlank.setPreferredSize(new Dimension(200, 50));
        jButtonExit.setPreferredSize(new Dimension(100, 50));

        jButton.addActionListener(this);
        jButtonExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton && jCheckBox.isSelected()) {
            jLabelBlank.setText(jtextField.getText() + jComboBox.getSelectedItem());
        } else if (e.getSource() == jButtonExit) {
            setVisible(false);
            dispose();
            System.exit(0);
        }
    }
}
