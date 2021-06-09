package at.grabher.game.actors;

import at.grabher.game.SnakeGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Shape;

public class ElementSnake extends Element{


    public ElementSnake(int x, int y) {

        super(x, y);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.fillOval(5 * SnakeGame.GRID_SIZE, 5 * SnakeGame.GRID_SIZE, SnakeGame.GRID_SIZE - 1, SnakeGame.GRID_SIZE - 1);

    }

}
