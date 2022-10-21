package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

        while (true){
            Thread.sleep(100);
            Runtime.getRuntime().exec("C:/Program Files/Google/Chrome/Application/chrome.exe" + " spsmb.cz -incognito");
        }

    }
}
