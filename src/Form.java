import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Form {
    public Form(){
        JFrame frame = new JFrame();
        frame.setTitle("E-Review");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

//        JButton submit = new JButton("Submit");
//        submit.setBounds(0,0,50,30);
//        JButton cancel = new JButton("Cancel");
//        cancel.setBounds(0,50,50,30);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,0,5,0);

        JLabel title = new JLabel("Enter Article File Path");
        title.setBounds(0,150,100,50);
        title.setFont(new Font(null, Font.BOLD, 13));
        JTextField path = new JTextField(15);
        JButton submit = new JButton("Submit");
        JButton cancel = new JButton("Cancel");

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(title, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(path, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(5,0,0,120);
        panel.add(submit, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(5,120,0,0);
        panel.add(cancel, gbc);

        frame.add(panel);

    }
}
