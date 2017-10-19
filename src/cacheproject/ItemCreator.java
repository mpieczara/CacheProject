package cacheproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ItemCreator implements CacheItem {

    String key;
    Object value;


    ItemCreator() {}

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
        return null;
    }
}
