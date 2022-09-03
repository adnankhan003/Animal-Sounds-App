package com.example.animalsoundsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class InsectActivity extends AppCompatActivity {
    SoundPool soundPool;
    private int mHouseFly, mMosquito, mBee, mCockroach, mBeetle;
    private int houseFlyPause, mosquitoPause, beePause, cockroachPause, beetlePause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insect);

        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .build();
        soundPool = new SoundPool.Builder()
                .setMaxStreams(5)
                .setAudioAttributes(audioAttributes)
                .build();

        mHouseFly = soundPool.load(this, R.raw.housefly_sound, 1);
        mMosquito = soundPool.load(this, R.raw.mosquito_sound, 1);
        mBee = soundPool.load(this, R.raw.bee_sound, 1);
        mCockroach = soundPool.load(this, R.raw.cockroach_sound, 1);
        mBeetle = soundPool.load(this, R.raw.beetle_sound, 1);
    }

    @SuppressLint("NonConstantResourceId")
    public void playSoundInsect(View v) {
        switch (v.getId()) {
            case R.id.housefly:
                houseFlyPause = soundPool.play(mHouseFly, 1, 1, 1, 0, 1);
                soundPool.pause(mosquitoPause);
                soundPool.pause(beePause);
                soundPool.pause(cockroachPause);
                soundPool.pause(beetlePause);
                break;
            case R.id.mosquito:
                mosquitoPause = soundPool.play(mMosquito, 1, 1, 1, 0, 1);
                soundPool.pause(houseFlyPause);
                soundPool.pause(beePause);
                soundPool.pause(cockroachPause);
                soundPool.pause(beetlePause);

                break;
            case R.id.bee:
                beePause = soundPool.play(mBee, 2, 2, 1, 0, 1);
                soundPool.pause(houseFlyPause);
                soundPool.pause(mosquitoPause);
                soundPool.pause(cockroachPause);
                soundPool.pause(beetlePause);
                break;
            case R.id.cockroach:
                cockroachPause = soundPool.play(mCockroach, 1, 1, 1, 0, 1);
                soundPool.pause(houseFlyPause);
                soundPool.pause(mosquitoPause);
                soundPool.pause(beePause);
                soundPool.pause(beetlePause);
                break;
            case R.id.beetle:
                beetlePause = soundPool.play(mBeetle, 1, 1, 1, 0, 1);
                soundPool.pause(houseFlyPause);
                soundPool.pause(mosquitoPause);
                soundPool.pause(beePause);
                soundPool.pause(cockroachPause);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }

}