package com.example.birdapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int WPClickCount = 0;
    int robinClickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void WPButtonClick(View v)
    {
        System.out.println("WP Clicked");
        WPClickCount++;
        System.out.println(WPClickCount);
        TextView tv = (TextView)findViewById(R.id.textView3);
        System.out.println("Text View Found");
        tv.setText(WPClickCount);
        System.out.println("Changed Text");

    }

    public void robinClickCount(View v){
        robinClickCount++;
        TextView tv = (TextView)findViewById(R.id.textView4);
        tv.setText(robinClickCount);
    }
}
