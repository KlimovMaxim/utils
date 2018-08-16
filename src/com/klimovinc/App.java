package com.klimovinc;

public class App {
    String appID;
    String name;
    String subject;
    String imgPatch;
    float rate;

    public App(String appID, String name, String subject, String imgPatch, float rate) {
        this.appID = appID;
        this.name = name;
        this.subject = subject;
        this.imgPatch = imgPatch;
        this.rate = rate;
    }

    public App(String appID) {
        this.appID = appID;
    }

    public App() {
    }


    public void setAppID(String appID) {
        this.appID = appID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setImgPatch(String imgPatch) {
        this.imgPatch = imgPatch;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getAppID() {
        return appID;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getImgPatch() {
        return imgPatch;
    }

    public float getRate() {
        return rate;
    }
}
