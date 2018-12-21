package com.example.tomco.floppybirdclone.items;

import android.graphics.Color;

import com.example.tomco.floppybirdclone.Assets;
import com.example.tomco.floppybirdclone.framework.gameloop.Graphics;
import com.example.tomco.floppybirdclone.framework.gameloop.android.AndroidGraphics;
import com.example.tomco.floppybirdclone.framework.physics.BoundingBox;
import com.example.tomco.floppybirdclone.framework.physics.Collisionable;
import com.example.tomco.floppybirdclone.framework.physics.Drawable;
import com.example.tomco.floppybirdclone.framework.physics.Vector2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class Player extends Drawable implements Collisionable {
    private int size;

    public Player(Vector2 location) {
        super(location);
        this.size = 75;
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(location.getX(), location.getY(), size, size, Color.DKGRAY);
        ((AndroidGraphics) g).drawScaledImage(Assets.TOTZ, location.getX(), location.getY(), size, size);
    }

    @Override
    public Collection<BoundingBox> hitBoxes() {
        return Collections.singleton(new BoundingBox(location.getX(), location.getY(), size, size));
    }
}
