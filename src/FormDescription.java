import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class FormDescription implements ActionListener {
    final JFrame frame = new JFrame();
    final JButton pay = new JButton("Pay");
    final Random r = new Random();
    public static ArrayList<String> data = new ArrayList<>();
    public FormDescription(){
        frame.setTitle("E-Review");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        data = Form.ereview.getArticlePath();
        String[][] val = new String[50][50];

        for(int i=0; i<data.size()+1; i++){
            for(int j=0; j<3; j++){
                if(i == data.size()){
                    if (j == 0) {
                        val[i][j] = "";
                    }
                    else if(j == 1){
                        val[i][j] = "Total";
                    }
                    else{
                        val[i][j] = String.valueOf(Form.ereview.getPayment());
                    }
                }
                else{
                    if (j == 0) {
                        val[i][j] = "P" + i;
                    }
                    else if(j == 1){
                        val[i][j] = data.get(i);
                    }
                    else{
                        val[i][j] = String.valueOf(Form.ereview.setPayment(1000+r.nextInt(10000)));
                    }
                }
            }
        }

        String[] columnNames = {"No", "Submission", "Price"};

        JTable table = new JTable(val,columnNames);
        // center cell
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        table.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        // resize col
        TableColumnModel colmod = table.getColumnModel();
        TableColumn no = colmod.getColumn(1);
        no.setPreferredWidth(480);

        JLabel title = new JLabel("Order Description", SwingConstants.CENTER);
        title.setPreferredSize(new Dimension(50,50));
        title.setFont(new Font(null, Font.BOLD, 15));

        pay.setPreferredSize(new Dimension(80,30));
        pay.addActionListener(this);

        BorderLayout layout = new BorderLayout(0,0);
        frame.setLayout(layout);
        JPanel panelButton = new JPanel();

        frame.add(title,BorderLayout.NORTH);
        frame.add(new JScrollPane(table), BorderLayout.CENTER);
        frame.add(panelButton, BorderLayout.EAST);

        panelButton.add(pay);

        frame.validate();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == pay){
            frame.dispose();
            new Menu();
        }
    }
}
