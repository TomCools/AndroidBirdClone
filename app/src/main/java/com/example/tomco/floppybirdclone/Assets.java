package com.example.tomco.floppybirdclone;

import com.example.tomco.floppybirdclone.framework.gameloop.Game;
import com.example.tomco.floppybirdclone.framework.gameloop.Graphics;
import com.example.tomco.floppybirdclone.framework.gameloop.Image;

/**
 * Created by tomco on 8/12/2016.
 */

public class Assets {
    public static Image BACKGROUND;
    public static Image GAME_OVER;
    public static Image DOGE;
    public static Image TOTZ;

    public static void load(Game game) {
        BACKGROUND = game.getGraphics().newImage("bg.png", Graphics.ImageFormat.ARGB4444);
        GAME_OVER = game.getGraphics().newImage("game-over.jpg", Graphics.ImageFormat.ARGB4444);
        DOGE = game.getGraphics().newImage("doge.png", Graphics.ImageFormat.ARGB4444);
        TOTZ = game.getGraphics().newImage("totz.gif", Graphics.ImageFormat.RGB565);
    }
}
