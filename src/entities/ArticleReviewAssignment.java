package entities;

import java.util.ArrayList;

public class ArticleReviewAssignment {
    final ArrayList<String> description = new ArrayList<String>();
//    private String description;
    final ArrayList<String> reviewer = new ArrayList<String>();

    public void setReviewer(String rev){
        reviewer.add(rev);
    }
    public ArrayList<String> getReviewer(){
        return reviewer;
    }
    public void setDescription(String desc){
        description.add(desc);
    }
    public ArrayList<String> getDescription(){
        return description;
    }
}
