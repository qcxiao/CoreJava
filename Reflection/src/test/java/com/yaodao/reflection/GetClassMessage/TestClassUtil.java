package com.yaodao.reflection.GetClassMessage;

/**
 * 测试ClassUtil类中类信息
 * @author qcxiao
 *
 */
public class TestClassUtil {
	public static void main(String[] args) {
		ClassUtil.printMethodMessage(1);
		System.out.println("========================");
		ClassUtil.printFieldMessage('c');
		System.out.println("========================");
		ClassUtil.printConMessage("");
	}
}
