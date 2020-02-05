package com.example.middaymeal;

public class List {

    private  String head  ;
    private String desc;
    private List list;

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;
    private int imgId;

    public List(String head, String desc, int imgid) {
        this.head = head;
        this.desc = desc;
        this.imgId = imgid;
    }

    public String getDesc() {
        return desc;
    }

    public String getHead() {
        return head;
    }

    public int size() {
         return size();
    }


    public String getDescription() {
         return  description;
    }

    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public List get(int position) {
        return list;
    }
}
