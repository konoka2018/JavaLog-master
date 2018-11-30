package jp.techacademy.konoka.fujiwara.javalog;

import android.util.Log;

public class Human extends Animal{//implements Thinkable{

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // メンバ関数
    @Override
    public void say() {
        Log.d("javatest", "私の名前は"  + this.name + "です。年は" + this.age + "歳です。");
    }


    // wakaranai
    //@Override
    //public void Think() {
        //Log.d("javatest", "私は"  + this.name + "について考える");
    //}
}












