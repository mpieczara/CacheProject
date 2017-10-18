package cacheproject;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		CacheManager cache = new CacheManager();
		HashMap<CacheItem, String> map = new HashMap<>();
		CacheItem a = new ItemA();
		a.getKey();
		map.put(a, "A");
		cache.cache.add(map);

		System.out.println(cache.getItem(0));

		System.out.println(cache.getView());




	}

}
