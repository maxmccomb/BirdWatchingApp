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

    public void WPIncClicked(View v) {
        WPClickCount++;
        TextView tv = (TextView)findViewById(R.id.textView3);
        tv.setText("" + WPClickCount);

    }

    public void WPDecClicked(View v){
        WPClickCount--;
        TextView tv = (TextView)findViewById(R.id.textView3);
        tv.setText("" + WPClickCount);
    }

    public void robinIncClicked(View v){
        robinClickCount++;
        TextView tv = (TextView)findViewById(R.id.textView4);
        tv.setText("" + robinClickCount);
    }

    public void robinDecClicked(View v){
        robinClickCount--;
        TextView tv = (TextView)findViewById(R.id.textView4);
        tv.setText("" + robinClickCount);
    }
}
