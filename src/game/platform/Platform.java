package game.platform;

import game.GameObject;
import game.Vector2D;
import game.ViewPort;
import game.physics.BoxCollider;
import game.renderer.Renderer;
import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Platform extends GameObject {
    public Platform() {
    }

    public Platform(int x, int y, String url) {
        BufferedImage image = SpriteUtils.loadImage(url);
        renderer = new Renderer(image);
        position.set(x,y);
        hitBox = new BoxCollider(this,image.getWidth()/100,image.getHeight());
    }

    @Override
    public void render(Graphics g, ViewPort viewPort) {
        super.render(g, viewPort);
    }

}
