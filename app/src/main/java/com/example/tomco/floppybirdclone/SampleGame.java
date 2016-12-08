package com.example.tomco.floppybirdclone;

import com.example.tomco.floppybirdclone.framework.Screen;
import com.example.tomco.floppybirdclone.framework.android.AndroidGame;


public class SampleGame extends AndroidGame {
    @Override
    public Screen getInitScreen() {
        return new GameScreen(this);
    }
}
