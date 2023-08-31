package com.example.a1stproject;

public class Model_Gridview {

    int img;
    String name;
    String dateofbirth;

    public Model_Gridview(int img, String name, String dateofbirth) {
        this.img = img;
        this.name = name;
        this.dateofbirth = dateofbirth;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
}
