package factory.domain.services.impl;

import factory.domain.services.Notificacao;

public class EmailNotificacao extends Notificacao {

    @Override
    public void enviaMensagem(String message) {
        System.out.println("E-mail: " + message);
    }
}
