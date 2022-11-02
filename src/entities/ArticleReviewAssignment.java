package entities;

public class ArticleReviewAssignment {
    private String description;
    private String reviewer;

    public void setReviewer(String rev){
        reviewer = rev;
    }
    public String getReviewer(){
        return reviewer;
    }
    public void setDescription(String desc){
        description = desc;
    }
    public String getDescription(){
        return description;
    }
}
