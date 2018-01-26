package com.example.annotationdemo;

import java.lang.annotation.*;

/**
 * @author zenghui
 * @create 2018-01-26 13:38
 **/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    public enum Color{ BLUE, RED, GREEN, YELLOW}
    Color fruitColor()  default Color.GREEN;
}
