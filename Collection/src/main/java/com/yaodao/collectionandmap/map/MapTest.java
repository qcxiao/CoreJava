package com.yaodao.collectionandmap.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "1");
		map.put("1", "2");
		Iterator<Entry<String, String>> i = map.entrySet().iterator();
		while(i.hasNext()){
			System.out.println(i.next().getValue());
		}
		System.out.println(map.get("1"));
		System.out.println(map.size());
	}
}
