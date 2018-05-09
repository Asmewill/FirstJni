package com.example.jianshui.firstndk;

/**
 * Created by jian.shui on 2018/5/8.
 */

public class JniTest {
    private JniTest(){}
    public static JniTest instatnce=null;
    public static JniTest getInstatnce(){
        if(instatnce==null){
            instatnce=new JniTest();
        }
        return instatnce;
    }


    static {
        System.loadLibrary("JniTest");//jni模块加载名称
    }
    public static native String getJniString();//红色的本地方法，暂时不用理会
}
//F:\AndroidDemoWorkSpace\FirstNDk\app\build\intermediates\classes\debug>javah -jni com.example.jianshui.firstndk.JniTest


