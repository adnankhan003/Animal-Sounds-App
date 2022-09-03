package com.example.animalsoundsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;


public class AquaActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private int mSeal, mDolphin, mWhale, mTurtle, mAlligator, mSeaLion, mHippo, mFrog;
    private int sealPause, dolphinPause, whalePause, sea_turtlePause, alligatorPause,
            sea_lionsPause, hippoPause, frogPause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aqua);

        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .build();
        soundPool = new SoundPool.Builder()
                .setMaxStreams(8)
                .setAudioAttributes(audioAttributes)
                .build();

        mSeal = soundPool.load(this,R.raw.seal_sound,1);
        mTurtle = soundPool.load(this,R.raw.turtle_sound,1);
        mDolphin = soundPool.load(this,R.raw.dolphin_sound,1);
        mAlligator = soundPool.load(this,R.raw.alligator_sound,1);
        mHippo = soundPool.load(this,R.raw.hippo_sound,1);
        mWhale = soundPool.load(this,R.raw.whale_sound,1);
        mSeaLion = soundPool.load(this,R.raw.sealion_sound,1);
        mFrog = soundPool.load(this,R.raw.frog_sound,1);
    }

    @SuppressLint("NonConstantResourceId")
    public void playSoundAqua(View v) {
        switch (v.getId()) {
            case R.id.seal:
                sealPause = soundPool.play(mSeal, 1, 1, 1, 2, 1);
                soundPool.pause(sea_turtlePause);
                soundPool.pause(dolphinPause);
                soundPool.pause(alligatorPause);
                soundPool.pause(hippoPause);
                soundPool.pause(whalePause);
                soundPool.pause(sea_lionsPause);
                soundPool.pause(frogPause);
                break;
            case R.id.sea_turtle:
                sea_turtlePause = soundPool.play(mTurtle, 1, 1, 1, 0, 1);
                soundPool.pause(sealPause);
                soundPool.pause(dolphinPause);
                soundPool.pause(alligatorPause);
                soundPool.pause(hippoPause);
                soundPool.pause(whalePause);
                soundPool.pause(sea_lionsPause);
                soundPool.pause(frogPause);
                break;
            case R.id.dolphin:
                dolphinPause = soundPool.play(mDolphin, 1, 1, 1, 0, 1);
                soundPool.pause(sealPause);
                soundPool.pause(sea_turtlePause);
                soundPool.pause(alligatorPause);
                soundPool.pause(hippoPause);
                soundPool.pause(whalePause);
                soundPool.pause(sea_lionsPause);
                soundPool.pause(frogPause);
                break;
            case R.id.alligator:
                alligatorPause = soundPool.play(mAlligator, 1, 1, 1, 0, 1);
                soundPool.pause(sealPause);
                soundPool.pause(sea_turtlePause);
                soundPool.pause(dolphinPause);
                soundPool.pause(hippoPause);
                soundPool.pause(whalePause);
                soundPool.pause(sea_lionsPause);
                soundPool.pause(frogPause);
                break;
            case R.id.hippo:
                hippoPause = soundPool.play(mHippo, 1, 1, 1, 1, 1);
                soundPool.pause(sealPause);
                soundPool.pause(sea_turtlePause);
                soundPool.pause(dolphinPause);
                soundPool.pause(alligatorPause);
                soundPool.pause(whalePause);
                soundPool.pause(sea_lionsPause);
                soundPool.pause(frogPause);
                break;
            case R.id.whale:
                whalePause = soundPool.play(mWhale, 1, 1, 1, 1, 1);
                soundPool.pause(sealPause);
                soundPool.pause(sea_turtlePause);
                soundPool.pause(dolphinPause);
                soundPool.pause(alligatorPause);
                soundPool.pause(hippoPause);
                soundPool.pause(sea_lionsPause);
                soundPool.pause(frogPause);
                break;
            case R.id.sea_lion:
                sea_lionsPause = soundPool.play(mSeaLion, 1, 1, 1, 0, 1);
                soundPool.pause(sealPause);
                soundPool.pause(sea_turtlePause);
                soundPool.pause(dolphinPause);
                soundPool.pause(alligatorPause);
                soundPool.pause(hippoPause);
                soundPool.pause(whalePause);
                soundPool.pause(frogPause);
                break;
            case R.id.frog:
                frogPause = soundPool.play(mFrog, 1, 1, 1, 0, 1);
                soundPool.pause(sealPause);
                soundPool.pause(sea_turtlePause);
                soundPool.pause(dolphinPause);
                soundPool.pause(alligatorPause);
                soundPool.pause(hippoPause);
                soundPool.pause(whalePause);
                soundPool.pause(sea_lionsPause);
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