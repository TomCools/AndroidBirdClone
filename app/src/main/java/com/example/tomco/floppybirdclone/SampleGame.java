package com.example.tomco.floppybirdclone;

import com.example.tomco.floppybirdclone.framework.gameloop.Screen;
import com.example.tomco.floppybirdclone.framework.gameloop.android.AndroidGame;


public class SampleGame extends AndroidGame {
    @Override
    public Screen getInitScreen() {
        return new FloppyScreen(this);
    }
}
