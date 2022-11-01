package edu.kau.fcit.cpit252.observers;

public class WhatsappObserver extends Observer{


    public WhatsappObserver(String Receiver) {
        super(Receiver);
    }

    @Override
    public void update(String message) {
        //todo send a whatsapp
        System.out.println("send a whatsapp message");

    }
}
