import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Menu implements ActionListener{
    final JFrame frame = new JFrame();
    final JButton button = new JButton("Create Article Review");
    final JButton button2 = new JButton("Show Order History");
    final JButton button3 = new JButton("Review Article");
    public Menu() {
        frame.setTitle("E-Review");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        button.setBounds(150,120,200,50);
        button.addActionListener(this);
        button2.setBounds(150,200,200,50);
        button2.addActionListener(this);
        button3.setBounds(150,280,200,50);
        button3.addActionListener(this);

        frame.add(button);
        frame.add(button2);
        frame.add(button3);
        frame.setLayout(null);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == button){
            frame.dispose();
            new Form();
        }
        else if (actionEvent.getSource() == button2) {
            frame.dispose();
            new OrderDetails();
        }
        else if (actionEvent.getSource() == button3) {
            frame.dispose();
            new ArticleReview();
        }
    }
}
