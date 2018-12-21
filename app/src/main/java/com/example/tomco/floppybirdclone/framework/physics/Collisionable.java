package com.example.tomco.floppybirdclone.framework.physics;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.Collection;

public interface Collisionable {
    Collection<BoundingBox> hitBoxes();

    @RequiresApi(api = Build.VERSION_CODES.N)
    default boolean collidesWith(Collisionable collisionable) {
        Collection<BoundingBox> externalBoxes = collisionable.hitBoxes();
        Collection<BoundingBox> currentObjectBoxes = hitBoxes();
        for (BoundingBox externalBox : externalBoxes) {
            for (BoundingBox currentObjectBox : currentObjectBoxes) {
                if(externalBox.collidesWith(currentObjectBox)) {
                    return true;
                }
            }
        }
        return false;
    }
}
