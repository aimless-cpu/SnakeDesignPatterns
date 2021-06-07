package at.grabher.game.actors;

public abstract class Element implements CollisionActor{
    private int x,y;

    public Element(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
