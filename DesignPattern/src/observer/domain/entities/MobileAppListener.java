package observer.domain.entities;

import observer.domain.EventListener;

public class MobileAppListener implements EventListener {

    private final String username;

    public MobileAppListener(String username) {
        this.username = username;
    }

    @Override
    public void update() {
        System.out.println("Sending notification to mobile app for user: "
                + this.username);
    }
}
