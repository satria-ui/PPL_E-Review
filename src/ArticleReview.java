import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class ArticleReview implements ActionListener {
    ArrayList<String> files = FormDescription.data;
    String[] li = files.toArray(new String[0]);
    private final JFrame frame = new JFrame();
    private final JComboBox comboBox;
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

        comboBox = new JComboBox(li);
        comboBox.addActionListener(this);
        submit.addActionListener(this);
        back.addActionListener(this);
        reviewerName.setPreferredSize(new Dimension(200,25));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(260,175));
//        panel.setBackground(Color.lightGray);
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
//        panel2.setPreferredSize(new Dimension(395,250));
        panel2.setPreferredSize(new Dimension(430,250));
//        panel2.setBackground(Color.GRAY);
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel2.add(description);
        panel2.add(back);
        panel2.add(submit);

        frame.add(panel);
        frame.add(panel2);
//        frame.add(description);
    }

    private String[] removeTheElement(String[] arr, int index){
        if (arr == null || index < 0 || index >= arr.length)
        {
            return arr;
        }
        // Create another array of size one less
        String[] anotherArray = new String[arr.length - 1];

        for(int i = 0, k = 0; i<arr.length;i++){
            if(i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == submit){

            e.setReviewer(reviewerName.getText());
            e.setDescription(description.getText());

            String item = (String) comboBox.getSelectedItem();
            e.setArticlePath(item);

//            String[] updateRow = removeTheElement(li, item);


//            files = new ArrayList<String>(Arrays.asList(updateRow));
//            FormDescription.data =
//            li = updateRow;
//            System.out.println(li);
//            for(int i = 0; i<updateRow.length; i++){
//                System.out.println(updateRow[i]);
//            }
            frame.dispose();
            new ArticleReview();
        }
        else if(actionEvent.getSource() == back){
            frame.dispose();
            new Menu();
        }
    }
}
