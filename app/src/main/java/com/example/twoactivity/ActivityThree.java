package com.example.twoactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class ActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_main) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.menu_second) {
            Intent intent = new Intent(this, ActivityTwo.class);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.menu_fourth) {
            Intent intent = new Intent(this, ActivityFour.class);
            startActivity(intent);
        }
        return false;
    }
}
