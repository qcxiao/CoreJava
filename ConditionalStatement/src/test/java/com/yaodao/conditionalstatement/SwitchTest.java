package com.yaodao.conditionalstatement;

import org.junit.Test;

/**
 * 测试Switch语句
 * 
 * @author yaodao
 *
 */
public class SwitchTest {
	/*
	 * 如果没有遇见 break 会继续执行下一个的 case 块的内容，直到遇到 break 语句或者 switch 语句块结束; 
	 * 因此以下的case块中的内容均会执行。
	 */
	@Test
	public void test() {
		int num = 1;
		switch (num) {
		case 1:
			System.out.println("num==1");
		case 2:
			System.out.println("num==2");
		case 3:
			System.out.println("num==3");
		default:
			System.out.println("num==null");
		}
	}
	public static void main(String[] args) {
		char today='日';
		switch(today){
    	 case '一':
         case '三':
         case '五':
             System.out.println("吃饺子");
             break;
         case '二':
         case '四':
         case '六':
             System.out.println("吃油条");
             break;
         case '日':
             System.out.println("吃主席套餐");
             break;
		}
        
    }
}
