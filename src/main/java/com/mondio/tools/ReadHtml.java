package com.mondio.tools;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.xiaoleilu.hutool.io.file.FileReader;

public class ReadHtml {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("");
		FileReader fileReader = new FileReader("C:/Users/aiports-hezhe/Desktop/101_new.txt","GBK");
		Document doc = Jsoup.parse(fileReader.readString());
		Elements trs =doc.getElementsByTag("tr");
		for (Element tr : trs) {
			sb.append("{");
			String id = tr.attr("id");
			sb.append("\"id\":\""+id+"\",");
			Elements tds = tr.getElementsByTag("td");
			sb.append("\"latitude\":\""+tds.get(0).text()+"\",");
			sb.append("\"longitude\":\""+tds.get(1).text()+"\",");
			sb.append("\"medianame\":\""+tds.get(3).text()+"\",");
			sb.append("\"companyname\":\""+tds.get(4).text()+"\",");
			sb.append("\"telnum\":\""+tds.get(5).text()+"\",");
			sb.append("\"addr\":\""+tds.get(6).text()+"\",");
			sb.append("\"salary\":\""+tds.get(7).text()+"\",");
			sb.append("\"employmenttype\":\""+tds.get(8).text()+"\",");
			sb.append("\"tantousya\":\""+tds.get(9).text()+"\",");
			sb.append("\"table\":\"0\"");
//			for (Element element : tds) {
//				System.out.print(element.text()+"\t");
//			}
			sb.append("},");
//			System.out.println();
		}
//		sb.append("]");
		System.out.println(sb.toString());
	}
}
