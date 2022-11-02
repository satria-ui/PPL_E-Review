import entities.ArticleReviewAssignment;
import entities.ArticleReviewAssignmentData;
import entities.Order;
import entities.ProofOfPayment;

public class Ereview {
    Order order = new Order();
    ProofOfPayment payment = new ProofOfPayment();
    ArticleReviewAssignmentData article_data = new ArticleReviewAssignmentData();
    ArticleReviewAssignment article_review = new ArticleReviewAssignment();

    public void setRating(int rate){
        order.setRating(rate);
    }
    public int getRating(){
        return order.getRating();
    }
    public void setPayment(int money){
        payment.setBill(money);
    }
    public int getPayment(){
        return payment.getBill();
    }
    public void setArticlePath(String path){
        article_data.setArticlePath(path);
    }
    public String getArticlePath(){
        return article_data.getArticlePath();
    }
    public void setArticleReviewer(String rev){
        article_data.setReviewer(rev);
    }
    public String getArticleReviewer(){
        return article_data.getReviewer();
    }
    public void setDescription(String desc){
        article_review.setDescription(desc);
    }
    public String getDescription(){
        return article_review.getDescription();
    }
    public void setReviewer(String rev){
        article_review.setReviewer(rev);
    }
    public String getReviewer(){
        return article_review.getReviewer();
    }
}
