package com.cacheproject.cache;

import com.cacheproject.items.ItemA;
import org.junit.Assert;
import org.junit.Test;


class CacheManagerTest {

    private CacheManager cache;
    private ItemA itemA = new ItemA("A", "itemA");

    @Test
    void cacheItem() {
        cache.cacheItem(itemA, itemA.getKey());
        cache.getView();
    }

    @Test
    void invalidateCache() {
    }

    @Test
    void getView() {
    }

}