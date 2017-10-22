package com.cacheproject;

public class Main {

	public static void main(String[] args) {

		CacheManager cache = new CacheManager();
		CacheView cacheView = cache.getView();

		ItemCreator itemA = new ItemCreator("A", "objectA");
		ItemCreator itemB = new ItemCreator("B", "objectB");
		ItemCreator itemC = new ItemCreator("C", "objectC");
		ItemCreator itemD = new ItemCreator("D", "objectD");

		cache.cacheItem(itemA.getValue(), itemA.getKey());
		cache.cacheItem(itemB.getValue(), itemB.getKey());
		cache.cacheItem(itemC.getValue(), itemC.getKey());
		cache.cacheItem(itemD.getValue(), itemD.getKey());

		System.out.println(cacheView.getItem(1));

		//managerView.getAllItems();

		//System.out.println(cache.getView());
		//System.out.println(managerView.size());
		//cache.invalidateCache();
		//System.out.println(managerView.size());
//		System.out.println(cache.getView());
//		CacheView view = cache.getView();
//		view.size();
	}
}
