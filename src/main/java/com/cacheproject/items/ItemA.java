package com.cacheproject.items;

import com.cacheproject.cache.CacheItem;

public class ItemA implements CacheItem {

    private String key;
    private Object value;

    ItemA(){}

    public ItemA(String key, Object value) {
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
