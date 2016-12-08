package com.example.tomco.floppybirdclone.items;

import android.graphics.Color;

import com.example.tomco.floppybirdclone.framework.Graphics;
import com.example.tomco.floppybirdclone.physics.BoundingBox;
import com.example.tomco.floppybirdclone.physics.Collisionable;
import com.example.tomco.floppybirdclone.physics.Drawable;
import com.example.tomco.floppybirdclone.physics.Vector2;

import java.util.Arrays;
import java.util.Collection;

public class Wall extends Drawable implements Collisionable {

    private int WALL_WIDTH = 10;
    private int WALL_HEIGHT = 3000;
    private int GAP_SIZE = 200;
    private int WALL_SPEED_LIMIT = 3;

    private Collection<BoundingBox> hitBoxes;
    private int gapLocation;

    public Wall(Vector2 location, int gaplocation) {
        super(location);
        determineHitboxes();
        this.gapLocation = gaplocation;
    }

    private void determineHitboxes() {
        hitBoxes = Arrays.asList(new BoundingBox(location.getX(), location.getY(), WALL_WIDTH, gapLocation),
                new BoundingBox(location.getX(), location.getY() + gapLocation + GAP_SIZE, WALL_WIDTH, WALL_HEIGHT));
    }

    @Override
    public void draw(Graphics g) {
        for (BoundingBox hitBox : hitBoxes) {
            drawBox(g, hitBox);
        }
    }

    private void drawBox(Graphics g, BoundingBox box) {
        g.drawRect(box.getX(), box.getY(), box.getWidth(), box.getHeight(), Color.CYAN);
    }

    @Override
    public void applyForce(Vector2 acceleration) {
        super.applyForce(acceleration);
        velocity.limit(WALL_SPEED_LIMIT);
    }

    @Override
    public void update() {
        super.update();
        this.determineHitboxes();
    }

    @Override
    public Collection<BoundingBox> hitBoxes() {
        return hitBoxes;
    }

    public Vector2 getLocation() {
        return super.location;
    }
}
