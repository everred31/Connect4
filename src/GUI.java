import javax.swing.*;
import java.awt.*;

public class GUI {
    JFrame frame;
    JButton button;
    JPanel panel;

    public GUI(){
        frame = new JFrame();

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        button = new JButton(" HEY !!!");
        button.setOpaque(false);
        button.setContentAreaFilled(false);

        JPanel bottomPanel = new JPanel(new GridLayout(1, 7));
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        button = new JButton("HEY !!!");
        button.setOpaque(false);
        button.setContentAreaFilled(false);

        bottomPanel.add(button);
        for (int i = 0; i < 6; i++) {
            bottomPanel.add(new JButton("B"));
        }

        frame.add(bottomPanel, BorderLayout.SOUTH);


        JPanel gridPanel = new JPanel(new GridLayout(6, 7)); // 6 rows, 7 columns
        gridPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (int i = 0; i < 6 * 7; i++) {
            gridPanel.add(new JButton());
        }

        frame.add(gridPanel, BorderLayout.CENTER);

        frame.setVisible(true);






        frame.setVisible(true);
    }

    //JButton.setOpaque(true);

}
