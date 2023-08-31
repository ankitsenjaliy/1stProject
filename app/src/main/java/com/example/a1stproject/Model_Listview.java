package com.example.a1stproject;

public class Model_Listview {

    int img;
    String name;
    String dateofbirth;
    String time;
    String call;

    public Model_Listview(int img, String name, String dateofbirth, String time, String call) {
        this.img = img;
        this.name = name;
        this.dateofbirth = dateofbirth;
        this.time = time;
        this.call = call;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPhone_no() {
        return call;
    }

    public void setPhone_no(String phone_no) {
        this.call = call;
    }
}
