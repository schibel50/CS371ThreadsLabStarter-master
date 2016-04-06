package edu.up.cs301threadslab;

import java.util.Random;

/**
 * Created by schibel17 on 4/6/2016.
 */
public class AddRemoveThread extends Thread {
    private StarAnimation starAnimate;
    Random rand;

    public AddRemoveThread(StarAnimation animate){
        starAnimate = animate;
        rand = new Random();
    }

    @Override
    public void run(){
        while(true) {
            int number = rand.nextInt(100);
            if (number > 50) {
                starAnimate.removeStar();
            } else {
                starAnimate.addStar();
            }
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
