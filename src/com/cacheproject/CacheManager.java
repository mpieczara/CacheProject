package com.cacheproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CacheManager implements Cache {

    private final int cacheSize = 3;
    static List<CacheItem> cache = new ArrayList<>();

    @Override
    public CacheItem cacheItem(Object item, String key) {

        if(cache.size() < cacheSize) {
            cache.add(new ItemCreator(key, item));
        } else {
            cache.remove(0);
            cache.add(new ItemCreator(key, item));
        }

        return cache.get(cache.size()-1);
    }

    @Override
    public void invalidateCache() {
        cache.clear();
    }

    @Override
    public CacheView getView() {
        return CacheViewManager.getInstance();
    }

    protected static class CacheViewManager implements CacheView {

        private static CacheViewManager instance = null;
        protected CacheViewManager() {}

        public static CacheViewManager getInstance() {
            if(instance == null) {
                instance = new CacheViewManager();
            }
            return instance;
        }

        @Override
        public int size() {
            return cache.size();
        }

        @Override
        public CacheItem getItem(int index) {
            return cache.get(index);
        }

        @Override
        public CacheItem getItem(String key) {
            CacheItem item = cache.stream().filter(
                    object -> object.getKey().equals(key)
            ).findFirst().get();
            return item;
        }

        public void getAllItems() {
            System.out.println("Cache items: ");
            cache.forEach(item -> System.out.print(item.getKey().concat(" ")));
        }
    }
}
