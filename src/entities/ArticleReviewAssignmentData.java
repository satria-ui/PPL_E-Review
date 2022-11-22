package entities;

import java.util.ArrayList;

public class ArticleReviewAssignmentData {
//    private String article;

    private ArrayList<String> article = new ArrayList<String>();
    private String reviewer;

    public void setArticlePath(String path){
        article.add(path);
    }
    public ArrayList getArticlePath(){
        return article;
    }
    public void setReviewer(String rev){
        reviewer = rev;
    }
    public String getReviewer(){
        return reviewer;
    }
}
