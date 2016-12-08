package com.example.tomco.floppybirdclone;

import android.graphics.Color;

import com.example.tomco.floppybirdclone.framework.Game;
import com.example.tomco.floppybirdclone.framework.Graphics;
import com.example.tomco.floppybirdclone.framework.Input;
import com.example.tomco.floppybirdclone.framework.Screen;
import com.example.tomco.floppybirdclone.items.Player;
import com.example.tomco.floppybirdclone.items.Border;
import com.example.tomco.floppybirdclone.items.Wall;
import com.example.tomco.floppybirdclone.physics.Forces;
import com.example.tomco.floppybirdclone.physics.Vector2;

import java.util.List;

public class GameScreen extends Screen {
    private Player player;
    private Border floor;
    private Border roof;
    private WallManager walls;

    public GameScreen(Game game) {
        super(game);
        player = new Player(new Vector2(20, 20), Color.GREEN);
        floor = new Border(new Vector2(0, game.getGraphics().getHeight() - 10));
        roof = new Border(new Vector2(0, 0));
        walls = new WallManager(game);
    }

    @Override
    public void update(float deltaTime) {
        checkColision();
        handleTouch();

        walls.update();

        player.applyForce(Forces.GRAVITY);
        player.update();
    }

    private void checkColision() {
        if (player.collidesWith(floor) || player.collidesWith(roof) || collidesWithWalls()) {
            game.setScreen(new GameOverScreen(game));
        }
    }

    private boolean collidesWithWalls() {
        for (Wall wall : walls.getWalls()) {
            if (player.collidesWith(wall)) {
                return true;
            }
        }
        return false;
    }

    private void handleTouch() {
        List<Input.TouchEvent> touchEvents = game.getInput().getTouchEvents();
        if (!touchEvents.isEmpty()) {
            Input.TouchEvent event = touchEvents.get(0);
            if (event.type == Input.TouchEvent.TOUCH_DOWN) {
                player.applyForce(Forces.JUMP);
            }
        }
    }

    @Override
    public void paint(float deltaTime) {
        Graphics graphics = game.getGraphics();
        graphics.clearScreen(Color.BLACK);

        floor.draw(graphics);
        player.draw(graphics);

        for (Wall wall : walls.getWalls()) {
            wall.draw(graphics);
        }

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
