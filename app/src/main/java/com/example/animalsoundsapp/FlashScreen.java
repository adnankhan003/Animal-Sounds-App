package com.example.animalsoundsapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class FlashScreen extends AppCompatActivity {

    TextView flashText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_screen);

        new Handler().postDelayed(() -> {
            Intent intent =  new Intent(FlashScreen.this,MainActivity.class);
            startActivity(intent);
            finish();
        },2000);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        flashText = findViewById(R.id.flashText);
        flashText.animate().alpha(1).setDuration(1400);
    }
}