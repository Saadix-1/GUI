import javax.swing.*;
import java.awt.event.*;

public class ButtonClickExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Événement");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Clique-moi !");
        JLabel label = new JLabel("Pas encore cliqué");

        frame.setLayout(null);
        button.setBounds(100, 50, 120, 30);
        label.setBounds(100, 100, 150, 30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Bouton cliqué !");
            }
        });

        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }
}
