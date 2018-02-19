package fr.basire.todoliste;

/**
 * Created by basire1u on 12/02/18.
 */

public class TodoItem {

    public enum Tags {
        Faible, Normal, Important
    }

    private String label;
    private Tags tag;
    private Boolean realiser;


    public TodoItem(Tags tag, String label) {
        this.label = label;
        this.tag = tag;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Tags getTag() {
        return tag;
    }

    public void setTag(Tags tags) {
        this.tag = tags;
    }

    public Boolean getRealiser() {
        return realiser;
    }

    public void setRealiser(Boolean realiser) {
        this.realiser = realiser;
    }
}
