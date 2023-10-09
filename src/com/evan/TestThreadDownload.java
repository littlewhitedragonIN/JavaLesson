package com.evan;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TestThreadDownload extends Thread{
    private String url;
    private String fileName;

    public TestThreadDownload(String url, String fileName){
      this.url = url;
      this.fileName = fileName;
    }


    @Override
    public void run() {
      Downloader downloader = new Downloader();
      downloader.download(url, fileName);
    }

    public static void main(String[] args) {
        // for loop create new thread
        TestThreadDownload t1 = new TestThreadDownload();

    }
}


class Downloader{
    public void download(String url, String fileName){
        try {
            // todo File对象 URL
            FileUtils.copyURLToFile(new URL(url), new File(fileName));
        } catch (IOException e) {
            System.out.println("Downloader failed");
        }
    }
}
