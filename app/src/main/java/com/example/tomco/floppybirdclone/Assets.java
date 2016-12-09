package com.example.tomco.floppybirdclone;

import com.example.tomco.floppybirdclone.framework.Game;
import com.example.tomco.floppybirdclone.framework.Graphics;
import com.example.tomco.floppybirdclone.framework.Image;

/**
 * Created by tomco on 8/12/2016.
 */

public class Assets {
    public static Image BACKGROUND;
    public static Image GAME_OVER;
    public static Image DOGE;

    public static void load(Game game) {
        BACKGROUND = game.getGraphics().newImage("bg.png", Graphics.ImageFormat.ARGB4444);
        GAME_OVER = game.getGraphics().newImage("game-over.jpg", Graphics.ImageFormat.ARGB4444);
        DOGE = game.getGraphics().newImage("doge.png", Graphics.ImageFormat.ARGB4444);
    }
}