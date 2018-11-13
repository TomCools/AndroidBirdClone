package com.example.tomco.floppybirdclone.physics;

import com.example.tomco.floppybirdclone.framework.Graphics;

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

    public Vector2 getLocation() {
        return location;
    }

    public void setLocation(Vector2 location) {
        this.location = location;
    }

    public Vector2 getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector2 velocity) {
        this.velocity = velocity;
    }

    public abstract void draw(Graphics g);


}
