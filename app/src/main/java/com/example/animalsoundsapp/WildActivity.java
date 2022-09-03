package com.example.animalsoundsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class WildActivity extends AppCompatActivity {
    SoundPool soundPool;
    private int mTiger, mLIon, mMonkey, mGorilla, mElephant, mBison, mCheetah, mLeopard,
            mBear, mPolar, mWolf, mFox, mDeer, mCroco, mPanthar, mGiraffe, mZebra, mTurtle, mSnake;
    private int tigerPause, lionPause, monkeyPause, gorillaPause, elephantPause, bisonPause, cheetahPause, leopardPause,
            bearPause, polarPause, wolfPause, foxPause, deerPause, crocoPause, pantharPause, giraffePause,
            zebraPause, turtlePause, snakePause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wild);

        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .build();
        soundPool = new SoundPool.Builder()
                .setMaxStreams(19)
                .setAudioAttributes(audioAttributes)
                .build();

        mTiger = soundPool.load(this,R.raw.tiger_sound,1);
        mLIon = soundPool.load(this,R.raw.lion_sound,1);
        mMonkey = soundPool.load(this,R.raw.monkey_sound,1);
        mGorilla = soundPool.load(this,R.raw.gorilla_sound,1);
        mElephant = soundPool.load(this,R.raw.elephant_sound,1);
        mBison = soundPool.load(this,R.raw.bison_sound,1);
        mCheetah = soundPool.load(this,R.raw.cheetah_sound,1);
        mLeopard = soundPool.load(this,R.raw.leopard_sound,1);
        mBear = soundPool.load(this,R.raw.bear_sound,1);
        mPolar = soundPool.load(this,R.raw.polar_sound,1);
        mWolf = soundPool.load(this,R.raw.wolf_sound,1);
        mFox = soundPool.load(this,R.raw.fox_sound,1);
        mDeer = soundPool.load(this,R.raw.deer_sound,1);
        mCroco = soundPool.load(this,R.raw.crocodile_sound,1);
        mPanthar = soundPool.load(this,R.raw.panther_sound,1);
        mGiraffe = soundPool.load(this,R.raw.giraffe_sound,1);
        mZebra = soundPool.load(this,R.raw.zebra_sound,1);
        mTurtle = soundPool.load(this,R.raw.turtle_sound,1);
        mSnake = soundPool.load(this,R.raw.snake_sound,1);
    }

    @SuppressLint("NonConstantResourceId")
    public void playSoundWild(View v) {
        switch (v.getId()) {
            case R.id.tiger:
                tigerPause = soundPool.play(mTiger, 1, 1, 1, 1, 1);
                soundPool.pause(lionPause);
                soundPool.pause(monkeyPause);
                soundPool.pause(gorillaPause);
                soundPool.pause(elephantPause);
                soundPool.pause(bisonPause);
                soundPool.pause(cheetahPause);
                soundPool.pause(leopardPause);
                soundPool.pause(bearPause);
                soundPool.pause(polarPause);
                soundPool.pause(wolfPause);
                soundPool.pause(foxPause);
                soundPool.pause(deerPause);
                soundPool.pause(crocoPause);
                soundPool.pause(pantharPause);
                soundPool.pause(giraffePause);
                soundPool.pause(zebraPause);
                soundPool.pause(turtlePause);
                soundPool.pause(snakePause);
                break;
            case R.id.lion:
                lionPause = soundPool.play(mLIon, 1, 1, 1, 0, 1);
                soundPool.pause(tigerPause);
                soundPool.pause(monkeyPause);
                soundPool.pause(gorillaPause);
                soundPool.pause(elephantPause);
                soundPool.pause(bisonPause);
                soundPool.pause(cheetahPause);
                soundPool.pause(leopardPause);
                soundPool.pause(bearPause);
                soundPool.pause(polarPause);
                soundPool.pause(wolfPause);
                soundPool.pause(foxPause);
                soundPool.pause(deerPause);
                soundPool.pause(crocoPause);
                soundPool.pause(pantharPause);
                soundPool.pause(giraffePause);
                soundPool.pause(zebraPause);
                soundPool.pause(turtlePause);
                soundPool.pause(snakePause);
                break;
            case R.id.monkey:
                monkeyPause = soundPool.play(mMonkey, 1, 1, 1, 0, 1);
                soundPool.pause(tigerPause);
                soundPool.pause(lionPause);
                soundPool.pause(gorillaPause);
                soundPool.pause(elephantPause);
                soundPool.pause(bisonPause);
                soundPool.pause(cheetahPause);
                soundPool.pause(leopardPause);
                soundPool.pause(bearPause);
                soundPool.pause(polarPause);
                soundPool.pause(wolfPause);
                soundPool.pause(foxPause);
                soundPool.pause(deerPause);
                soundPool.pause(crocoPause);
                soundPool.pause(pantharPause);
                soundPool.pause(giraffePause);
                soundPool.pause(zebraPause);
                soundPool.pause(turtlePause);
                soundPool.pause(snakePause);
                break;
            case R.id.gorilla:
                gorillaPause = soundPool.play(mGorilla, 1, 1, 1, 0, 1);
                soundPool.pause(tigerPause);
                soundPool.pause(lionPause);
                soundPool.pause(monkeyPause);
                soundPool.pause(elephantPause);
                soundPool.pause(bisonPause);
                soundPool.pause(cheetahPause);
                soundPool.pause(leopardPause);
                soundPool.pause(bearPause);
                soundPool.pause(polarPause);
                soundPool.pause(wolfPause);
                soundPool.pause(foxPause);
                soundPool.pause(deerPause);
                soundPool.pause(crocoPause);
                soundPool.pause(pantharPause);
                soundPool.pause(giraffePause);
                soundPool.pause(zebraPause);
                soundPool.pause(turtlePause);
                soundPool.pause(snakePause);
                break;
            case R.id.elephant:
                elephantPause = soundPool.play(mElephant, 1, 1, 1, 0, 1);
                soundPool.pause(tigerPause);
                soundPool.pause(lionPause);
                soundPool.pause(monkeyPause);
                soundPool.pause(gorillaPause);
                soundPool.pause(bisonPause);
                soundPool.pause(cheetahPause);
                soundPool.pause(leopardPause);
                soundPool.pause(bearPause);
                soundPool.pause(polarPause);
                soundPool.pause(wolfPause);
                soundPool.pause(foxPause);
                soundPool.pause(deerPause);
                soundPool.pause(crocoPause);
                soundPool.pause(pantharPause);
                soundPool.pause(giraffePause);
                soundPool.pause(zebraPause);
                soundPool.pause(turtlePause);
                soundPool.pause(snakePause);
                break;
            case R.id.bison:
                bisonPause = soundPool.play(mBison, 1, 1, 1, 0, 1);
                soundPool.pause(tigerPause);
                soundPool.pause(lionPause);
                soundPool.pause(monkeyPause);
                soundPool.pause(gorillaPause);
                soundPool.pause(elephantPause);
                soundPool.pause(cheetahPause);
                soundPool.pause(leopardPause);
                soundPool.pause(bearPause);
                soundPool.pause(polarPause);
                soundPool.pause(wolfPause);
                soundPool.pause(foxPause);
                soundPool.pause(deerPause);
                soundPool.pause(crocoPause);
                soundPool.pause(pantharPause);
                soundPool.pause(giraffePause);
                soundPool.pause(zebraPause);
                soundPool.pause(turtlePause);
                soundPool.pause(snakePause);
                break;
            case R.id.cheetah:
                cheetahPause = soundPool.play(mCheetah, 1, 1, 1, 1, 1);
                soundPool.pause(tigerPause);
                soundPool.pause(lionPause);
                soundPool.pause(monkeyPause);
                soundPool.pause(gorillaPause);
                soundPool.pause(elephantPause);
                soundPool.pause(bisonPause);
                soundPool.pause(leopardPause);
                soundPool.pause(bearPause);
                soundPool.pause(polarPause);
                soundPool.pause(wolfPause);
                soundPool.pause(foxPause);
                soundPool.pause(deerPause);
                soundPool.pause(crocoPause);
                soundPool.pause(pantharPause);
                soundPool.pause(giraffePause);
                soundPool.pause(zebraPause);
                soundPool.pause(turtlePause);
                soundPool.pause(snakePause);
                break;
            case R.id.leopard:
                leopardPause = soundPool.play(mLeopard, 1, 1, 1, 1, 1);
                soundPool.pause(tigerPause);
                soundPool.pause(lionPause);
                soundPool.pause(monkeyPause);
                soundPool.pause(gorillaPause);
                soundPool.pause(elephantPause);
                soundPool.pause(bisonPause);
                soundPool.pause(cheetahPause);
                soundPool.pause(bearPause);
                soundPool.pause(polarPause);
                soundPool.pause(wolfPause);
                soundPool.pause(foxPause);
                soundPool.pause(deerPause);
                soundPool.pause(crocoPause);
                soundPool.pause(pantharPause);
                soundPool.pause(giraffePause);
                soundPool.pause(zebraPause);
                soundPool.pause(turtlePause);
                soundPool.pause(snakePause);
                break;
            case R.id.bear:
                bearPause = soundPool.play(mBear, 1, 1, 1, 1, 1);
                soundPool.pause(tigerPause);
                soundPool.pause(lionPause);
                soundPool.pause(monkeyPause);
                soundPool.pause(gorillaPause);
                soundPool.pause(elephantPause);
                soundPool.pause(bisonPause);
                soundPool.pause(cheetahPause);
                soundPool.pause(leopardPause);
                soundPool.pause(polarPause);
                soundPool.pause(wolfPause);
                soundPool.pause(foxPause);
                soundPool.pause(deerPause);
                soundPool.pause(crocoPause);
                soundPool.pause(pantharPause);
                soundPool.pause(giraffePause);
                soundPool.pause(zebraPause);
                soundPool.pause(turtlePause);
                soundPool.pause(snakePause);
                break;
            case R.id.polar_bear:
                polarPause = soundPool.play(mPolar, 1, 1, 1, 1, 1);
                soundPool.pause(tigerPause);
                soundPool.pause(lionPause);
                soundPool.pause(monkeyPause);
                soundPool.pause(gorillaPause);
                soundPool.pause(elephantPause);
                soundPool.pause(bisonPause);
                soundPool.pause(cheetahPause);
                soundPool.pause(leopardPause);
                soundPool.pause(bearPause);
                soundPool.pause(wolfPause);
                soundPool.pause(foxPause);
                soundPool.pause(deerPause);
                soundPool.pause(crocoPause);
                soundPool.pause(pantharPause);
                soundPool.pause(giraffePause);
                soundPool.pause(zebraPause);
                soundPool.pause(turtlePause);
                soundPool.pause(snakePause);
                break;
            case R.id.wolf:
                wolfPause = soundPool.play(mWolf, 1, 1, 1, 0, 1);
                soundPool.pause(tigerPause);
                soundPool.pause(lionPause);
                soundPool.pause(monkeyPause);
                soundPool.pause(gorillaPause);
                soundPool.pause(elephantPause);
                soundPool.pause(bisonPause);
                soundPool.pause(cheetahPause);
                soundPool.pause(leopardPause);
                soundPool.pause(bearPause);
                soundPool.pause(polarPause);
                soundPool.pause(foxPause);
                soundPool.pause(deerPause);
                soundPool.pause(crocoPause);
                soundPool.pause(pantharPause);
                soundPool.pause(giraffePause);
                soundPool.pause(zebraPause);
                soundPool.pause(turtlePause);
                soundPool.pause(snakePause);
                break;
            case R.id.fox:
                foxPause = soundPool.play(mFox, 1, 1, 1, 0, 1);
                soundPool.pause(tigerPause);
                soundPool.pause(lionPause);
                soundPool.pause(monkeyPause);
                soundPool.pause(gorillaPause);
                soundPool.pause(elephantPause);
                soundPool.pause(bisonPause);
                soundPool.pause(cheetahPause);
                soundPool.pause(leopardPause);
                soundPool.pause(bearPause);
                soundPool.pause(polarPause);
                soundPool.pause(wolfPause);
                soundPool.pause(deerPause);
                soundPool.pause(crocoPause);
                soundPool.pause(pantharPause);
                soundPool.pause(giraffePause);
                soundPool.pause(zebraPause);
                soundPool.pause(turtlePause);
                soundPool.pause(snakePause);
                break;
            case R.id.deer:
                deerPause = soundPool.play(mDeer, 1, 1, 1, 0, 1);
                soundPool.pause(tigerPause);
                soundPool.pause(lionPause);
                soundPool.pause(monkeyPause);
                soundPool.pause(gorillaPause);
                soundPool.pause(elephantPause);
                soundPool.pause(bisonPause);
                soundPool.pause(cheetahPause);
                soundPool.pause(leopardPause);
                soundPool.pause(bearPause);
                soundPool.pause(polarPause);
                soundPool.pause(wolfPause);
                soundPool.pause(foxPause);
                soundPool.pause(crocoPause);
                soundPool.pause(pantharPause);
                soundPool.pause(giraffePause);
                soundPool.pause(zebraPause);
                soundPool.pause(turtlePause);
                soundPool.pause(snakePause);
                break;
            case R.id.crocodile:
                crocoPause = soundPool.play(mCroco, 1, 1, 1, 0, 1);
                soundPool.pause(tigerPause);
                soundPool.pause(lionPause);
                soundPool.pause(monkeyPause);
                soundPool.pause(gorillaPause);
                soundPool.pause(elephantPause);
                soundPool.pause(bisonPause);
                soundPool.pause(cheetahPause);
                soundPool.pause(leopardPause);
                soundPool.pause(bearPause);
                soundPool.pause(polarPause);
                soundPool.pause(wolfPause);
                soundPool.pause(foxPause);
                soundPool.pause(deerPause);
                soundPool.pause(pantharPause);
                soundPool.pause(giraffePause);
                soundPool.pause(zebraPause);
                soundPool.pause(turtlePause);
                soundPool.pause(snakePause);
                break;
            case R.id.panthar:
                pantharPause = soundPool.play(mPanthar, 1, 1, 1, 1, 1);
                soundPool.pause(tigerPause);
                soundPool.pause(lionPause);
                soundPool.pause(monkeyPause);
                soundPool.pause(gorillaPause);
                soundPool.pause(elephantPause);
                soundPool.pause(bisonPause);
                soundPool.pause(cheetahPause);
                soundPool.pause(leopardPause);
                soundPool.pause(bearPause);
                soundPool.pause(polarPause);
                soundPool.pause(wolfPause);
                soundPool.pause(foxPause);
                soundPool.pause(deerPause);
                soundPool.pause(crocoPause);
                soundPool.pause(giraffePause);
                soundPool.pause(zebraPause);
                soundPool.pause(turtlePause);
                soundPool.pause(snakePause);
                break;
            case R.id.giraffe:
                giraffePause = soundPool.play(mGiraffe, 1, 1, 1, 0, 1);
                soundPool.pause(tigerPause);
                soundPool.pause(lionPause);
                soundPool.pause(monkeyPause);
                soundPool.pause(gorillaPause);
                soundPool.pause(elephantPause);
                soundPool.pause(bisonPause);
                soundPool.pause(cheetahPause);
                soundPool.pause(leopardPause);
                soundPool.pause(bearPause);
                soundPool.pause(polarPause);
                soundPool.pause(wolfPause);
                soundPool.pause(foxPause);
                soundPool.pause(deerPause);
                soundPool.pause(crocoPause);
                soundPool.pause(pantharPause);
                soundPool.pause(zebraPause);
                soundPool.pause(turtlePause);
                soundPool.pause(snakePause);
                break;
            case R.id.zebra:
                zebraPause = soundPool.play(mZebra, 1, 1, 1, 0, 1);
                soundPool.pause(tigerPause);
                soundPool.pause(lionPause);
                soundPool.pause(monkeyPause);
                soundPool.pause(gorillaPause);
                soundPool.pause(elephantPause);
                soundPool.pause(bisonPause);
                soundPool.pause(cheetahPause);
                soundPool.pause(leopardPause);
                soundPool.pause(bearPause);
                soundPool.pause(polarPause);
                soundPool.pause(wolfPause);
                soundPool.pause(foxPause);
                soundPool.pause(deerPause);
                soundPool.pause(crocoPause);
                soundPool.pause(pantharPause);
                soundPool.pause(giraffePause);
                soundPool.pause(turtlePause);
                soundPool.pause(snakePause);
                break;
            case R.id.turtle:
                turtlePause = soundPool.play(mTurtle, 1, 1, 1, 0, 1);
                soundPool.pause(tigerPause);
                soundPool.pause(lionPause);
                soundPool.pause(monkeyPause);
                soundPool.pause(gorillaPause);
                soundPool.pause(elephantPause);
                soundPool.pause(bisonPause);
                soundPool.pause(cheetahPause);
                soundPool.pause(leopardPause);
                soundPool.pause(bearPause);
                soundPool.pause(polarPause);
                soundPool.pause(wolfPause);
                soundPool.pause(foxPause);
                soundPool.pause(deerPause);
                soundPool.pause(crocoPause);
                soundPool.pause(pantharPause);
                soundPool.pause(giraffePause);
                soundPool.pause(snakePause);
                break;
            case R.id.snake:
                snakePause = soundPool.play(mSnake, 1, 1, 1, 0, 1);
                soundPool.pause(tigerPause);
                soundPool.pause(lionPause);
                soundPool.pause(monkeyPause);
                soundPool.pause(gorillaPause);
                soundPool.pause(elephantPause);
                soundPool.pause(bisonPause);
                soundPool.pause(cheetahPause);
                soundPool.pause(leopardPause);
                soundPool.pause(bearPause);
                soundPool.pause(polarPause);
                soundPool.pause(wolfPause);
                soundPool.pause(foxPause);
                soundPool.pause(deerPause);
                soundPool.pause(crocoPause);
                soundPool.pause(pantharPause);
                soundPool.pause(giraffePause);
                soundPool.pause(turtlePause);
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