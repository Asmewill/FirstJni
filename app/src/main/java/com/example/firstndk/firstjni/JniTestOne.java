package com.example.firstndk.firstjni;

/**
 * Created by jsxiaoshui on 2021/3/30
 */
public class JniTestOne {
    private JniTestOne(){}
    public static JniTestOne instance=null;
    public static JniTestOne getInstance(){
        if(instance==null){
            instance=new JniTestOne();
        }
        return instance;
    }
    static {
        System.loadLibrary("JniTestOne");
    }
    public static native String getJniString();
}


