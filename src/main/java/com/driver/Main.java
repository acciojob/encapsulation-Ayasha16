package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj=new RWOnly();
        //Error: variable obj of type com.driver.RWOnly(cannot find symbol)
        obj.setName("Ayasha");
        System.out.println(obj.getName());
    }
  
}