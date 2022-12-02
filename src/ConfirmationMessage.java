import javax.swing.*;

public class ConfirmationMessage {
    public ConfirmationMessage(){
        int response =
        JOptionPane.showOptionDialog(
                null,
                "Are you sure?",
                "Confirmation Message",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null, null, 0);

        if(response == 0)
        {
            Form.frame.dispose();
            new FormDescription();
        }
        else if (response == 1 || response == -1)
        {
            JOptionPane.getRootFrame().dispose();
        }
    }
}
