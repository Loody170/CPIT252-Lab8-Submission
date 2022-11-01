package edu.kau.fcit.cpit252.observers;

public class FacebookObserver extends Observer{
    public FacebookObserver(String Receiver) {
        super(Receiver);
    }

    @Override
    public void update(String message) {
        //TODO send a post
        System.out.println("send a facebook message");
    }
}
