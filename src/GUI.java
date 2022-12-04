import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI{

    public static void main(String[] args) {

        JFrame frame = new JFrame("Event App");
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.setVisible(true);



        final JTextArea textArea = new JTextArea(10, 40);
        f.getContentPane().add(BorderLayout.CENTER, textArea);
        final JButton button = new JButton("Click Me");
        f.getContentPane().add(BorderLayout.SOUTH, button);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Button was clicked\n");

            }
        });



    }

}


