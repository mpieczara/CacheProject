package com.cacheproject;

public class Main {

	public static void main(String[] args) {

		CacheManager cache = new CacheManager();
		CacheManager.CacheViewManager cacheView = (CacheManager.CacheViewManager) cache.getView();
		ItemA objA = new ItemA("A", "itemA");
		ItemB objB = new ItemB("B", "itemB");
		ItemC objC = new ItemC("C", "itemC");
		ItemD objD = new ItemD("D", "itemD");


		System.out.println(cache.cacheItem(objA, objA.getKey()));
		System.out.println(cacheView.size());
		System.out.println(cacheView.getItem(0));
		cacheView.getAllItems();

//		cache.cacheItem(itemA.getValue(), itemA.getKey());
//		cache.cacheItem(itemB.getValue(), itemB.getKey());
//		cache.cacheItem(itemC.getValue(), itemC.getKey());
//		cache.cacheItem(itemD.getValue(), itemD.getKey());

//		System.out.println(cacheView.getItem(1));

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
