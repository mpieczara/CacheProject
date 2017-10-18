package cacheproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CacheManager implements Cache {

    CacheItem item;
    static List<Map<CacheItem, String>> cache = new ArrayList<>();

    @Override
    public CacheItem cacheItem(Object item, String key) {
        HashMap<CacheItem, String> itemMap = new HashMap();
        return null;
    }

    @Override
    public void invalidateCache() {

    }

    @Override
    public CacheView getView() {
        return new CacheViewManager();
    }

    protected static class CacheViewManager implements CacheView {

        @Override
        public int size() {
            return cache.size();
        }

        @Override
        public CacheItem getItem(int index) {
            return null;
        }

        @Override
        public CacheItem getItem(String key) {
            return null;
        }
    }
}
