package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {

    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        checkBox = (CheckBox) findViewById(R.id.checkBox);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, getResources().getString(R.string.return_to_main));
        menu.add(0, 2, 0, getResources().getString(R.string.exit));
        menu.add(1, 3, 0, getResources().getString(R.string.secret));

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.setGroupVisible(1, checkBox.isChecked());

        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case 1:
                finish();
                break;
            case 2:
                this.finishAffinity();
                break;
            case 3:
                Toast.makeText(this, R.string.secret_item, Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}