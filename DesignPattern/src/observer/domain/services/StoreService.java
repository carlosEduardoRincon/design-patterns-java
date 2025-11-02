package observer.domain.services;

import observer.domain.enums.EventType;

public class StoreService {
    private final NotificationService notificationService;

    public StoreService() {
        this.notificationService = new NotificationService();
    }

    public NotificationService getService() {
        return this.notificationService;
    }

    public void newItemPromotion(EventType eventType) {
        this.notificationService.notifyCustomers(eventType);
    }
}
