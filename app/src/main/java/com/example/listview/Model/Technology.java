package com.example.listview.Model;

public class Technology {
    private int rsImg;
    private String title, sub, content;
    public Technology() {
    }
    public Technology(int rsImg, String title, String sub, String content) {
        this.rsImg = rsImg;
        this.title = title;
        this.sub = sub;
        this.content = content;
    }

    public void setRsImg(int rsImg) {
        this.rsImg = rsImg;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRsImg() {
        return rsImg;
    }

    public String getTitle() {
        return title;
    }

    public String getSub() {
        return sub;
    }

    public String getContent() {
        return content;
    }
}
