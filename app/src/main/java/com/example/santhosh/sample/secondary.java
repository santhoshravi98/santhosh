package com.example.santhosh.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondary extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);


    TextView one=(TextView)findViewById(R.id.one);
    TextView textView8=(TextView)findViewById(R.id.textView8);
    TextView textView10=(TextView)findViewById(R.id.textView10);
    TextView textView12=(TextView)findViewById(R.id.textView12);
        Intent intent=getIntent();
        one.setText(getIntent().getStringExtra("apple"));
        textView8.setText(getIntent().getStringExtra("orange"));
        textView10.setText(getIntent().getStringExtra("mango"));
        textView12.setText(getIntent().getStringExtra("grapes"));
    }
}
