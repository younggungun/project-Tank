package com.dayoung;

import java.awt.*;

/**
 * Created by
 *
 * @author Dayoung
 * @date 2022/4/2 14:15
 */
public class Tank {
    private int x,y;
    private Dir dir=Dir.Up;
    private static final int speed = 5;
    private boolean running=false;
    public Tank(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }
    public void paint(Graphics g){
        g.fillRect(x,y,50,50);
        if(running){
            tankMove();
        }
    }

    private void tankMove() {
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
