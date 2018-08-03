package com.jayanthan.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class Second extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String s = getIntent().getStringExtra("user");
        text=(TextView)findViewById(R.id.ad);
        text.setText(s);
    }
}
