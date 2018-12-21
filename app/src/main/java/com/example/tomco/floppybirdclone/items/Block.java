package com.example.tomco.floppybirdclone.items;

import com.example.tomco.floppybirdclone.framework.gameloop.Graphics;
import com.example.tomco.floppybirdclone.framework.physics.Drawable;
import com.example.tomco.floppybirdclone.framework.physics.Vector2;


public class Block extends Drawable {
    private int size;
    private int color;

    public Block(Vector2 location, int size, int color) {
        super(location);
        this.size = size;
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(location.getX(), location.getY(), size, size, color);
    }

    public int getSize() {
        return size;
    }
}
