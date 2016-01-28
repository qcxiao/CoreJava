package com.yaodao.collectionandmap.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import com.sun.corba.se.spi.transport.CorbaTransportManager;

/**
 * Set集合里的对象排列是无序的，并且不会有重复对象
 * Set集合中的对象读取只能通过foreach的方式和Iterator迭代器的方式，而不能获取到指定位置的对象，原因就是因为Set中的对象都是无序的；
 * 其实实现foreach就是因为这些集合接口都继承了Iterable接口，从jdk1.5开始
 * @author qcxiao
 *
 */
public class SetTest {
	public static void main(String[] args) {
		Set sets = new HashSet();
		Student s = new Student("s1",11);
		sets.add(s);
		sets.add(s);
		sets.add(new Student("s2",12));
		sets.add(new Student("s1",11));
		sets.add(new Student("s3",13));
		System.out.println("sets.size():" + sets.size());
		
		System.out.println("通过foreach实现。");
		for(Object set : sets){
			System.out.println(((Student)set).getName() + ":" + ((Student)set).getAge());
		}
		//Iterator迭代器接口只能与集合配套使用
		Iterator it = sets.iterator();
		System.out.println("通过Iterator迭代器实现。");
		while(it.hasNext()){
			Student set = (Student)it.next();
			System.out.println(set.getName() + ":" + set.getAge());
		}
	}
}
class Student{
	public Student(){}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}