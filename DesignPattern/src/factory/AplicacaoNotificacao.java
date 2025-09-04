package factory;

import factory.domain.NotificacaoFactory;
import factory.domain.services.Notificacao;

public class AplicacaoNotificacao {
    public static void main(String[] args) {
        var tipo = "SMS";
        var mensagem =  "Olá mundo!";

        Notificacao notificacao = NotificacaoFactory.criaNotificacao(tipo);
        notificacao.enviaMensagem(mensagem);
    }
}
