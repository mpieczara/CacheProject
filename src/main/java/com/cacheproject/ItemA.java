package com.cacheproject;

public class ItemA implements CacheItem {

    private String key;
    private Object value;

    ItemA(){}

    ItemA(String key, Object value) {
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
