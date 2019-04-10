package com.example.training1.di;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.elyeproj.loaderviewlibrary.LoaderTextView;
import com.example.training1.R;

public class MainActivity extends AppCompatActivity {

    LoaderTextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
//        textView.resetLoader();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setText("hahaha");
            }
        },5000);
    }
}
