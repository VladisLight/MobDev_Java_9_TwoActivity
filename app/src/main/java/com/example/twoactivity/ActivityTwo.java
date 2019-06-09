package com.example.twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    final String TAG = "States";
    TextView TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        TV = (TextView) findViewById(R.id.textView2);
        String Fname = getIntent().getStringExtra("Name");
        if (Fname.isEmpty()==false) {
            TV.setText("Введенное имя: " + Fname);
        }
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
        if (item.getItemId() == R.id.menu_third) {
            Intent intent = new Intent(this, ActivityThree.class);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.menu_fourth) {
            Intent intent = new Intent(this, ActivityFour.class);
            startActivity(intent);
        }
        return false;
    }
}
