package com.yaodao.statictest;

public class Test2 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println("Test2:" + IncludeStatic.i);
		
		//一旦对其赋值，将会影响到使用此变量的对象，即会影响Test1中的i值
		IncludeStatic.i = 2;
		System.out.println("Test2:" + IncludeStatic.i);
		Test1 t11 = new Test1();
	}

}
