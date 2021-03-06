package com.yaodao.serialize;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class TestObjectSerializeAndDeSerialize {
	
	/** 
	 * @Title: testObjectSerialize 
	 * @Description: 序列化Person
	 * @param @throws FileNotFoundException
	 * @param @throws IOException    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	@Test
	public void testObjectSerialize() throws FileNotFoundException, IOException{
		SerializeAndDeSerialize.serializePersion();
	}
	
	/**
	 * @throws ClassNotFoundException  
	 * @Title: testObjectDeSerialize 
	 * @Description: 反序列化Person
	 * @param @throws FileNotFoundException
	 * @param @throws IOException    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	@Test
	public void testObjectDeSerialize() throws FileNotFoundException, IOException, ClassNotFoundException{
		SerializeAndDeSerialize.deSerializePersion();
	}
}
