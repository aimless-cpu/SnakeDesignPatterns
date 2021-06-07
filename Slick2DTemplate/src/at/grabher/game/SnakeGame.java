package at.grabher.game;

import at.grabher.game.actors.Element;
import at.grabher.game.actors.ElementSnake;
import org.newdawn.slick.*;

import java.util.LinkedList;
import java.util.List;

public class SnakeGame extends BasicGame {

    public static final int GRID_SIZE = 40;
    public static final int CLOCK = 500;



    public SnakeGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
//        for (ElementSnake elementSnake : this.snakeList) {
//            elementSnake.update(gameContainer, delta);
//        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
//        for (ElementSnake elementSnake : this.snakeList) {
//            elementSnake.render(gameContainer, graphics);
//        }
//        test.render(gameContainer, graphics);

    }

    public static void main (String[]argv){

        try {
            AppGameContainer container = new AppGameContainer(new SnakeGame("plain snake DesignPatterns"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
