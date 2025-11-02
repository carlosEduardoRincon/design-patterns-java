package observer.domain.entities;

import observer.domain.EventListener;

public class EmailMsgListener implements EventListener {
    private final String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("Sending email  to: " + this.email);
    }
}
