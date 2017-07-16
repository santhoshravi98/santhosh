package com.example.santhosh.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private String one;
    private String two;
    private String three;
    private String four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void tempclass(View view) {


        EditText ediText2 = (EditText) findViewById(R.id.editText2);
        EditText ediText = (EditText) findViewById(R.id.editText);
        EditText ediText3 = (EditText) findViewById(R.id.editText3);
        EditText ediText4 = (EditText) findViewById(R.id.editText4);
        one = ediText2.getText().toString();
        two = ediText.getText().toString();
        three = ediText3.getText().toString();
        four = ediText4.getText().toString();


        Intent intent = new Intent(MainActivity.this, secondary.class);
        intent.putExtra("apple", one);
        intent.putExtra("orange", two);
        intent.putExtra("mango", three);
        intent.putExtra("grapes", four);


        startActivity(intent);

    }
}

