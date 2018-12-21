package com.example.tomco.floppybirdclone.framework.gameloop;

/**
 * Created by tomco on 6/12/2016.
 */
public interface Image {
    int getWidth();
    int getHeight();
    Graphics.ImageFormat getFormat();
    void dispose();
}
