package com.example.animalsoundsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class DomesticActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private int mDog, mCat, mBillyGoat, mGoat, mCow, mOx, mHorse, mRabbit, mDonkey;
    private int dogPause, catPause, billyGoatPause, goatPause, cowPause, oxPause, horsePause, rabbitPause, donkeyPause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domestic);

        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .build();
        soundPool = new SoundPool.Builder()
                .setMaxStreams(9)
                .setAudioAttributes(audioAttributes)
                .build();

        mDog = soundPool.load(this,R.raw.dog_sound,1);
        mCat = soundPool.load(this,R.raw.cat_sound,1);
        mBillyGoat = soundPool.load(this,R.raw.billy_goat_sound,1);
        mGoat = soundPool.load(this,R.raw.goat_sound,1);
        mCow = soundPool.load(this,R.raw.cow_sound,1);
        mOx = soundPool.load(this,R.raw.ox_sound,1);
        mHorse = soundPool.load(this,R.raw.horse_sound,1);
        mRabbit = soundPool.load(this,R.raw.rabbit_sound,1);
        mDonkey = soundPool.load(this,R.raw.donkey_sound,1);
    }

    @SuppressLint("NonConstantResourceId")
    public void playSoundDom(View v){
        switch (v.getId()){
            case R.id.dog:
                dogPause = soundPool.play(mDog, 1, 1, 1, 0, 1);
                soundPool.pause(catPause);
                soundPool.pause(billyGoatPause);
                soundPool.pause(goatPause);
                soundPool.pause(cowPause);
                soundPool.pause(oxPause);
                soundPool.pause(rabbitPause);
                soundPool.pause(horsePause);
                soundPool.pause(donkeyPause);
                break;
            case R.id.cat:
                catPause = soundPool.play(mCat, 1, 1, 1, 0, 1);
                soundPool.pause(dogPause);
                soundPool.pause(billyGoatPause);
                soundPool.pause(goatPause);
                soundPool.pause(cowPause);
                soundPool.pause(oxPause);
                soundPool.pause(rabbitPause);
                soundPool.pause(horsePause);
                soundPool.pause(donkeyPause);
                break;
            case R.id.billy_goat:
                billyGoatPause = soundPool.play(mBillyGoat, 1, 1, 1, 0, 1);
                soundPool.pause(dogPause);
                soundPool.pause(catPause);
                soundPool.pause(goatPause);
                soundPool.pause(cowPause);
                soundPool.pause(oxPause);
                soundPool.pause(rabbitPause);
                soundPool.pause(horsePause);
                soundPool.pause(donkeyPause);
                break;
            case R.id.goat:
                goatPause = soundPool.play(mGoat, 1, 1, 1, 0, 1);
                soundPool.pause(dogPause);
                soundPool.pause(catPause);
                soundPool.pause(billyGoatPause);
                soundPool.pause(cowPause);
                soundPool.pause(oxPause);
                soundPool.pause(rabbitPause);
                soundPool.pause(horsePause);
                soundPool.pause(donkeyPause);
                break;
            case R.id.cow:
                cowPause = soundPool.play(mCow, 1, 1, 1, 0, 1);
                soundPool.pause(dogPause);
                soundPool.pause(catPause);
                soundPool.pause(billyGoatPause);
                soundPool.pause(goatPause);
                soundPool.pause(oxPause);
                soundPool.pause(rabbitPause);
                soundPool.pause(horsePause);
                soundPool.pause(donkeyPause);
                break;
            case R.id.ox:
                oxPause = soundPool.play(mOx, 1, 1, 1, 0, 1);
                soundPool.pause(dogPause);
                soundPool.pause(catPause);
                soundPool.pause(billyGoatPause);
                soundPool.pause(goatPause);
                soundPool.pause(cowPause);
                soundPool.pause(rabbitPause);
                soundPool.pause(horsePause);
                soundPool.pause(donkeyPause);
                break;
            case R.id.rabbit:
                rabbitPause = soundPool.play(mRabbit, 1, 1, 1, 0, 1);
                soundPool.pause(dogPause);
                soundPool.pause(catPause);
                soundPool.pause(billyGoatPause);
                soundPool.pause(goatPause);
                soundPool.pause(cowPause);
                soundPool.pause(oxPause);
                soundPool.pause(horsePause);
                soundPool.pause(donkeyPause);
                break;
            case R.id.horse:
                horsePause = soundPool.play(mHorse, 1, 1, 1, 0, 1);
                soundPool.pause(dogPause);
                soundPool.pause(catPause);
                soundPool.pause(billyGoatPause);
                soundPool.pause(goatPause);
                soundPool.pause(cowPause);
                soundPool.pause(oxPause);
                soundPool.pause(rabbitPause);
                soundPool.pause(donkeyPause);
                break;
            case R.id.donkey:
                donkeyPause = soundPool.play(mDonkey, 1, 1, 1, 0, 1);
                soundPool.pause(dogPause);
                soundPool.pause(catPause);
                soundPool.pause(billyGoatPause);
                soundPool.pause(goatPause);
                soundPool.pause(cowPause);
                soundPool.pause(oxPause);
                soundPool.pause(rabbitPause);
                soundPool.pause(horsePause);
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