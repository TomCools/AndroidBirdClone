package com.example.tomco.floppybirdclone.items;

import android.graphics.Color;

import com.example.tomco.floppybirdclone.framework.Graphics;
import com.example.tomco.floppybirdclone.physics.BoundingBox;
import com.example.tomco.floppybirdclone.physics.Collisionable;
import com.example.tomco.floppybirdclone.physics.Drawable;
import com.example.tomco.floppybirdclone.physics.Vector2;

import java.util.Collection;


public class Player extends Drawable {
    private int color;
    private int size;

    public Player(Vector2 location, int color) {
        super(location);
        this.color = color;
        this.size = 40;
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(location.getX(), location.getY(), size, size, color);
    }

    public boolean collidesWith(Collisionable collisionable) {
        Collection<BoundingBox> boxes = collisionable.hitBoxes();
        for (BoundingBox box : boxes) {
            if(location.getX() < box.getX() + box.getWidth() &&
                    location.getX() + size > box.getX() &&
                    location.getY() < box.getY() + box.getHeight() &&
                    location.getY() + size > box.getY()) {
                return true;
            }
        }
        return false;
    }
}
