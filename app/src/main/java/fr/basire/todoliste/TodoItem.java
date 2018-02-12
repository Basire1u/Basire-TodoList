package fr.basire.todoliste;

/**
 * Created by basire1u on 12/02/18.
 */

public class TodoItem {

    String label;
    String tag;
    Boolean realiser;


    public TodoItem(String label, String tag) {
        this.label = label;
        this.tag = tag;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Boolean getRealiser() {
        return realiser;
    }

    public void setRealiser(Boolean realiser) {
        this.realiser = realiser;
    }
}
