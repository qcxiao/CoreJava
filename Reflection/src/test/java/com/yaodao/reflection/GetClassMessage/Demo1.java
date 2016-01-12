package com.yaodao.reflection.GetClassMessage;

public class Demo1 {
	public static void main(String[] args) {
		/*
		 * 只要是在类里面的基本数据类型或者关键字都会有类类型，比如int,String,double,void；
		 * 而类以外的关键字则没有，比如package
		 */
		
		Class c1 = int.class;//int的类类型
		//String类的类类型
		//,,a.class,b.class,可以把String.class看成是String类的字节码
		Class c2 = String.class;
		//c3与c4是两个完全不一样的类类型
		Class c3 = double.class;//double数据类型的类类型字节码表示方法
		Class c4 = Double.class;//Double类的类类型字节码表示方法
		
		Class c5 = void.class;
		
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c2.getSimpleName());
		System.out.println(c3.getName());
		System.out.println(c4.getName());
		System.out.println(c5.getName());
	}
}
