package com.example.tomco.floppybirdclone.experiments;

import android.graphics.Color;

import com.example.tomco.floppybirdclone.framework.Game;
import com.example.tomco.floppybirdclone.framework.Graphics;
import com.example.tomco.floppybirdclone.framework.Input;
import com.example.tomco.floppybirdclone.framework.Screen;
import com.example.tomco.floppybirdclone.items.Block;
import com.example.tomco.floppybirdclone.physics.Forces;
import com.example.tomco.floppybirdclone.physics.Vector2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by tomco on 9/12/2016.
 */

public class BlockPullTest extends Screen {
    private List<Block> blocks;

    public BlockPullTest(Game game) {
        super(game);
        this.blocks = generateRandom(game.getGraphics(), 30);
    }

    private List<Block> generateRandom(Graphics g, int amountOfBlocks) {
        Random rand = new Random();
        List<Block> blocks = new ArrayList<>();
        for (int i = 0; i < amountOfBlocks; i++) {
            blocks.add(new Block(new Vector2(rand.nextInt(g.getWidth() * 2), 0), rand.nextInt(100), Color.RED));
        }
        return blocks;
    }

    @Override
    public void update(float deltaTime) {
        pullBlocksIfPressed();
        for (Block block : blocks) {
            block.applyForce(Forces.GRAVITY);
            block.update();
        }

        checkBorders();
    }

    private void checkBorders() {
        for (Block block : blocks) {
            if (block.getLocation().getY() > game.getGraphics().getHeight() - block.getSize()) {
                block.setLocation(new Vector2(block.getLocation().getX(), game.getGraphics().getHeight() - block.getSize()));
            }
        }
    }

    private void pullBlocksIfPressed() {
        List<Input.TouchEvent> events = game.getInput().getTouchEvents();

        if (!events.isEmpty() && game.getInput().isTouchDown(0)) {
            for (Block block : blocks) {
                block.applyForce(TestForces.BLOCK_PULL);
            }
        } else {
            for (Block block : blocks) {
                Vector2 blockVelocity = block.getVelocity();
                block.applyForce(new Vector2(blockVelocity.getX() * -1, 0));
            }
        }
    }

    @Override
    public void paint(float deltaTime) {
        Graphics g = game.getGraphics();
        g.drawRect(-10, -10, g.getWidth() * 2, g.getHeight() * 2, Color.BLACK);
        for (Block block : blocks) {
            block.draw(g);
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
