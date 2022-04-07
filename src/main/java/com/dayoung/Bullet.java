package com.dayoung;

import java.awt.*;

/**
 * Created by
 *
 * @author Dayoung
 * @date 2022/4/3 13:49
 */
public class Bullet {
    private static final int speed =1;
    private static final  int Height=20,Width=20;
    private int x,y;
    private Dir dir;
    private Tank tank;

    public Bullet(Tank tank) {
        this.tank=tank;
        this.dir=tank.getDir();
        this.x=tank.getX();
        this.y=tank.getY();
    }
    public void paint(Graphics g){
       g.setColor(Color.red);
       g.fillOval(x,y,Width,Height);
       bulletMove();
    }

    private void bulletMove() {
        switch (dir){
            case Up:
                y-=speed;
                break;
            case Down:
                y+=speed;
                break;
            case Right:
                x+=speed;
                break;
            case Left:
                x-=speed;
                break;
            default:
                break;
        }
    }
}
