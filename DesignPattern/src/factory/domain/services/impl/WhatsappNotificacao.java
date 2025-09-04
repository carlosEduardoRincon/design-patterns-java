package factory.domain.services.impl;

import factory.domain.services.Notificacao;

public class WhatsappNotificacao extends Notificacao {

    @Override
    public void enviaMensagem(String message) {
        System.out.println("Whatsapp: " + message);
    }
}
