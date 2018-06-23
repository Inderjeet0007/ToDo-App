package com.example.inder.todoappfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by inder on 9/8/2017.
 */

public class HowTo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.to_how);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent2 = new Intent();
        finish();

        return true;
    }
}