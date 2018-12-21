package com.example.tomco.floppybirdclone.framework.gameloop.android;

import java.util.List;

import android.view.View.OnTouchListener;

import com.example.tomco.floppybirdclone.framework.gameloop.Input;

public interface TouchHandler extends OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<Input.TouchEvent> getTouchEvents();
}
