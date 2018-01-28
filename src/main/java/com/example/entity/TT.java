package com.example.entity;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zenghui
 * @create 2018-01-28 18:10
 **/
public class TT {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        Class c = T.class;
        invokeMethods(c);
printFields(c);
        /*Field[] fields = c.getDeclaredFields();
        Method[] methods = c.getDeclaredMethods();
        for (Field field : fields) {
            System.out.println(field);
        }*/
    }

    public static void printFields(Class clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields){
            System.out.println(field);
        }
    }

    public static void invokeMethods(Class clazz) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method: methods){
            method.invoke(clazz.newInstance());
        }
    }
}
