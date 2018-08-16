package com.klimovinc;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("START TEST.");
        ArrayList<App> appList = new GooglePlayParser("Klimov+Inc.").parse();
        System.out.println(appList.toString());
        System.out.println("END TEST.");
    }
}
