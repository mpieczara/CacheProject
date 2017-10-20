package com.cacheproject;

public class Main {

	public static void main(String[] args) {

		CacheManager cache = new CacheManager();

		ItemCreator itemA = new ItemCreator("A", "objectA");
		ItemCreator itemB = new ItemCreator("B", "objectB");
		ItemCreator itemC = new ItemCreator("C", "objectC");
		ItemCreator itemD = new ItemCreator("D", "objectD");

		CacheManager.CacheViewManager managerView = new CacheManager.CacheViewManager();

		cache.cacheItem(itemA, itemA.getKey());
		cache.cacheItem(itemB, itemB.getKey());
		cache.cacheItem(itemC, itemC.getKey());
		cache.cacheItem(itemD, itemD.getKey());

		managerView.getAllItems();

		System.out.println(cache.getView());
		System.out.println(managerView.size());
		cache.invalidateCache();
		System.out.println(managerView.size());
		System.out.println(cache.getView());

	}
}
