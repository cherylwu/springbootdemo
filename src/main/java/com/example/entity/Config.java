package com.example.entity;

public class Config {
    private String name;
    private String ip;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static Config creat() {
        Config config = new Config();
        return config;
    }

    ;

    public Config name(String name) {
        this.name = name;
        return this;
    }

    public Config ip(String ip) {
        this.ip = ip;
        return this;
    }

    public Config year(int year) {
        this.year = year;
        return this;
    }

    @Override
    public String toString() {
        return "Config{" +
                "name='" + name + '\'' +
                ", ip='" + ip + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        Config config = Config.creat().ip("abc").name("ch").year(9);
        System.out.println(config);
    }
}
