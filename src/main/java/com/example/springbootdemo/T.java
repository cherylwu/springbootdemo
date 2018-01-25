package com.example.springbootdemo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zenghui
 * @create 2018-01-24 21:34
 **/
public class T {
    private String number;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void t(Integer a) {
        a = a + 1;
        System.out.println("result is -->" + a);
    }

    public static void main(String[] args) {
        T t = new T();
        t.number = "dasdfasd";
        t.setNumber("ddasdfasd");
        Integer b = 3;
        new T().t(b);
        System.out.println(b);


        int[] arrayInt = {1, 3};
        System.out.println(arrayInt[1]);
        LinkedList<Integer> list = (LinkedList) Arrays.asList(1, 2, 23);

        for (int item : list) {

            System.out.println(item);
        }

        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i == 1) {
                continue;
            }
            System.out.println(list.get(i));
        }

    }

}
