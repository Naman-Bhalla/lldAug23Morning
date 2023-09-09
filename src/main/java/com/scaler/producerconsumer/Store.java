package com.scaler.producerconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {
    private int maxSize;
    private List<Objects> items;

    public Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<Objects> getItems() {
        return items;
    }

    public void setItems(List<Objects> items) {
        this.items = items;
    }

    public void addItem() {
        this.items.add(null);
        System.out.println("Item Produced. New Count: " + this.items.size());
    }

    public void removeItem() {
        this.items.remove(this.items.size() - 1);
        System.out.println("Item Consumed. New Count: " + this.items.size());
    }
}
