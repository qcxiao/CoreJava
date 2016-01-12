package com.yaodao.reflection.aboutclass;

/**
 * Class类的使用
 * @author qcxiao
 *
 */
public class Demo1 {
	public static void main(String[] args) {
		// foo1表示Foo的实例对象
		Foo foo1 = new Foo();
		/**
		 * Foo这个类也是实例对象，Class类的实例对象，如何表示呢？
		 * 任何一个类都是Class类的实例对象，三种方式表示Class类的实例对象
		 */
		// 1. 任何一个类都有一个隐含的静态成员变量class
		Class c1 = Foo.class;
		// 2. 已经知道该类的对象通过getClass()方法表示Class类的实例对象
		Class c2 = foo1.getClass();
		// 3. 通过该类的全称的方法表示Class类的实例对象
		Class c3 = null;
		try {
			c3 = Class.forName("Reflection.Foo");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 不管c1、c2、c3都代表了Foo类的类类型（Class type），一个类只能是Class类的一个实例对象，因此下面的都相等
		System.out.println(c1 == c2);
		System.out.println(c2 == c3);
		
		/*
		 * 同时可以使用该类的类类型创建该类的对象实例,通过c1 or c2 or c3创建Foo的实例
		 */
		Foo foo2 = null;
		try {
			foo2 = (Foo)c1.newInstance();//需要有无参的构建方法
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		foo2.print();
	}
}

class Foo{
	void print(){
		System.out.println("Foo");
	}
}
