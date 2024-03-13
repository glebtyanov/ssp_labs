package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button redButton;
    private Button blueButton;
    private Button greenButton;
    private EditText textField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textField = (EditText) findViewById(R.id.textField);

        redButton = (Button) findViewById(R.id.redButton);
        redButton.setOnClickListener(this);

        blueButton = (Button) findViewById(R.id.blueButton);
        blueButton.setOnClickListener(this);

        greenButton = (Button) findViewById(R.id.greenButton);
        greenButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int colorId = 0;
        switch (view.getId()) {
            case R.id.redButton:
                colorId = R.color.red;
                break;

            case R.id.blueButton:
                colorId = R.color.blue;
                break;

            case R.id.greenButton:
                colorId = R.color.green;
                break;
        }

        textField.setTextColor(getResources().getColor(colorId));

        Toast toast = Toast.makeText(this, R.string.colorChanged, Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;

        String id = getResources().getResourceName(item.getItemId()).split("\\/")[1];

        switch (id) {
            case "about":
                intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                break;
            case "author":
                intent = new Intent(this, AuthorActivity.class);
                startActivity(intent);
                break;
            case "exit":
                finish();
        }

        return super.onOptionsItemSelected(item);
    }

}