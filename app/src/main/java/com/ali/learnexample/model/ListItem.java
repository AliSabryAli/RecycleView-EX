package com.ali.learnexample.model;

public class ListItem {
    private String title;
    private String desc;
    private String txt;

    public ListItem() {
    }

    public ListItem(String title, String desc, String txt) {
        this.title = title;
        this.desc = desc;
        this.txt = txt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
