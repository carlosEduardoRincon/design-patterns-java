package factory.domain;

import factory.domain.services.Notificacao;
import factory.domain.services.impl.EmailNotificacao;
import factory.domain.services.impl.SMSNotificacao;
import factory.domain.services.impl.WhatsappNotificacao;

public class NotificacaoFactory {

    public static Notificacao criaNotificacao(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            throw new IllegalArgumentException("Tipo de notificação deve ser preenchido.");
        }

        return switch (tipo.toLowerCase()) {
            case "e-mail" -> new EmailNotificacao();
            case "whatsapp" -> new WhatsappNotificacao();
            case "sms" -> new SMSNotificacao();
            default -> throw new IllegalArgumentException("Tipo de notificação inválido");
        };
    }
}
