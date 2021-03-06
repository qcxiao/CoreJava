package com.yaodao.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeAndDeSerialize {
	public static void serializePersion() throws FileNotFoundException, IOException{
		Person p = new Person(29, "qcxiao");
		File file = new File("D:/serialize.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(p);
		oos.close();
		System.out.println("Person序列化成功.");
	}
	public static void deSerializePersion() throws FileNotFoundException, IOException, ClassNotFoundException{
		File file = new File("D://serialize.txt");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		Person p = (Person)ois.readObject();
		ois.close();
		System.out.println("Person反序列化成功.");
		System.out.println(p.toString());
	}
}
