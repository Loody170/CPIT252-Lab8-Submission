package edu.kau.fcit.cpit252.observers;

import edu.kau.fcit.cpit252.utils.SendEmail;

public class EmailObserver extends Observer{


    public EmailObserver(String Receiver) {
        super(Receiver);
    }

    @Override
    public void update(String message) {
        //todo send an email
        SendEmail.send("Price changed", "Price changed!! test for CPIT252 LAB8 :)", super.getReceiver());
//not working
    }
}
