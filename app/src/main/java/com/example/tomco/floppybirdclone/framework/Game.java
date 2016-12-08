package com.example.tomco.floppybirdclone.framework;

/**
 * Created by tomco on 6/12/2016.
 */

public interface Game {

    public Audio getAudio();

    public Input getInput();

    public FileIO getFileIO();

    public Graphics getGraphics();

    public void setScreen(Screen screen);

    public Screen getCurrentScreen();

    public Screen getInitScreen();
}