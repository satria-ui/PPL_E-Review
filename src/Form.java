import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Form implements ActionListener{
    public static JFrame frame = new JFrame();
    final JButton add = new JButton("Add");
    final JButton submit = new JButton("Submit");
    final JButton openFile = new JButton("Open File");
    final JButton back = new JButton("Back");
    final JTextField path = new JTextField();
    public static Ereview ereview = new Ereview();

    public Form(){
        frame.setTitle("E-Review");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,0,0,0);

        JLabel title = new JLabel("Enter Article File Path");
        title.setBounds(0,150,100,50);
        title.setFont(new Font(null, Font.BOLD, 13));

        path.setPreferredSize(new Dimension(250,30));
        add.addActionListener(this);
        submit.addActionListener(this);
        openFile.addActionListener(this);
        back.addActionListener(this);

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
        panel.add(add, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = new Insets(5,120,0,0);
        panel.add(submit, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.insets = new Insets(250,0,0,400);
        panel.add(back, gbc);



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
        else if (actionEvent.getSource() == add) {
            ereview.setArticlePath(path.getText());

            path.setEditable(true);
            path.setText("");
        }
        else if(actionEvent.getSource() == submit){
            new ConfirmationMessage();
        }
        else if(actionEvent.getSource() == back){
            frame.dispose();
            new Menu();
        }
    }
}
