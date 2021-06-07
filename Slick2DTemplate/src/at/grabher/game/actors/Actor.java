package at.grabher.game.actors;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public interface Actor {
    public void update(GameContainer gameContainer, int delta) throws SlickException;
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException;
}
