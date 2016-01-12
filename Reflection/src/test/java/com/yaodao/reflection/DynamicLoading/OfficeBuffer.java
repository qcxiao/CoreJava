package com.yaodao.reflection.DynamicLoading;

/**
 * 1. 使用动态加载的方式去调用相应的方法
 * 2. 可以避免因为一个功能类的不能使用，而导致其它所有的功能均不使用
 * 3. 使用javac x.java / java x的方式运行各个类；在调试时，将Reflection.DynamicLoading包下类的package全部去掉；
 * 4. 调试的时候，可以故意使Word类有问题，观察OfficeBuffer类是否能够正常调用Excel类中的start()方法
 * @author qcxiao
 *
 */
public class OfficeBuffer {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		try {
			// 得到args[0]类类型
			Class c = Class.forName(args[0]);
			// 使用类类型创建args[0]的实例
			OfficeAble oa = (OfficeAble)c.newInstance();
			oa.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
