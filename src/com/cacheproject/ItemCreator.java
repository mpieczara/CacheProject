package com.cacheproject;

public class ItemCreator implements CacheItem {

    String key;
    Object value;

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