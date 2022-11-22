import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderDetails implements ActionListener{
    final JFrame frame = new JFrame();
    final JButton done = new JButton("Done");
    public OrderDetails(){
        frame.setTitle("E-Review");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        String[][] data ={
                {"A0", "satria"},
                {"A1", "satria"},
                {"A2", "satria"},
                {"A3", "satria"},
                {"A4", "satria"},
                {"A5", "swe"},
                {"A6", "ssub"},
                {"A7", "adam"},
                {"A8", "damdim"},
        };
        String[] columnNames = {"No", "Article"};

        JTable table = new JTable(data,columnNames);
        // center cell
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        table.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        // resize col
        TableColumnModel colmod = table.getColumnModel();
        TableColumn no = colmod.getColumn(1);
        no.setPreferredWidth(480);

        JLabel title = new JLabel("Submission History");
        title.setBorder(BorderFactory.createEmptyBorder(100,180,0,0));
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
            Menu menu = new Menu();
        }
    }
}
