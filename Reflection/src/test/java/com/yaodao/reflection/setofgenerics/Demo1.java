package com.yaodao.reflection.setofgenerics;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 这一节是通过反射去了解集合泛型的本质
 * @author qcxiao
 *
 */
public class Demo1 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("hello");
		//list2.add(20);编译报错
		Class c1 = list1.getClass();
		Class c2 = list2.getClass();
		System.out.println(c1 == c2);
		/*
		 * c1 == c2结果返回true,说明编译之后集合的泛型是去泛型的
		 * Java中集合的泛型,是防止错误输入的,只在编译阶段有效,绕过编译就无效了
		 * 验证：通过方法的反射来操作,绕过编译
		 */
		try {
			Method m = c2.getMethod("add",Object.class);
			m.invoke(list2, 10);
			// 打印出list2.size()为2,表示10被加到list2集合中了
			System.out.println("list2.size()：" + list2.size());
			// 当然不能用以下方式打印出集合信息了
			//for(String s : list2){
				//System.out.println(s);
			//}
			
			for(Object s : list2){
				System.out.println(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
