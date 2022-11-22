import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

public class Form implements ActionListener{
    final JFrame frame = new JFrame();
    final JButton submit = new JButton("Submit");
    final JButton cancel = new JButton("Cancel");
    final JButton openFile = new JButton("Open File");
    final JTextField path = new JTextField();
    final Ereview ereview = new Ereview();

    public Form(){
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

//        JTextField path = new JTextField("default alskbdlaknsd asndlkansdl");
//        path.setEditable(false);
        path.setPreferredSize(new Dimension(250,30));
        submit.addActionListener(this);
        cancel.addActionListener(this);
        openFile.addActionListener(this);
//        JButton cancel = new JButton("Cancel");

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(title, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(path, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
//        gbc.insets = new Insets(5,150,0,0);
        panel.add(openFile, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = new Insets(5,0,0,120);
        panel.add(submit, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = new Insets(5,120,0,0);
        panel.add(cancel, gbc);

        frame.add(panel);

    }
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == openFile){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("C://Users//satri//Downloads"));
            int response = fileChooser.showOpenDialog(null);

            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                String pathName = String.valueOf(file);
                path.setText(pathName);
                path.setEditable(false);
            }
        }
        else if (actionEvent.getSource() == submit) {
//            System.out.println(path.getText());
            ereview.setArticlePath(path.getText());

            path.setEditable(true);
            path.setText("");
            System.out.println(ereview.getArticlePath());
        }
        else if(actionEvent.getSource() == cancel){
            frame.dispose();
            Menu menu = new Menu();
        }
    }
}
