import javax.swing.*;

public class ConfirmationMessage {
    //true 0
    //false 1/-1

    public ConfirmationMessage(){
        int response =
        JOptionPane.showOptionDialog(
                null,
                "Are you sure?",
                "Confirmation Message",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null, null, 0);

        if(response == 0){
            Form.frame.dispose();
            FormDescription formDescription = new FormDescription();
        } else if (response == 1 || response == -1) {
            JOptionPane.getRootFrame().dispose();
        }
    }
}
