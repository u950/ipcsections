package com.example.ipcapp;



import java.util.List;

public class DataModel {

    private List<String> nestedList;
    private String itemText;
    private String detailedDescription;
    private boolean isExpandable;

    public DataModel(List<String> nestedList, String itemText) {
        this.nestedList = nestedList;
        this.itemText = itemText;
        this.detailedDescription = detailedDescription;
        isExpandable = false;
    }

    public void setExpandable(boolean expandable) {
        isExpandable = expandable;
    }

    public List<String> getNestedList() {
        return nestedList;
    }

    public String getItemText() {
        return itemText;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public boolean isExpandable() {
        return isExpandable;
    }
}
