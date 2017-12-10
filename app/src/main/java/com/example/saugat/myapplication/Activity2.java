package com.example.saugat.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
 TextView text1;
 TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        Bundle bundle = getIntent().getExtras();
        String t1 = bundle.getString("username");
        String t2 = bundle.getString("pass");
        text1.setText(t1);
        text2.setText(t2);
    }
}
