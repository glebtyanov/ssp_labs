package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class AuthorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, getResources().getString(R.string.return_to_main));
        menu.add(0, 2, 0, getResources().getString(R.string.exit));

        return super.onCreateOptionsMenu(menu);
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