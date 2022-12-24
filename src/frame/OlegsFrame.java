package frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlegsFrame extends JFrame {
    private static int numberOfOlegs = 0;
    private static JLabel numberLabel;
    public OlegsFrame(){
        super("Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton buttonIncrease = new JButton("Increase");
        add(buttonIncrease, BorderLayout.SOUTH);
        numberLabel = new JLabel("Number of Olegs: " + numberOfOlegs);
        add(numberLabel, BorderLayout.CENTER);
        buttonIncrease.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                numberOfOlegs++;
                updateNumberOfOlegs();
            }
        });

        setPreferredSize(new Dimension(300, 200));

        pack();
        setVisible(true);
    }
    private static void updateNumberOfOlegs() {
        //Обновляем содержимое Лейбла
        numberLabel.setText("Number of Olegs: " + numberOfOlegs);
    }
}
