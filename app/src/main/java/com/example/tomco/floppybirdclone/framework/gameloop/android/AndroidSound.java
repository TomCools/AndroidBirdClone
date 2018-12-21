package com.example.tomco.floppybirdclone.framework.gameloop.android;

import android.media.SoundPool;

import com.example.tomco.floppybirdclone.framework.gameloop.Sound;

/**
 * Created by tomco on 6/12/2016.
 */

public class AndroidSound implements Sound {
    int soundId;
    SoundPool soundPool;

    public AndroidSound(SoundPool soundPool, int soundId) {
        this.soundId = soundId;
        this.soundPool = soundPool;
    }

    @Override
    public void play(float volume) {
        soundPool.play(soundId, volume, volume, 0, 0, 1);
    }

    @Override
    public void dispose() {
        soundPool.unload(soundId);
    }

}
