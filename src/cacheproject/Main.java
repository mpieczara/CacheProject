package cacheproject;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		CacheManager cache = new CacheManager();
		HashMap<CacheItem, String> map = new HashMap<>();
		CacheItem a = new ItemA();
		a.getKey();
		map.put(a, "A");

		Map<String, String> singleMap = new HashMap<>();
		singleMap.put("A", "B");
		System.out.println(singleMap.keySet());



	}

}
