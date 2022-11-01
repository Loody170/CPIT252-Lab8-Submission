package edu.kau.fcit.cpit252.observers;

public class TwitterObserver extends Observer{


    public TwitterObserver(String Receiver) {
        super(Receiver);
    }

    @Override
    public void update(String message) {
        //todo send a tweet
        System.out.println("send a tweet");

    }

}
