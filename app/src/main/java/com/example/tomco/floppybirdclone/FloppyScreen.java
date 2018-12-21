package com.example.tomco.floppybirdclone;

import android.graphics.Color;

import com.example.tomco.floppybirdclone.framework.gameloop.Game;
import com.example.tomco.floppybirdclone.framework.gameloop.Graphics;
import com.example.tomco.floppybirdclone.framework.gameloop.Input;
import com.example.tomco.floppybirdclone.framework.gameloop.Screen;
import com.example.tomco.floppybirdclone.items.Background;
import com.example.tomco.floppybirdclone.items.Border;
import com.example.tomco.floppybirdclone.items.Player;
import com.example.tomco.floppybirdclone.items.Wall;
import com.example.tomco.floppybirdclone.framework.physics.Forces;
import com.example.tomco.floppybirdclone.framework.physics.Vector2;

import java.util.List;

public class FloppyScreen extends Screen {
    private Player player;
    private Border floor;
    private Border roof;
    private WallManager walls;
    private Background background;

    public FloppyScreen(Game game) {
        super(game);
        this.player = new Player(new Vector2(20, 20));
        this.floor = new Border(new Vector2(0, game.getGraphics().getHeight() - 10));
        this.roof = new Border(new Vector2(0, 0));
        this.walls = new WallManager(game);
        this.background = new Background(new Vector2(0, 0));

        Assets.load(game);
    }

    @Override
    public void update(float deltaTime) {
        checkColision();
        handleTouch();

        background.update();
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

        background.draw(graphics);

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
