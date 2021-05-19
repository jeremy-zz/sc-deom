package com.jeremy;

import sun.applet.AppletClassLoader;

/**
 * @author jeremy.li
 * @date 2020/12/10
 * @description
 */
public class MyClassLoader extends ClassLoader {

    private String mark = null;

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        System.out.println(this.getClass().getName()+ " loadClass");
        //return null;
        //return super.loadClass(name);
        if (name.contains("String")){
            mark = "string";
        }
        return AppletClassLoader.class;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        if (mark=="string"){
            System.out.println("test");
        }
        return super.findClass(name);
    }


}
