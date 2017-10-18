package cacheproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Math.E;
import static javafx.scene.input.KeyCode.T;
import static javafx.scene.input.KeyCode.V;

public class CacheManager implements Cache {

    //ItemCreator item = new ItemCreator();
    static List<Map<Object, String>> cache = new ArrayList<>();

    @Override
    public CacheItem cacheItem(Object item, String key) {
        HashMap<Object, String> itemMap = new HashMap<>();
        itemMap.put(item, key);
        cache.add(itemMap);
        return (CacheItem) item;
    }

    @Override
    public void invalidateCache() {
        cache.clear();
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
            cache.get(index);
            Object item = cache.get(index).keySet();
            return (CacheItem) item;
        }

        @Override
        public CacheItem getItem(String key) {
            return null;
        }
    }
}
