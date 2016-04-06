package edu.up.cs301threadslab;

/**
 * Created by schibel17 on 4/6/2016.
 */
public class StarThread extends Thread {
    private AnimationView myAnimation;

    public StarThread(AnimationView animate){
        myAnimation = animate;
    }

    @Override
    public void run(){
        while(true){
            myAnimation.postInvalidate();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
