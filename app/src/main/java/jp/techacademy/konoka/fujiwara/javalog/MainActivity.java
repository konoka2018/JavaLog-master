package jp.techacademy.konoka.fujiwara.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human Human = new Human("konoka",28,"プログラミンング");
        Human.say();
        Human.think();
    }
}




