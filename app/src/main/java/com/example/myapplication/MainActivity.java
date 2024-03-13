package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout layout = (ConstraintLayout) findViewById(com.google.android.material.R.id.layout);
        Button button = new Button(this);
        button.setText("asdasd");
        button.setLayoutParams(new ConstraintLayout.LayoutParams(100, 200));
        layout.addView(button);
    }
}