package com.mondio.tools;

import java.text.MessageFormat;
import java.util.List;

import com.xiaoleilu.hutool.io.file.FileReader;

/**
 * Hello world!
 *
 */
public class FileRead {
	public static String createEmailAccount="curl -k -X POST --user me@pandawhv.com:123456789 -d \"email={0}@pandawhv.com\" -d \"password={1}\" https://mail.pandawhv.com/admin/mail/users/add";
	public static void main(String[] args) {
		FileReader fileReader = new FileReader("E:/nz.csv");
		List<String> result = fileReader.readLines();
		for (String string : result) {
			String[] str=string.split(",");
			String cmd=MessageFormat.format(createEmailAccount,str[0],str[1]);
			System.out.println(cmd);
		}
	}
}
