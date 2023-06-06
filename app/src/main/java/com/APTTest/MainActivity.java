package com.APTTest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.libinjector.MyProcessor;
import com.libinjector.TestAnnotation;

@TestAnnotation(name = "hhh", text = "搞笑的吧")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}