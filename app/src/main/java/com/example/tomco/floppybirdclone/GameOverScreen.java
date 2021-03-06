package com.example.tomco.floppybirdclone;

import com.example.tomco.floppybirdclone.framework.gameloop.Game;
import com.example.tomco.floppybirdclone.framework.gameloop.Graphics;
import com.example.tomco.floppybirdclone.framework.gameloop.Input;
import com.example.tomco.floppybirdclone.framework.gameloop.Screen;
import com.example.tomco.floppybirdclone.framework.gameloop.android.AndroidGraphics;

import java.util.List;

public class GameOverScreen extends Screen {
    public GameOverScreen(Game game) {
        super(game);
    }

    @Override
    public void update(float deltaTime) {
        List<Input.TouchEvent> events = game.getInput().getTouchEvents();

        if (!events.isEmpty()) {
            game.setScreen(new FloppyScreen(game));
        }
    }

    @Override
    public void paint(float deltaTime) {
        Graphics g = game.getGraphics();
        ((AndroidGraphics) g).drawScaledFullScreen(Assets.GAME_OVER);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void backButton() {

    }
}
