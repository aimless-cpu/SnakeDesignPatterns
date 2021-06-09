package at.grabher.game.actors;

import org.newdawn.slick.geom.Shape;

public abstract class CollisionActor implements Actor{

    private Shape collisionShape;

    public CollisionActor() {
    }



    public Shape getCollisionShape() {
        return collisionShape;
    }

    public void setCollisionShape(Shape collisionShape) {
        this.collisionShape = collisionShape;
    }
}
