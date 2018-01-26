package com.example.entity;

import com.example.annotationdemo.FruitColor;
import com.example.annotationdemo.FruitName;
import com.example.annotationdemo.FruitProvider;

/**
 * @author zenghui
 * @create 2018-01-26 13:48
 **/
public class Apple {

    @FruitName("Apple")
    private String appleName;

    @FruitColor(fruitColor= FruitColor.Color.RED)
    private String appleColor;

    @FruitProvider(id = 1, name = "陕西红富士", address = "Road NO.01")
    private String appleProvider;

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getAppleColor() {

        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public String getAppleProvider() {
        return appleProvider;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }

    public Apple appleName(String appleName){
        this.appleName = appleName;
        return this;
    }

    public Apple
}
