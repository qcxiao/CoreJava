package com.yaodao.collectionandmap.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ArrayList是List的实现类，与HashSet不同，它允许存放重复元素，因此有序；
 * 
 * 
 * @author qcxiao
 * 
 */
public class ArrayListTest {
	public static void main(String[] args) {
		List<String> arrList = new ArrayList<String>();

		arrList.add("a");
		arrList.add("b");
		arrList.add("c");
		arrList.add("c");
		arrList.add("d");

		// 使用Iterator输出集合
		Iterator<String> iter = arrList.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		// 使用For Each输出结合
		for (String e : arrList) {
			System.out.print(e + " ");
		}
		System.out.println();

		// 使用toString输出集合
		System.out.println(arrList);
	}
}
