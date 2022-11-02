public class DialogBox {
    private boolean confirmationMessage = true;
    private boolean completenessMessage = true;

    public void article_confirmation_message(){
        if(confirmationMessage) {
            System.out.println("article confirmed");
        }
    }
    public void completeness_confirmation_message(){
        if(completenessMessage){
            System.out.println("completeness confirmed");
        }
    }

}
