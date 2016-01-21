package com.yaodao.statictest;

/**
 * 
 * 1. 此类声明一个static的成员变量，并对其赋初值; 
 * 2. 而static修饰的成员变量，在此类被JVM加载时就会分配内存空间；
 * 3. 一旦对其赋值，将会影响到使用此变量的所有对象；即使用此变量的对象之间共享此值；
 * 4. 具体看Test1类与Test2的调用；
 * @author qcxiao
 *
 */
public class IncludeStatic {
	public static int i = 3;
	
	public void ss(){
		
	}
}
