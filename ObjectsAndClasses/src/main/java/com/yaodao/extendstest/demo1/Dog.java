package com.yaodao.extendstest.demo1;

public class Dog extends Animal {
	private int age;
	// 重写父类的方法时，访问控制符、返回值类型、方法名、参数列表必须相同
	@Override
	public void eat(){
		System.out.println("狗吃骨头");
	}
	// 初始化子类时会先初始化父类，原因就是此处会隐式的调用了super();
	public Dog(){
		//super();//如要使用必须在此构造方法的第一行
		System.out.println("Dog类.");
	}
	public void method(){
		// 使用super关键字调用父类的方法
		super.eat();
	}
	// 重写Object中的equals方法时必须至少有一个类属性
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		return true;
	}
	
}
