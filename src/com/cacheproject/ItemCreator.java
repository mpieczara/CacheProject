package com.cacheproject;

public class ItemCreator implements CacheItem {

    private String key;
    private Object value;

    private static ItemCreator instance = null;
    protected ItemCreator() {}

    public static ItemCreator getInstance() {
        if(instance == null) {
            instance = new ItemCreator();
        }
        return instance;
    }

    ItemCreator(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public Object getValue() {
        return this.value;
    }
}
