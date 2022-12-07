import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ArticleReview implements ActionListener {
    ArrayList<String> files = FormDescription.data;
    String[] li = files.toArray(new String[0]);
    private final JFrame frame = new JFrame();
    private final JComboBox<String> comboBox;
    private final JTextArea description = new JTextArea(10,35);
    private final JButton submit = new JButton("Submit");
    private final JButton back = new JButton("Back");
    private final JTextField reviewerName = new JTextField();
    public static Ereview e = new Ereview();
    public ArticleReview(){
        frame.setTitle("E-Review");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 0));

        comboBox = new JComboBox<>(li);
        comboBox.addActionListener(this);
        submit.addActionListener(this);
        back.addActionListener(this);
        reviewerName.setPreferredSize(new Dimension(200,25));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(260,175));
        panel.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 15));

        JLabel l1 = new JLabel("Reviewer Name:");
        panel.add(l1);
        panel.add(reviewerName);
        JLabel l2 = new JLabel("Select Article:");
        panel.add(l2);
        panel.add(comboBox);
        panel.add(description);
        JLabel l3 = new JLabel("Description");
        l3.setForeground(Color.GRAY);
        panel.add(l3);

        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(430,250));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel2.add(description);
        panel2.add(back);
        panel2.add(submit);

        frame.add(panel);
        frame.add(panel2);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == submit){

            e.setReviewer(reviewerName.getText());
            e.setDescription(description.getText());

            String item = (String) comboBox.getSelectedItem();
            e.setArticlePath(item);

            frame.dispose();
            new ArticleReview();
        }
        else if(actionEvent.getSource() == back){
            frame.dispose();
            new Menu();
        }
    }
}
