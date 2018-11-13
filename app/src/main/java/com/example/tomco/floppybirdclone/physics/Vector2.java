package com.example.tomco.floppybirdclone.physics;

public class Vector2 {
    float x;
    float y;

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    Vector2 copy() {
        return new Vector2(x,y);
    }

    void add(Vector2 v) {
        x += v.x;
        y += v.y;
    }

    void sub(Vector2 v) {
        x -= v.x;
        y -= v.y;
    }

    void mult(float n) {
        x *= n;
        y *= n;
    }

    void div(float n) {
        x /= n;
        y /= n;
    }

    float mag() {
        return new Float(Math.sqrt(x * x + y * y));
    }

    void normalize() {
        float m = mag();
        if (m != 0) {
            div(m);
        }
    }

    public int getX() {
        return new Float(x).intValue();
    }

    public int getY() {
        return new Float(y).intValue();
    }

    public void limit(float max) {
        float mag = mag();
        if (mag > max) {
            float ratio = max / mag;
            mult(ratio);
        }
    }
}
