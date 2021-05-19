package com.jeremy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jeremy.li
 * @date 2020/12/10
 * @description
 */
public class T001 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = T001.class.getClassLoader().loadClass("com.jeremy.T002");
        System.out.println(aClass.getName());

        MyClassLoader myClassLoader = new MyClassLoader();
        Class<?> t002 = myClassLoader.loadClass("java.lang.String");
        System.out.println(t002.getName());

        List<Integer> list = new ArrayList<>();
        list.add(10);
        Dog dog = new Dog();
        list.stream().forEach(s -> {
            dog.setAge(s);
        });
        System.out.println(dog.getAge());
    }
}
