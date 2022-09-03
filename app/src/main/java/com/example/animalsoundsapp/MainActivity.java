package com.example.animalsoundsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout mDom, mWild, mBird, mAqua, mInsect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDom = findViewById(R.id.dom_click);
        mWild = findViewById(R.id.wild_click);
        mBird = findViewById(R.id.bird_click);
        mAqua = findViewById(R.id.aqua_click);
        mInsect = findViewById(R.id.insect_click);

        mDom.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,DomesticActivity.class);
            startActivity(intent);
        });

        mWild.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,WildActivity.class);
            startActivity(intent);
        });

        mBird.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,BirdActivity.class);
            startActivity(intent);
        });

        mAqua.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,AquaActivity.class);
            startActivity(intent);
        });

        mInsect.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,InsectActivity.class);
            startActivity(intent);
        });
    }
}