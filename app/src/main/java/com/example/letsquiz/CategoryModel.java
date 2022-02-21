package com.example.letsquiz;

public class CategoryModel {
    private String docID;
    private String name;
    private int no0fTests;

    public CategoryModel(String docID, String name, int no0fTests){
        this.docID = docID;
        this.name= name;
        this.no0fTests = no0fTests;
    }

    public String getDocID() {
        return docID;
    }

    public void setDocID(String docID) {
        this.docID = docID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo0fTests() {
        return no0fTests;
    }

    public void setNo0fTests(int no0fTests) {
        this.no0fTests = no0fTests;
    }
}
