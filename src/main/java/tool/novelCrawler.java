package tool;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.SocketTimeoutException;

public class novelCrawler {
    public static void main( String[] args ) throws IOException, InterruptedException {
        Document doc = Jsoup.connect("https://www.dingdianxs.com/5/5188/").get();
        Elements chapters = doc.select("div#list").select("a[href]");
        StringBuffer content = new StringBuffer();
        // 小说标题
        content.append("摄政冷王悄医妃" + "\n");
        for (int i = 900 ; i <= chapters.size()-1; i++) {
//        for (Element chapter : chapters) {
            // 章目标题
            content.append( "\n\n\n" + chapters.get(i).text() + "\n");
//            Thread.sleep(300);
            String txt = "";
            try{
                Document section = Jsoup.connect("https://www.dingdianxs.com/5/5188/" + chapters.get(i).attr("href")).get();
                Elements element = section.select("div#content");
                txt = element.text();
                txt.replace("     ","\r\n");
            } catch (SocketTimeoutException e){
                System.err.println(chapters.get(i).text() + "读入失败！！！");
                continue;
            }
            content.append(txt);
        }

        // 1：利用File类找到要操作的对象
        File file = new File("E:\\小说\\摄政冷王悄医妃.txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }

        //2：准备输出流
        Writer out = new FileWriter(file);
        out.write(content.toString());
        out.close();

    }

}
