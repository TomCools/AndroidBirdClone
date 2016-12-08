package com.example.tomco.floppybirdclone.framework.android;

import android.graphics.Bitmap;

import com.example.tomco.floppybirdclone.framework.Graphics;
import com.example.tomco.floppybirdclone.framework.Image;

public class AndroidImage implements Image {
    Bitmap bitmap;
    Graphics.ImageFormat format;

    public AndroidImage(Bitmap bitmap, Graphics.ImageFormat format) {
        this.bitmap = bitmap;
        this.format = format;
    }

    @Override
    public int getWidth() {
        return bitmap.getWidth();
    }

    @Override
    public int getHeight() {
        return bitmap.getHeight();
    }

    @Override
    public Graphics.ImageFormat getFormat() {
        return format;
    }

    @Override
    public void dispose() {
        bitmap.recycle();
    }
}
