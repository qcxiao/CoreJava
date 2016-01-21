package com.yaodao.reflection.GetClassMessage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 获取类中成员变量、方法等的信息
 * @author qcxiao
 *
 */
public class ClassUtil {
	/**
	 * 打印类信息，以及公共方法信息
	 */
	@SuppressWarnings("rawtypes")
	public static void printMethodMessage(Object obj){
		// 获取类类型
		Class c = obj.getClass();// 传递该子类的对象，c就是该子类的类类型
		// 获取类全称
		System.out.println("类全称为： " + c.getName());
		// 获取类名
		System.out.println("类名为：" + c.getSimpleName());
		/*
		 * Method类是方法对象,一个成员方法就是一个Method对象
		 * getMethods()获取的是所有的public的方法，以及从父类继承而来的方法
		 * getDeclaredMethods()获取所有该类自己声明的方法，与访问权限无关
		 */
		Method[] ms= c.getMethods();
		for (Method method : ms) {
			// 获取方法的返回值类型
			Class returnType = method.getReturnType();//getReturnType()返回的是返回值的类类型
			System.out.print(returnType.getName() + " ");
			// 获取方法名
			System.out.print(method.getName() + "(");
			// 获取参数类型,得到的是参数列表的类型的类类型
			Class[] paramType = method.getParameterTypes();
			for (Class class1 : paramType) {
				System.out.print(class1.getName() + ",");
			}
			System.out.println(")");
		}
	}
	/**
	 * 打印类信息，以及成员变量信息
	 * @param obj
	 */
	@SuppressWarnings("rawtypes")
	public static void printFieldMessage(Object obj){
		/*
		 * 成员变量也是对象
		 * java.lang.reflect.Field
		 * Field封装了关于成员变量的操作
		 */
		Class c = obj.getClass();
		Field[] fs = c.getFields();
		for (Field f : fs) {
			// 得到成员变量类型的类类型
			Class fieldType = f.getType();
			String typeName = fieldType.getName();
			// 得到成员变量名称
			String fieldName = f.getName();
			System.out.println(typeName + " " + fieldName);
		}
	}
	/**
	 * 打印构造函数的信息
	 * @param obj
	 */
	@SuppressWarnings("rawtypes")
	public static void printConMessage(Object obj){
		Class c = obj.getClass();
		/*
		 * 构造函数也是对象
		 * java.lang.reflect.Constructor
		 */
		Constructor[] cs = c.getDeclaredConstructors();
		for (Constructor constructor : cs) {
			System.out.print(constructor.getName() + "(");
			// 获取构造函数的参数列表
			Class[] paramTypes = constructor.getParameterTypes();
			for (Class class1 : paramTypes) {
				System.out.print(class1.getName() + ",");
			}
			System.out.println(")");
		}
	}
}
