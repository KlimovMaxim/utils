package com.klimovinc;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GooglePlayParser {
    private String developerID;
    //private String appID;

    public GooglePlayParser(String developerID) {
        this.developerID = developerID;
    }

    public List<App> parse(){
        Document doc = null;
        List<App> resultList = new ArrayList<App>();

        try {
            doc = Jsoup.connect("https://play.google.com/store/apps/developer?id=" + this.developerID).get();//"http://en.wikipedia.org/"
        }
        catch (IOException e) {
            e.printStackTrace();
        }

       // log(doc.title());
        Elements newsHeadlines = doc.select(".card-content");
        for (Element headline : newsHeadlines) {
            String appId =  headline.attr("data-docid");
            App nApp = new App(appId);
            nApp.setName(headline.select(".title").text());
            nApp.setSubject(headline.select(".description").text());
            nApp.setImgPatch(headline.select(".cover-image").attr("src"));
            String rateElem = headline.select(".current-rating").attr("style");

            if (!rateElem.isEmpty()) {
                Float rate = Float.parseFloat(rateElem.substring(rateElem.indexOf("width") + 7, rateElem.indexOf("%"))) * 5 / 100;
                nApp.setRate(rate);
            }
            System.out.println(appId);
            resultList.add(nApp);
        }

        return resultList;
    }

}
