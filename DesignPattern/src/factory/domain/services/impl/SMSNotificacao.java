package factory.domain.services.impl;

import factory.domain.services.Notificacao;

public class SMSNotificacao extends Notificacao {

    @Override
    public void enviaMensagem(String message) {
        System.out.println("SMS: " + message);
    }
}
