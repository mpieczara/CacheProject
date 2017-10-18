package cacheproject;

public class ItemA implements CacheItem {

    private String value = "A";

    @Override
    public String getKey() {
        return this.value;
    }

    @Override
    public Object getValue() {
        return new ItemA();
    }
}
