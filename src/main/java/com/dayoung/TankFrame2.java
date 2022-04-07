package com.dayoung;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by
 *
 * @author Dayoung
 * @date 2022/3/31 16:09
 */
public class TankFrame2 extends Frame {

    Tank tank1=new Tank(200,200);
    Bullet bullet=new Bullet(tank1);

    public TankFrame2() throws HeadlessException {
        setVisible(true);
        setResizable(false);
        setTitle("Tank War");
        setSize(800,1000);
        addKeyListener(new MyKeyListener());

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });//窗口可关

    }

    @Override
    public void paint(Graphics g) {
        tank1.paint(g);
        bullet.paint(g);
    }


    class MyKeyListener extends KeyAdapter{
        boolean up   = false;
        boolean down = false;
        boolean left = false;
        boolean right= false;
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
           /* System.out.println(key);
            tank1.setRunning(true);
            if(key==32){
                tank1.setRunning(false);
            }*/
            switch (key){
                case KeyEvent.VK_LEFT:
                    left=true;
                    break;
                case KeyEvent.VK_RIGHT:
                    right=true;
                    break;
                case KeyEvent.VK_UP:
                    up=true;
                    break;
                case KeyEvent.VK_DOWN:
                    down=true;
                    break;
                default:
                    break;
            }
            /*System.out.println("keypress");
            x+=30;*/
            setDir(tank1);
        }
        private void setDir(Tank tank) {
            if(!up&&!down&&!right&&!left){
                tank.setRunning(false);
            }else {
                tank.setRunning(true);
                if(up) {
                    tank.setDir(Dir.Up);
                }
                if(down) {
                    tank.setDir(Dir.Down);
                }
                if(left) {
                    tank.setDir(Dir.Left);
                }
                if(right) {
                    tank.setDir(Dir.Right);
                }
            }



        }
        @Override
        public void keyReleased(KeyEvent e) {
            //y+=30;
            int key = e.getKeyCode();

            switch (key){
                case KeyEvent.VK_LEFT:
                    left=false;
                    break;
                case KeyEvent.VK_RIGHT:
                    right=false;
                    break;
                case KeyEvent.VK_UP:
                    up=false;
                    break;
                case KeyEvent.VK_DOWN:
                    down=false;
                    break;
                default:
                    break;
            }
            setDir(tank1);
        }
    }


}
