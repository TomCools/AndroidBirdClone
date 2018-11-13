package com.example.tomco.floppybirdclone.physics;

/**
 * Created by tomco on 6/12/2016.
 */

public class Forces {
    public static final Vector2 GRAVITY = new Vector2(0, 0.45f);
    public static final Vector2 JUMP = new Vector2(0, -15f);
    public static final Vector2 PULL_WALL = new Vector2(-1f, 0);

    public static Vector2 fullstop() {
        return new Vector2(0, 0);
    }
}
