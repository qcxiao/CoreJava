package com.yaodao.reflection.DynamicLoading;

/**
 * 动态加载
 * 
 * 功能性的类都尽量使用动态加载
 * 
 * 此事例使用静态加载的方法
 * 编译时刻加载，会出现以下的一些问题；可以转到OfficeBuffer.java观察在运行时刻加载的动态加载
 * @author qcxiao
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		// new创建对象是静态加载，在编译时刻就需要加载所有的可能使用的类
		// 如果Word有问题的时候，Excel也是不能用的功能类
		if("Word".equals(args[0])){
			Word w = new Word();
			w.start();
		}
		if("Excel".equals(args[0])){
			Excel e = new Excel();
			e.start();
		}
	}
}
