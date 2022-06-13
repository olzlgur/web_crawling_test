package example.webcrwaling.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Iterator;

public class CrawlingService {

    public static void getinfo() {
        String url = "https://computer.knu.ac.kr/06_sub/02_sub.html";
        Document doc = null;

        try {
            doc = (Document) Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Elements title = doc.getElementsByClass("detail-name"); // 첫 번째 h3태그의 text값 찾기

        System.out.println(title);


    }
}
