package com.example.twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    Button btnActTwo;
    final String TAG = "States";
    EditText ED;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);
        ED = (EditText) findViewById(R.id.ED);

        Log.d(TAG, "MainActivity: onCreate()");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_second) {
            Intent intent = new Intent(this, ActivityTwo.class);
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

    @Override
    public void onClick(View v) {
                st = ED.getText().toString();
                Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
                intent.putExtra("Name", st);
                startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "MainActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity: onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainActivity: onRestart()");
}}
