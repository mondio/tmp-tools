package com.mondio.tools;

import java.util.Random;

import com.xiaoleilu.hutool.io.file.FileReader;

public class UpdateJson {
	public static void main(String[] args) {
		FileReader fileReader = new FileReader("C:/Users/aiports-hezhe/Desktop/mapdata.js");
		String str = fileReader.readString();
		String[] strArr = str.split("},");
		StringBuffer sb = new StringBuffer();
		for (String s : strArr) {
			s=s+",\"flag\":\""+(new Random().nextInt(3)+1)+"\"}";
			sb.append(s+",");
		}
		System.out.println(sb.toString());
	}
}
