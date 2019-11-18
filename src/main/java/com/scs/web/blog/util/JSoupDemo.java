package com.scs.web.blog.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoupDemo {
    public static void main(String[] args) throws Exception{
        //声明文档变量
        Document document;
        //通过Jsoup连接目标页面
        document = Jsoup.connect("https://www.jianshu.com/recommendations/users?utm_source=desktop&utm_medium=index-users").get();
        //选取所有class为col-xs-8的元素集合
        Elements divs = document.getElementsByClass("col-xs-8");
        //对divs遍历
         divs.forEach(div->{
             //取出class为wrap的节点
             Element wrapDiv = div.child(0);
             Element link = wrapDiv.child(0);
            Elements linkChildren = link.children();
             System.out.println("http:"+linkChildren.get(0).attr("src"));
             System.out.println(linkChildren.get(1).text());
             System.out.println(linkChildren.get(2).text());
         });
    }
}
