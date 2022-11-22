import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.BorderFactory;

public class Menu implements ActionListener{
    final JFrame frame = new JFrame();
    final JButton button = new JButton("Create Article Review");
    final JButton button2 = new JButton("Show Order History");
    public Menu() {
        frame.setTitle("E-Review");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        button.setBounds(150,150,200,50);
        button.addActionListener(this);
        button2.setBounds(150,230,200,50);
        button2.addActionListener(this);

        frame.add(button);
        frame.add(button2);
        frame.setLayout(null);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == button){
            frame.dispose();
            Form form = new Form();
        }
        else if (actionEvent.getSource() == button2) {
            frame.dispose();
            OrderDetails history = new OrderDetails();
        }
    }
}
