package com.cacheproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CacheManager implements Cache {

    private final int cacheSize = 3;
    static List<Map<String, Object>> cache = new ArrayList<>();

    @Override
    public CacheItem cacheItem(Object item, String key) {
        HashMap<String, Object> itemMap = new HashMap<>();
        itemMap.put(key, item);

        if(cache.size() < cacheSize) {
            cache.add(itemMap);
        } else {
            cache.remove(cacheSize - 1);
            cache.add(itemMap);
        }

        return (CacheItem) item;
    }

    @Override
    public void invalidateCache() {
        cache.clear();
    }

    @Override
    public CacheView getView() {
        return new CacheViewManager()
;    }

    protected static class CacheViewManager implements CacheView {

        @Override
        public int size() {
            return cache.size();
        }

        @Override
        public CacheItem getItem(int index) {
            cache.get(index);
            Object item = cache.get(index).keySet();
            return (CacheItem) item;
        }

        @Override
        public CacheItem getItem(String key) {
            Object item = null;
            for (Map<String, Object> map : cache) {
                item = map.get(key);
            }
            return (CacheItem) item;
        }

        public void getAllItems() {
            cache.forEach(map -> map.entrySet().forEach(v -> System.out.println(v)));
        }

        public CacheItem getItemsss(String key) {
            final Object[] item = {null};

            cache.forEach((Map<String, Object> map) -> {
                item[0] = map.get(key);
            });
            return (CacheItem) item[0];
        }
    }
}
