package com.example.tomco.floppybirdclone.framework;

/**
 * Created by tomco on 6/12/2016.
 */
public interface Image {
    public int getWidth();
    public int getHeight();
    public Graphics.ImageFormat getFormat();
    public void dispose();
}
