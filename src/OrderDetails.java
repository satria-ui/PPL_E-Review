import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class OrderDetails implements ActionListener {
    final JFrame frame = new JFrame();
    final JButton done = new JButton("Done");

    public OrderDetails(){
        frame.setTitle("E-Review");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        ArrayList<String> name = ArticleReview.e.getReviewer();
        ArrayList<String> deskripsi = ArticleReview.e.getDescription();
        ArrayList<String> article = ArticleReview.e.getArticlePath();

        String[][] value = new String[100][100];

        if (article.isEmpty()){
            value = new String[0][0];
        }
        else{
            for(int i=0; i<article.size(); i++){ //length array
                for(int j=0; j<3; j++){
                    if(j == 0){
                        value[i][j] = name.get(i);
                    }
                    else if(j == 1){
                        value[i][j] = article.get(i);
                    }
                    else {
                        value[i][j] = deskripsi.get(i);

                    }
                }
            }
        }

        String[] columnNames = {"Reviewer", "Article", "Description"};

        JTable table = new JTable(value,columnNames);
        // center cell
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        table.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        // resize col
        TableColumnModel commode = table.getColumnModel();
        TableColumn path = commode.getColumn(1);
        TableColumn desc = commode.getColumn(2);
        table.setRowHeight(30);
        path.setPreferredWidth(250);
        desc.setPreferredWidth(250);

        JLabel title = new JLabel("Submission History", SwingConstants.CENTER);
        title.setBorder(BorderFactory.createEmptyBorder(100,0,0,0));
        title.setFont(new Font(null, Font.BOLD, 13));

        done.setPreferredSize(new Dimension(80,30));
        done.addActionListener(this);

        frame.setLayout(new GridLayout(3,1));
        JPanel panelButton = new JPanel();

        frame.add(title);
        frame.add(new JScrollPane(table));
        frame.add(panelButton);

        panelButton.add(done);

        frame.validate();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == done){
            frame.dispose();
            new Menu();
        }
    }
}
