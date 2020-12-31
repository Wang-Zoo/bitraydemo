package com.wangzuo.bintarydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.wangzuo.testmodule.DemoUtils;

import java.nio.file.DirectoryNotEmptyException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DemoUtils.getValue();
    }
}
