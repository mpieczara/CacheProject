package com.cacheproject.items;

import com.cacheproject.items.ItemA;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    private ItemA itemA = new ItemA("A", "itemA");

    @Test
    public void shouldReturnProperKey() throws Exception {
        String key = itemA.getKey();
        Assert.assertEquals("Key value is incorrect.", "A", key);
    }

    @Test
    public void shouldReturnProperValue() throws Exception {
        Object value = itemA.getValue();
        Assert.assertEquals("Value is incorrect.", "itemA", value);
    }

}