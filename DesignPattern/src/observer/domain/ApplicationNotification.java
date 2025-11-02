package observer.domain;

import observer.domain.entities.EmailMsgListener;
import observer.domain.entities.MobileAppListener;
import observer.domain.enums.EventType;
import observer.domain.services.StoreService;

public class ApplicationNotification {

    public static void main(String[] args) {
        var store = new StoreService();
        store.getService().subscribe(
                EventType.SALE,
                new EmailMsgListener("carlos@email.com")
        );

        store.getService().subscribe(
                EventType.NEW_ITEM,
                new MobileAppListener("carlos123")
        );

        store.newItemPromotion(EventType.NEW_ITEM);
        store.newItemPromotion(EventType.SALE);
    }
}
