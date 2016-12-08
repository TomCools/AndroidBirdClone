package com.example.tomco.floppybirdclone.physics;

import java.util.Collection;

/**
 * Created by tomco on 6/12/2016.
 */

public interface Collisionable {
    Collection<BoundingBox> hitBoxes();
}
