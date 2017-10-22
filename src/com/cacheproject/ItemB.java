package com.cacheproject;

public class ItemB implements CacheItem {

    private String key;
    private Object value;

    ItemB(){}

    ItemB(String key, Object value) {
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
