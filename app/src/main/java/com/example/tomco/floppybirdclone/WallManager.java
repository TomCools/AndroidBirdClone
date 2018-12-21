package com.example.tomco.floppybirdclone;

import com.example.tomco.floppybirdclone.framework.gameloop.Game;
import com.example.tomco.floppybirdclone.items.Wall;
import com.example.tomco.floppybirdclone.framework.physics.Forces;
import com.example.tomco.floppybirdclone.framework.physics.Vector2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WallManager {
    private final static Random RANDOM = new Random();
    private List<Wall> walls;
    private Wall previousWall;
    private Game game;

    public WallManager(Game game) {
        walls = new ArrayList<>();
        this.game = game;
    }

    public void update() {
        if (previousWall == null || previousWall.getLocation().getX() < game.getGraphics().getWidth() - (game.getGraphics().getWidth() / 3)) {
            spawnWall();
        }

        for (Wall wall : getWalls()) {
            wall.applyForce(Forces.PULL_WALL);
            wall.update();
        }
    }

    public void spawnWall() {
        Wall wall = new Wall(new Vector2(game.getGraphics().getWidth() + 10, 0), RANDOM.nextInt(game.getGraphics().getHeight() / 3 * 2));
        walls.add(wall);
        previousWall = wall;
    }

    public List<Wall> getWalls() {
        return new ArrayList<>(walls);
    }
}
