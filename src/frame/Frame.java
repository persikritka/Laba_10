package frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {
    private static int numberOfOlegs = 0;
    private static JLabel numberLabel;
    public static void createGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        numberLabel = new JLabel("Number of Olegs: " + numberOfOlegs);
        frame.add(numberLabel, BorderLayout.CENTER);

        JButton buttonIncrease = new JButton("Increase");
        frame.add(buttonIncrease, BorderLayout.SOUTH);

        buttonIncrease.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                numberOfOlegs++;
                updateNumberOfOlegs();
            }
        });

        frame.setPreferredSize(new Dimension(300, 200));

        frame.pack();
        frame.setVisible(true);
    }

    private static void updateNumberOfOlegs() {
        //Обновляем содержимое Лейбла
        numberLabel.setText("Number of Olegs: " + numberOfOlegs);
    }
}
