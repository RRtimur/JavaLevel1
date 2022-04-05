package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lesson8 extends JFrame {

    int count = 0;

    public Lesson8(){
        setBounds(300,300,300,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Counter");


        JButton leftButton = new JButton("<");
        JButton rightButton = new JButton(">");
        JLabel counter = new JLabel("0");

        Font font = new Font("Arial", Font.BOLD,36);

        counter.setFont(font);
        counter.setHorizontalAlignment(SwingConstants.CENTER);


        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                counter.setText(String.valueOf(count));
            }
        });

        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                counter.setText(String.valueOf(count));
            }
        });

        add(leftButton, BorderLayout.WEST);
        add(rightButton, BorderLayout.EAST);
        add(counter, BorderLayout.CENTER);

        setVisible(true);

    }

    public static void main(String[] args){
        new Lesson8();
    }
}
