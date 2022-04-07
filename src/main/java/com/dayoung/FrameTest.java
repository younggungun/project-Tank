package com.dayoung;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by
 *
 * @author Dayoung
 * @date 2022/3/31 15:09
 */
public class FrameTest {
    public static void main(String[] args) throws InterruptedException {
        TankFrame2 tankFrame2 = new TankFrame2();
        while (true){
            Thread.sleep(50);
            tankFrame2.repaint();
        }
    }
}
