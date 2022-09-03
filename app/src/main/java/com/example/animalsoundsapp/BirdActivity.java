package com.example.animalsoundsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;


public class BirdActivity extends AppCompatActivity {
    SoundPool soundPool;
    private int mCock, mHen, mParrot, mOwl, mCrow, mPenguin, mDuck, mSparrow,
            mPeacock, mHumming, mFalcon, mToucan, mEagle, mVulture, mWood,
            mCrane, mSwan, mKingfisher, mCuckoo;

    private int cockPause, henPause, parrotPause, owlPause, crowPause,
            penguinPause, duckPause, sparrowPause, peacockPause, hummingPause, falconPause,
            toucanPause, eaglePause, vulturePause, woodPause, cranePause,
            swanPause, kingfisherPause, cuckooPause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird);

        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .build();
        soundPool = new SoundPool.Builder()
                .setMaxStreams(19)
                .setAudioAttributes(audioAttributes)
                .build();

        mCock = soundPool.load(this,R.raw.cock_sound,1);
        mHen = soundPool.load(this,R.raw.hen_sound,1);
        mParrot = soundPool.load(this,R.raw.parrot_sound,1);
        mOwl = soundPool.load(this,R.raw.owl_sound,1);
        mCrow = soundPool.load(this,R.raw.crow_sound,1);
        mPenguin = soundPool.load(this,R.raw.penguin_sound,1);
        mDuck = soundPool.load(this,R.raw.duck_sound,1);
        mSparrow = soundPool.load(this,R.raw.sparrow_sound,1);
        mPeacock = soundPool.load(this,R.raw.peacock_sound,1);
        mHumming = soundPool.load(this,R.raw.humming_sound,1);
        mFalcon = soundPool.load(this,R.raw.falcon_sound,1);
        mToucan = soundPool.load(this,R.raw.toucan_sound,1);
        mEagle = soundPool.load(this,R.raw.eagle_sound,1);
        mVulture = soundPool.load(this,R.raw.vulture_sound,1);
        mWood = soundPool.load(this,R.raw.woodpecker_sound,1);
        mCrane = soundPool.load(this,R.raw.crane_sound,1);
        mSwan = soundPool.load(this,R.raw.swan_sound,1);
        mKingfisher = soundPool.load(this,R.raw.kingfisher_sound,1);
        mCuckoo = soundPool.load(this,R.raw.cuckoo_sound,1);
    }

    @SuppressLint("NonConstantResourceId")
    public void playSoundBird(View v) {
        switch (v.getId()) {
            case R.id.cock:
                cockPause = soundPool.play(mCock, 1, 1, 1, 0, 1);
                soundPool.pause(henPause);
                soundPool.pause(parrotPause);
                soundPool.pause(owlPause);
                soundPool.pause(crowPause);
                soundPool.pause(penguinPause);
                soundPool.pause(duckPause);
                soundPool.pause(sparrowPause);
                soundPool.pause(peacockPause);
                soundPool.pause(hummingPause);
                soundPool.pause(falconPause);
                soundPool.pause(toucanPause);
                soundPool.pause(eaglePause);
                soundPool.pause(vulturePause);
                soundPool.pause(woodPause);
                soundPool.pause(cranePause);
                soundPool.pause(swanPause);
                soundPool.pause(kingfisherPause);
                soundPool.pause(cuckooPause);
                break;
            case R.id.hen:
                henPause = soundPool.play(mHen, 1, 1, 1, 0, 1);
                soundPool.pause(cockPause);
                soundPool.pause(parrotPause);
                soundPool.pause(owlPause);
                soundPool.pause(crowPause);
                soundPool.pause(penguinPause);
                soundPool.pause(duckPause);
                soundPool.pause(sparrowPause);
                soundPool.pause(peacockPause);
                soundPool.pause(hummingPause);
                soundPool.pause(falconPause);
                soundPool.pause(toucanPause);
                soundPool.pause(eaglePause);
                soundPool.pause(vulturePause);
                soundPool.pause(woodPause);
                soundPool.pause(cranePause);
                soundPool.pause(swanPause);
                soundPool.pause(kingfisherPause);
                soundPool.pause(cuckooPause);
                break;
            case R.id.parrot:
                parrotPause = soundPool.play(mParrot, 1, 1, 1, 0, 1);
                soundPool.pause(cockPause);
                soundPool.pause(henPause);
                soundPool.pause(owlPause);
                soundPool.pause(crowPause);
                soundPool.pause(penguinPause);
                soundPool.pause(duckPause);
                soundPool.pause(sparrowPause);
                soundPool.pause(peacockPause);
                soundPool.pause(hummingPause);
                soundPool.pause(falconPause);
                soundPool.pause(toucanPause);
                soundPool.pause(eaglePause);
                soundPool.pause(vulturePause);
                soundPool.pause(woodPause);
                soundPool.pause(cranePause);
                soundPool.pause(swanPause);
                soundPool.pause(kingfisherPause);
                soundPool.pause(cuckooPause);
                break;
            case R.id.owl:
                owlPause = soundPool.play(mOwl, 1, 1, 1, 0, 1);
                soundPool.pause(cockPause);
                soundPool.pause(henPause);
                soundPool.pause(parrotPause);
                soundPool.pause(crowPause);
                soundPool.pause(penguinPause);
                soundPool.pause(duckPause);
                soundPool.pause(sparrowPause);
                soundPool.pause(peacockPause);
                soundPool.pause(hummingPause);
                soundPool.pause(falconPause);
                soundPool.pause(toucanPause);
                soundPool.pause(eaglePause);
                soundPool.pause(vulturePause);
                soundPool.pause(woodPause);
                soundPool.pause(cranePause);
                soundPool.pause(swanPause);
                soundPool.pause(kingfisherPause);
                soundPool.pause(cuckooPause);
                break;
            case R.id.crow:
                crowPause = soundPool.play(mCrow, 1, 1, 1, 0, 1);
                soundPool.pause(cockPause);
                soundPool.pause(henPause);
                soundPool.pause(parrotPause);
                soundPool.pause(owlPause);
                soundPool.pause(penguinPause);
                soundPool.pause(duckPause);
                soundPool.pause(sparrowPause);
                soundPool.pause(peacockPause);
                soundPool.pause(hummingPause);
                soundPool.pause(falconPause);
                soundPool.pause(toucanPause);
                soundPool.pause(eaglePause);
                soundPool.pause(vulturePause);
                soundPool.pause(woodPause);
                soundPool.pause(cranePause);
                soundPool.pause(swanPause);
                soundPool.pause(kingfisherPause);
                soundPool.pause(cuckooPause);
                break;
            case R.id.penguin:
                penguinPause = soundPool.play(mPenguin, 1, 1, 1, 0, 1);
                soundPool.pause(cockPause);
                soundPool.pause(henPause);
                soundPool.pause(parrotPause);
                soundPool.pause(owlPause);
                soundPool.pause(crowPause);
                soundPool.pause(duckPause);
                soundPool.pause(sparrowPause);
                soundPool.pause(peacockPause);
                soundPool.pause(hummingPause);
                soundPool.pause(falconPause);
                soundPool.pause(toucanPause);
                soundPool.pause(eaglePause);
                soundPool.pause(vulturePause);
                soundPool.pause(woodPause);
                soundPool.pause(cranePause);
                soundPool.pause(swanPause);
                soundPool.pause(kingfisherPause);
                soundPool.pause(cuckooPause);
                break;
            case R.id.duck:
                duckPause = soundPool.play(mDuck, 1, 1, 1, 0, 1);
                soundPool.pause(cockPause);
                soundPool.pause(henPause);
                soundPool.pause(parrotPause);
                soundPool.pause(owlPause);
                soundPool.pause(crowPause);
                soundPool.pause(penguinPause);
                soundPool.pause(sparrowPause);
                soundPool.pause(peacockPause);
                soundPool.pause(hummingPause);
                soundPool.pause(falconPause);
                soundPool.pause(toucanPause);
                soundPool.pause(eaglePause);
                soundPool.pause(vulturePause);
                soundPool.pause(woodPause);
                soundPool.pause(cranePause);
                soundPool.pause(swanPause);
                soundPool.pause(kingfisherPause);
                soundPool.pause(cuckooPause);
                break;
            case R.id.sparrow:
                sparrowPause = soundPool.play(mSparrow, 1, 1, 1, 0, 1);
                soundPool.pause(cockPause);
                soundPool.pause(henPause);
                soundPool.pause(parrotPause);
                soundPool.pause(owlPause);
                soundPool.pause(crowPause);
                soundPool.pause(penguinPause);
                soundPool.pause(duckPause);
                soundPool.pause(peacockPause);
                soundPool.pause(hummingPause);
                soundPool.pause(falconPause);
                soundPool.pause(toucanPause);
                soundPool.pause(eaglePause);
                soundPool.pause(vulturePause);
                soundPool.pause(woodPause);
                soundPool.pause(cranePause);
                soundPool.pause(swanPause);
                soundPool.pause(kingfisherPause);
                soundPool.pause(cuckooPause);
                break;
            case R.id.peacock:
                peacockPause = soundPool.play(mPeacock, 1, 1, 1, 0, 1);
                soundPool.pause(cockPause);
                soundPool.pause(henPause);
                soundPool.pause(parrotPause);
                soundPool.pause(owlPause);
                soundPool.pause(crowPause);
                soundPool.pause(penguinPause);
                soundPool.pause(duckPause);
                soundPool.pause(sparrowPause);
                soundPool.pause(hummingPause);
                soundPool.pause(falconPause);
                soundPool.pause(toucanPause);
                soundPool.pause(eaglePause);
                soundPool.pause(vulturePause);
                soundPool.pause(woodPause);
                soundPool.pause(cranePause);
                soundPool.pause(swanPause);
                soundPool.pause(kingfisherPause);
                soundPool.pause(cuckooPause);
                break;
            case R.id.humming_bird:
                hummingPause = soundPool.play(mHumming, 1, 1, 1, 0, 1);
                soundPool.pause(cockPause);
                soundPool.pause(henPause);
                soundPool.pause(parrotPause);
                soundPool.pause(owlPause);
                soundPool.pause(crowPause);
                soundPool.pause(penguinPause);
                soundPool.pause(duckPause);
                soundPool.pause(sparrowPause);
                soundPool.pause(peacockPause);
                soundPool.pause(falconPause);
                soundPool.pause(toucanPause);
                soundPool.pause(eaglePause);
                soundPool.pause(vulturePause);
                soundPool.pause(woodPause);
                soundPool.pause(cranePause);
                soundPool.pause(swanPause);
                soundPool.pause(kingfisherPause);
                soundPool.pause(cuckooPause);
                break;
            case R.id.falcon:
                falconPause = soundPool.play(mFalcon, 1, 1, 1, 0, 1);
                soundPool.pause(cockPause);
                soundPool.pause(henPause);
                soundPool.pause(parrotPause);
                soundPool.pause(owlPause);
                soundPool.pause(crowPause);
                soundPool.pause(penguinPause);
                soundPool.pause(duckPause);
                soundPool.pause(sparrowPause);
                soundPool.pause(peacockPause);
                soundPool.pause(hummingPause);
                soundPool.pause(toucanPause);
                soundPool.pause(eaglePause);
                soundPool.pause(vulturePause);
                soundPool.pause(woodPause);
                soundPool.pause(cranePause);
                soundPool.pause(swanPause);
                soundPool.pause(kingfisherPause);
                soundPool.pause(cuckooPause);
                break;
            case R.id.toucan:
                toucanPause = soundPool.play(mToucan, 1, 1, 1, 0, 1);
                soundPool.pause(cockPause);
                soundPool.pause(henPause);
                soundPool.pause(parrotPause);
                soundPool.pause(owlPause);
                soundPool.pause(crowPause);
                soundPool.pause(penguinPause);
                soundPool.pause(duckPause);
                soundPool.pause(sparrowPause);
                soundPool.pause(peacockPause);
                soundPool.pause(hummingPause);
                soundPool.pause(falconPause);
                soundPool.pause(eaglePause);
                soundPool.pause(vulturePause);
                soundPool.pause(woodPause);
                soundPool.pause(cranePause);
                soundPool.pause(swanPause);
                soundPool.pause(kingfisherPause);
                soundPool.pause(cuckooPause);
                break;
            case R.id.eagle:
                eaglePause = soundPool.play(mEagle, 1, 1, 1, 0, 1);
                soundPool.pause(cockPause);
                soundPool.pause(henPause);
                soundPool.pause(parrotPause);
                soundPool.pause(owlPause);
                soundPool.pause(crowPause);
                soundPool.pause(penguinPause);
                soundPool.pause(duckPause);
                soundPool.pause(sparrowPause);
                soundPool.pause(peacockPause);
                soundPool.pause(hummingPause);
                soundPool.pause(falconPause);
                soundPool.pause(toucanPause);
                soundPool.pause(vulturePause);
                soundPool.pause(woodPause);
                soundPool.pause(cranePause);
                soundPool.pause(swanPause);
                soundPool.pause(kingfisherPause);
                soundPool.pause(cuckooPause);
                break;
            case R.id.vulture:
                vulturePause = soundPool.play(mVulture, 1, 1, 1, 0, 1);
                soundPool.pause(cockPause);
                soundPool.pause(henPause);
                soundPool.pause(parrotPause);
                soundPool.pause(owlPause);
                soundPool.pause(crowPause);
                soundPool.pause(penguinPause);
                soundPool.pause(duckPause);
                soundPool.pause(sparrowPause);
                soundPool.pause(peacockPause);
                soundPool.pause(hummingPause);
                soundPool.pause(falconPause);
                soundPool.pause(toucanPause);
                soundPool.pause(eaglePause);
                soundPool.pause(woodPause);
                soundPool.pause(cranePause);
                soundPool.pause(swanPause);
                soundPool.pause(kingfisherPause);
                soundPool.pause(cuckooPause);
                break;
            case R.id.wood_peeker:
                woodPause = soundPool.play(mWood, 1, 1, 1, 0, 1);
                soundPool.pause(cockPause);
                soundPool.pause(henPause);
                soundPool.pause(parrotPause);
                soundPool.pause(owlPause);
                soundPool.pause(crowPause);
                soundPool.pause(penguinPause);
                soundPool.pause(duckPause);
                soundPool.pause(sparrowPause);
                soundPool.pause(peacockPause);
                soundPool.pause(hummingPause);
                soundPool.pause(falconPause);
                soundPool.pause(toucanPause);
                soundPool.pause(eaglePause);
                soundPool.pause(vulturePause);
                soundPool.pause(cranePause);
                soundPool.pause(swanPause);
                soundPool.pause(kingfisherPause);
                soundPool.pause(cuckooPause);
                break;
            case R.id.crane:
                cranePause = soundPool.play(mCrane, 1, 1, 1, 0, 1);
                soundPool.pause(cockPause);
                soundPool.pause(henPause);
                soundPool.pause(parrotPause);
                soundPool.pause(owlPause);
                soundPool.pause(crowPause);
                soundPool.pause(penguinPause);
                soundPool.pause(duckPause);
                soundPool.pause(sparrowPause);
                soundPool.pause(peacockPause);
                soundPool.pause(hummingPause);
                soundPool.pause(falconPause);
                soundPool.pause(toucanPause);
                soundPool.pause(eaglePause);
                soundPool.pause(vulturePause);
                soundPool.pause(woodPause);
                soundPool.pause(swanPause);
                soundPool.pause(kingfisherPause);
                soundPool.pause(cuckooPause);
                break;
            case R.id.swan:
                swanPause = soundPool.play(mSwan, 1, 1, 1, 0, 1);
                soundPool.pause(cockPause);
                soundPool.pause(henPause);
                soundPool.pause(parrotPause);
                soundPool.pause(owlPause);
                soundPool.pause(crowPause);
                soundPool.pause(penguinPause);
                soundPool.pause(duckPause);
                soundPool.pause(sparrowPause);
                soundPool.pause(peacockPause);
                soundPool.pause(hummingPause);
                soundPool.pause(falconPause);
                soundPool.pause(toucanPause);
                soundPool.pause(eaglePause);
                soundPool.pause(vulturePause);
                soundPool.pause(woodPause);
                soundPool.pause(cranePause);
                soundPool.pause(kingfisherPause);
                soundPool.pause(cuckooPause);
                break;
            case R.id.kingfisher:
                kingfisherPause = soundPool.play(mKingfisher, 1, 1, 1, 0, 1);
                soundPool.pause(cockPause);
                soundPool.pause(henPause);
                soundPool.pause(parrotPause);
                soundPool.pause(owlPause);
                soundPool.pause(crowPause);
                soundPool.pause(penguinPause);
                soundPool.pause(duckPause);
                soundPool.pause(sparrowPause);
                soundPool.pause(peacockPause);
                soundPool.pause(hummingPause);
                soundPool.pause(falconPause);
                soundPool.pause(toucanPause);
                soundPool.pause(eaglePause);
                soundPool.pause(vulturePause);
                soundPool.pause(woodPause);
                soundPool.pause(cranePause);
                soundPool.pause(swanPause);
                soundPool.pause(cuckooPause);
                break;
            case R.id.cuckoo:
                cuckooPause = soundPool.play(mCuckoo, 1, 1, 1, 0, 1);
                soundPool.pause(cockPause);
                soundPool.pause(henPause);
                soundPool.pause(parrotPause);
                soundPool.pause(owlPause);
                soundPool.pause(crowPause);
                soundPool.pause(penguinPause);
                soundPool.pause(duckPause);
                soundPool.pause(sparrowPause);
                soundPool.pause(peacockPause);
                soundPool.pause(hummingPause);
                soundPool.pause(falconPause);
                soundPool.pause(toucanPause);
                soundPool.pause(eaglePause);
                soundPool.pause(vulturePause);
                soundPool.pause(woodPause);
                soundPool.pause(cranePause);
                soundPool.pause(swanPause);
                soundPool.pause(kingfisherPause);
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
