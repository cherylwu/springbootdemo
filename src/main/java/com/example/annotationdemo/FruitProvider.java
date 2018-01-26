package com.example.annotationdemo;

import java.lang.annotation.*;

/**
 * @author zenghui
 * @create 2018-01-26 13:44
 **/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {
    public int id()  default -1;

    public String name()   default "";

    public String address()   default "";
}
