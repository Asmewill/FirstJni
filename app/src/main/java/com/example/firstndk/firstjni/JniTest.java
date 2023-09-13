package com.example.firstndk.firstjni;

/**
 * Created by jsxiaoshui on 2021/3/30
 */
public class JniTest{
    private JniTest(){}
    public static JniTest instance=null;
    public static JniTest getInstance(){
        if(instance==null){
            instance=new JniTest();
        }
        return instance;
    }
    static {
        System.loadLibrary("JniTest");
    }
    public static native String getJniString();
}


