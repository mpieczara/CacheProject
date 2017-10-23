package com.cacheproject.main;

import com.cacheproject.cache.CacheManager;
import com.cacheproject.items.ItemA;
import com.cacheproject.items.ItemB;
import com.cacheproject.items.ItemC;
import com.cacheproject.items.ItemD;

public class Main {

	public static void main(String[] args) {

		CacheManager cache = new CacheManager();
		CacheManager.CacheViewManager cacheView = (CacheManager.CacheViewManager) cache.getView();

		ItemA objA = new ItemA("A", "itemA");
		ItemB objB = new ItemB("B", "itemB");
		ItemC objC = new ItemC("C", "itemC");
		ItemD objD = new ItemD("D", "itemD");


		System.out.println(cache.cacheItem(objA, objA.getKey()));
		cacheView.getAllItems();
		System.out.println(cacheView.size());
		System.out.println(cache.cacheItem(objB, objB.getKey()));
		cacheView.getAllItems();
		System.out.println(cacheView.size());
		System.out.println(cache.cacheItem(objC, objC.getKey()));
		cacheView.getAllItems();
		System.out.println(cacheView.size());
		System.out.println(cache.cacheItem(objD, objD.getKey()));
		cacheView.getAllItems();
		System.out.println(cacheView.size());
		System.out.println(cacheView.getItem(2));
		System.out.println(cacheView.getItem(2));
		System.out.println(cacheView.getItem("B"));
		System.out.println(cacheView.getItem("dasdas"));
	}
}
