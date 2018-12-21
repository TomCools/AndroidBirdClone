package com.example.tomco.floppybirdclone.items;

import android.graphics.Color;

import com.example.tomco.floppybirdclone.framework.gameloop.Graphics;
import com.example.tomco.floppybirdclone.framework.physics.BoundingBox;
import com.example.tomco.floppybirdclone.framework.physics.Collisionable;
import com.example.tomco.floppybirdclone.framework.physics.Drawable;
import com.example.tomco.floppybirdclone.framework.physics.Vector2;

import java.util.Collection;
import java.util.Collections;

public class Border extends Drawable implements Collisionable {

    private int HEIGHT = 10;

    public Border(Vector2 location) {
        super(location);
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(location.getX(), location.getY(), g.getWidth(), HEIGHT, Color.GRAY);
    }

    @Override
    public Collection<BoundingBox> hitBoxes() {
        return Collections.singleton(new BoundingBox(location.getX(), location.getY(), 100, HEIGHT));
    }
}
