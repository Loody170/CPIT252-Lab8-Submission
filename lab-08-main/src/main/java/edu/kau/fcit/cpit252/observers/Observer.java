package edu.kau.fcit.cpit252.observers;

public abstract class Observer {
    private String receiver;
    public Observer(String Receiver){
        this.receiver = Receiver;
    }

    public String getReceiver() {
        return receiver;
    }

    public abstract void update (String message);
}
