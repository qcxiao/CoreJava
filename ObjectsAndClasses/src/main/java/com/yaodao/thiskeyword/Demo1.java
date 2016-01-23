package com.yaodao.thiskeyword;

/**
 * this关键字的使用
 * 1. 当成员变量和局部变量重名时，在方法中使用this时，表示的是该方法所在类中的成员变量。（this是当前对象自己）; Demo2中的例子
 * 2. 把自己当作参数传递时，也可以用this.(this作当前参数进行传递); Demo3与Demo4中的例子
 * 3. 有时候，我们会用到一些内部类和匿名类，如事件处理。当在匿名类中用this时，这个this则指的是匿名类或内部类本身。这时如果我们要使用外部类的方法和变量的话，则应该加上外部类的类名; Demo5中的例子
 * 4. 在构造函数中，通过this可以调用同一类中别的构造函数; Demo6中的例子
 * 5. this同时传递多个参数；Demo7中的例子
 * 
 * 
 * 以下Demo1引用Thing in Java中的一个例子来调用构建方法
 * @author qcxiao
 *
 */
public class Demo1 {
	int num;
	Demo1 Demo1(){
		num++;
		return this;
	}
	private void print(){
		System.out.println("num: " + num);
	}
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.Demo1().Demo1().Demo1().print();
	}
}

class Demo2{
	String value = "hei";
	public Demo2(String value){
		System.out.println("局部变量：" + value);
		System.out.println("成员变量：" + this.value);
		this.value = value;
		System.out.println("局部变量赋值给成员变量.");
		System.out.println("成员变量：" + this.value);
	}
	public static void main(String[] args) {
		Demo2 d = new Demo2("hello");
		System.out.println("成员变量：" + d.value);
	}
}
class Demo3 {
    public Demo3() {
    	//此处使用this关键字表示传递Demo3的引用
       new Demo4(this).print();// 调用B的方法
       System.out.println("Demo3的构造方法");
    }
    public void print() {
       System.out.println("HelloAA from A!");
    }
}
class Demo4 {
	public Demo4(Demo3 d){
		System.out.println("Demo4的构造方法");
	}
	public void print(){
		System.out.println("Demo4的print()方法");
	}
	public static void main(String[] args) {
		Demo3 d = new Demo3();
	}
}
class Demo5{
	public void run(){
		System.out.println("Demo5的run()方法");
	}
	public Demo5(){
		Thread thread = new Thread(){
			public void run(){
				for(int i = 0; i < 5; i++){
					Demo5.this.run();//调用外部类的方法
					try{
						sleep(2000);
					}catch(Exception e){
						
					}
				}
			}
		};
		thread.start();
	}
	public static void main(String[] args) {
		Demo5 d = new Demo5();
	}
}

/**
 * 1：在构造函数调用另一个构造函数，调用动作必须置于最起始的位置。 
 * 2：不能在构造函数以外的任何函数内调用构造函数。 
 * 3：在一个构造函数内只能调用一个构造函数。
 * @author qcxiao
 *
 */
class Demo6 {
    private int age;
    private String str;
 
    Demo6(String str) {
       this.str=str;
       System.out.println(str);
    }
    Demo6(String str,int age) {
       this(str);
       this.age=age;
       System.out.println(age);
    }
    public void print(){
    	//this(str);
    }
 
    public static void main(String[] args) {
    	Demo6 thistest = new Demo6("this测试成功",25);
      
    }
}

class Demo7 {
    int x;
    int y;
 
    static void showtest(Demo7 tc) {//实例化对象
       System.out.println(tc.x + " " + tc.y);
    }
    void seeit() {
       showtest(this);
    }
 
    public static void main(String[] args) {
    	Demo7 p = new Demo7();
    	p.x = 9;
    	p.y = 10;
    	p.seeit();
    }
}
