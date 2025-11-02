package observer.domain.services;

import observer.domain.EventListener;
import observer.domain.enums.EventType;

import java.util.*;

// Publisher class
public class NotificationService {
    private final Map<EventType, List<EventListener>> customers;

    public NotificationService() {
        this.customers = new HashMap<>();
        Arrays.stream(EventType.values()).forEach(
                eventType ->  customers.put(eventType, new ArrayList<>())
        );
    }

    public void subscribe(EventType eventType, EventListener eventListener) {
        this.customers.get(eventType)
                .add(eventListener);
    }

    public void unsubscribe(EventType eventType, EventListener eventListener) {
        this.customers.get(eventType)
                .remove(eventListener);
    }

    public void notifyCustomers(EventType eventType) {
        this.customers.get(eventType)
                .forEach(EventListener::update);
    }

}
