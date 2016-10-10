package com.yaodao.junit;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class JunitTest {
	@Before
	public void ss1(){
		System.out.println(1);
	}
	@Before
	public void ss2(){
		System.out.println(2);
	}
	@Test
	public void test(){
		System.out.println("test");
	}
}
