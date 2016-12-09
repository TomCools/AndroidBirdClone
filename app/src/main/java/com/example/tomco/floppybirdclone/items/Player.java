package com.example.tomco.floppybirdclone.items;

import com.example.tomco.floppybirdclone.Assets;
import com.example.tomco.floppybirdclone.framework.Graphics;
import com.example.tomco.floppybirdclone.framework.android.AndroidGraphics;
import com.example.tomco.floppybirdclone.physics.BoundingBox;
import com.example.tomco.floppybirdclone.physics.Collisionable;
import com.example.tomco.floppybirdclone.physics.Drawable;
import com.example.tomco.floppybirdclone.physics.Vector2;

import java.util.Collection;


public class Player extends Drawable {
    private int size;

    public Player(Vector2 location) {
        super(location);
        this.size = 100;
    }

    @Override
    public void draw(Graphics g) {
        ((AndroidGraphics) g).drawScaledImage(Assets.DOGE, location.getX(), location.getY(), size, size);
        //g.drawRect(location.getX(), location.getY(), size, size, color);
    }

    public boolean collidesWith(Collisionable collisionable) {
        Collection<BoundingBox> boxes = collisionable.hitBoxes();
        for (BoundingBox box : boxes) {
            if (location.getX() < box.getX() + box.getWidth() &&
                    location.getX() + size > box.getX() &&
                    location.getY() < box.getY() + box.getHeight() &&
                    location.getY() + size > box.getY()) {
                return true;
            }
        }
        return false;
    }
}
