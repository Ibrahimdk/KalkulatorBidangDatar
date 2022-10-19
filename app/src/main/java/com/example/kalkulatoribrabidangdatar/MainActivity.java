package com.example.kalkulatoribrabidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void persegi (View view) {
        Intent it = new Intent(MainActivity.this, persegi.class);
        startActivity(it);
    }

    public void segitiga (View view) {
        Intent it = new Intent(MainActivity.this, segitiga.class);
        startActivity(it);
    }

    public void lingkaran (View view) {
        Intent it = new Intent(MainActivity.this, lingkaran.class);
        startActivity(it);
    }

}