package com.example.tomco.floppybirdclone;

import android.graphics.Color;
import android.graphics.Paint;

import com.example.tomco.floppybirdclone.framework.Game;
import com.example.tomco.floppybirdclone.framework.Graphics;
import com.example.tomco.floppybirdclone.framework.Input;
import com.example.tomco.floppybirdclone.framework.Screen;

import java.util.List;

public class GameOverScreen extends Screen {
    public GameOverScreen(Game game) {
        super(game);
    }

    @Override
    public void update(float deltaTime) {
        List<Input.TouchEvent> events = game.getInput().getTouchEvents();

        if (!events.isEmpty()) {
            game.setScreen(new GameScreen(game));
        }
    }

    @Override
    public void paint(float deltaTime) {
        Graphics g = game.getGraphics();
        g.clearScreen(Color.BLACK);

        Paint paint = new Paint();
        paint.setColor(Color.MAGENTA);
        paint.setTextSize(60);
        g.drawString("GAME OVER", g.getWidth() / 2, g.getHeight() / 2, paint);
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
