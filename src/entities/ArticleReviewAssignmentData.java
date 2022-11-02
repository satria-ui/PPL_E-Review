package entities;

public class ArticleReviewAssignmentData {
    private String article;
    private String reviewer;

    public void setArticlePath(String path){
        article = path;
    }
    public String getArticlePath(){
        return article;
    }
    public void setReviewer(String rev){
        reviewer = rev;
    }
    public String getReviewer(){
        return reviewer;
    }
}
