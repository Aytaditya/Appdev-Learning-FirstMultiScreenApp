package com.aditya.firstmultiscreenapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;


public class orderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);


        //will create intent now to accept the string this time
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.AA);

        //now we will set the message inside textview
        TextView textView=findViewById(R.id.orderText);
        textView.setText(message);

    }
}