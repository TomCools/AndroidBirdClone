package com.example.tomco.floppybirdclone.physics;

import com.example.tomco.floppybirdclone.framework.Graphics;

/**
 * Created by tomco on 6/12/2016.
 */

public abstract class Drawable {
    protected Vector2 location;
    protected Vector2 velocity;

    public Drawable(Vector2 location) {
        this.location = location;
        this.velocity = new Vector2(0, 0);
    }

    public void applyForce(Vector2 acceleration) {
        velocity.add(acceleration);
    }

    public void update() {
        location.add(velocity);
    }

    public abstract void draw(Graphics g);


}
