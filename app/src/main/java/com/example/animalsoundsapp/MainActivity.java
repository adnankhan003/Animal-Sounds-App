package com.example.animalsoundsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.contact_us){
            Intent intent = new Intent(MainActivity.this,CallActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}