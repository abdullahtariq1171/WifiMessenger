package com.example.abdullah.wifimessenger;

/**
 * Created by abdullah on 3/10/2016.
 */

public class Contact
{
    String name;
    String no;
    int imgid;

    public String getName() {
        return name;
    }

    public String getNo() {
        return no;
    }

    public int getImgid() {
        return imgid;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public Contact(String name, String no, int imgid) {
        this.name = name;
        this.no = no;
        this.imgid = imgid;
    }
}
