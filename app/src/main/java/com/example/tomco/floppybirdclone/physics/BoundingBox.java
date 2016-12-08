package com.example.tomco.floppybirdclone.physics;

/**
 * Created by tomco on 6/12/2016.
 */

public class BoundingBox {
    private int x;
    private int y;
    private int width;
    private int height;

    public BoundingBox(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
