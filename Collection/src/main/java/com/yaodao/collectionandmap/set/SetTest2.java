package com.yaodao.collectionandmap.set;

import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetTest2 {
	public static void main(String[] args) {

		Set<String> words = new HashSet<String>();

		// 通过输入流代开文献
		// 方法1:这个方法不需要抛出异常
		InputStream inStream = SetTest2.class.getResourceAsStream("yaodao.txt");

		// 方法2：这个方法需要抛出异常
		// InputStream inStream = new FileInputStream("D:\\Documents\\workspace\\JAVAStudy\\src\\edu\\sjtu\\erplab\\collection\\Alice.txt");
		Scanner in = new Scanner(inStream);
		while (in.hasNext()) {
			words.add(in.next());
		}

		Iterator<String> iter = words.iterator();

		for (int i = 0; i <= words.size(); i++) {
			if (iter.hasNext())
				System.out.println(iter.next());
		}

		System.out.println(words.size());
	}
}