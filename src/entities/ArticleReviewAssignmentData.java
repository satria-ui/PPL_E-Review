package entities;

import java.util.ArrayList;

public class ArticleReviewAssignmentData {
//    private String article;

    final ArrayList<String> article = new ArrayList<String>();

    public void setArticlePath(String path){
        article.add(path);
    }
    public ArrayList<String> getArticlePath(){
        return article;
    }
}
