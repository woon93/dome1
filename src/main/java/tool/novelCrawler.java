package tool;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

public class novelCrawler {
    public static void main( String[] args ) throws IOException, InterruptedException {
        // 本地存放路径
        String localUrl = "E:\\小说\\";

        // 小说名
        String noverlName = "柳心眉慕容逸飞";

        // 章节目录URL
        String chapterUrlList = "https://www.biqugeso.com/book/13622/";

        // 章节列表所在元素ID
        String chaptersId = "list-chapterAll";

        // 文本所在元素ID
        String contextId = "htmlContent";

        Document doc = Jsoup.connect(chapterUrlList).get();
        // 读取章节列表所在元素内所有链接
        Elements chapters = doc.select("div#" + chaptersId).select("a[href]");
        StringBuffer content = new StringBuffer();
        // 小说标题
        content.append(noverlName + "\n");
        // 节选章节（左开右闭）
        List<Element> subElements= chapters.subList(3,6);

        for (Element chapter : subElements) {
            // 章目标题
            content.append( "\n\n\n" + chapter.text() + "\n");
            // 暂停进程（毫秒）
            Thread.sleep(30);
            String txt = "";
            // String txtTrimNbsp = "";
            try{
                Document section = Jsoup.connect(chapterUrlList + chapter.attr("href")).get();
                Elements element = section.select("div#" + contextId);

                // 替换掉网页原文里的【&nbsp;】
                // txtTrimNbsp = element.text().replace(Jsoup.parse("&nbsp;").text(), "");

                txt = element.text();
                // 除去jsoup解析【&nbsp;】得到的ASCII值是160的空格
                txt = txt.replace("\u00A0\u00A0\u00A0\u00A0","\n    ");

            } catch (SocketTimeoutException e){
                System.err.println(chapter.text() + "读入失败！！！   " + e.getMessage());
                continue;
            } catch (HttpStatusException e){
                System.err.println(chapter.text() + "读入失败！！！--->" + e.getStatusCode());
                break;
            }
            content.append(txt);
        }

        // 1：利用File类找到要操作的对象
        File file = new File(localUrl +noverlName +".txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }

        //2：准备输出流
        Writer out = new FileWriter(file);
        out.write(content.toString());
        out.close();

    }

}
