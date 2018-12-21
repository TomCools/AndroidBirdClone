package com.example.tomco.floppybirdclone.items;

import com.example.tomco.floppybirdclone.Assets;
import com.example.tomco.floppybirdclone.framework.gameloop.Graphics;
import com.example.tomco.floppybirdclone.framework.gameloop.android.AndroidGraphics;
import com.example.tomco.floppybirdclone.framework.physics.Drawable;
import com.example.tomco.floppybirdclone.framework.physics.Vector2;

public class Background extends Drawable {
    public Background(Vector2 location) {
        super(location);
        velocity = new Vector2(-1.0f, 0f);
    }

    @Override
    public void draw(Graphics g) {
        ((AndroidGraphics) g).drawScaledImage(Assets.BACKGROUND, location.getX(), location.getY(), g.getWidth(), g.getHeight());
        ((AndroidGraphics) g).drawScaledImage(Assets.BACKGROUND, location.getX() + g.getWidth(), location.getY(), g.getWidth(), g.getHeight());
    }
}
