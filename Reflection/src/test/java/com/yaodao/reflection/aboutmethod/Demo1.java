package com.yaodao.reflection.aboutmethod;

import java.lang.reflect.Method;

/**
 * 方法对象进行反射操作
 * @author qcxiao
 *
 */
public class Demo1 {
	@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
	public static void main(String[] args) {
		/*
		 *  获取print(int , int)方法
		 */
		// 获取类类型
		A a = new A();
		Class c = a.getClass();
		// 获取方法
		try {
			Method m = c.getMethod("print", new Class[]{int.class,int.class});
			// 方法的反射操作
			// a.print(1,2);方法的反射操作是用m对象来进行方法调用，与a.print调用的效果完全相同
			// m.invoke(a, new Integer[]{1,2})与a.print(1,2)是一样的；前者是通过反射用方法的类类型调用对象，后者使用对象调用方法
			// 方法如果没有返回值返回null,如果有则返回具体的返回值
			Object o = m.invoke(a, new Integer[]{1,2});
			// 获取print(String , String)
			Method m1 = c.getMethod("print", String.class, String.class);
			// a.print("h","ello")
			Object o1 = m1.invoke(a, "h", "ello");
			
			
			Method m2 = c.getMethod("print");
			Object o2 = m2.invoke(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
class A{
	public void print(){
		System.out.println("hello");
	}
	public void print(int a, int b){
		System.out.println(a + b);
	}
	public void print(String a, String b){
		System.out.println(a.toUpperCase() + b.toLowerCase());
	}
}
