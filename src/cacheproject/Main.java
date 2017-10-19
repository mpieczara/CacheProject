package cacheproject;

public class Main {

	public static void main(String[] args) {
		CacheManager cache = new CacheManager();
		ItemCreator itemA = new ItemCreator("A", 12);

		CacheItem a = cache.cacheItem(itemA, itemA.getKey());
		System.out.println(cache.getView());

	}
}
