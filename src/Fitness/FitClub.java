package Fitness;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class FitClub {
    private final int capasityOfLocation = 20;


    LocalDate nowDate = LocalDate.now();
    /*private TypeOfSub oneTime = new TypeOfSub(nowDate.plusDays(1),TypeOfLocation.GYM,TypeOfLocation.POOL, LocalTime.of(22,0));
    private TypeOfSub day = new TypeOfSub(nowDate.plusDays(7),TypeOfLocation.GYM,TypeOfLocation.HALL,LocalTime.of(16,0));
    private TypeOfSub full = new TypeOfSub(nowDate.plusDays(30),TypeOfLocation.GYM,TypeOfLocation.HALL,TypeOfLocation.POOL,LocalTime.of(22,0));*/



    private List<Subscription> gymSubscriptions = new ArrayList<>();

    private List<Subscription> poolSubscriptions = new ArrayList<>();
    private List<Subscription> hallSubscriptions = new ArrayList<>();

    public void addSubscription(TypeOfLocation zone, Subscription subscription) {
        boolean isZoneValid = false;
        boolean isSpaceAvailable = false;

        if (zone == TypeOfLocation.GYM) {
            isZoneValid = subscription.canAccessGym;
            isSpaceAvailable = gymSubscriptions.size() < 20;
        } else if (zone == TypeOfLocation.POOL) {
            isZoneValid = subscription.canAccessPool;
            isSpaceAvailable = poolSubscriptions.size() < 20;
        } else if (zone == TypeOfLocation.HALL) {
            isZoneValid = subscription.canAccessHall;
            isSpaceAvailable = hallSubscriptions.size() < 20;
        }

        if (!isZoneValid) {
            System.out.println("Абонемент не дает доступ в выбранную зону");
        } else if (!isSpaceAvailable) {
            System.out.println("Нет свободных мест в выбранной зоне");
        } else if (subscription.isExpired()) {
            System.out.println("Абонемент просрочен"); //доработать!
        } else if (isSubscriptionRegistered(subscription)) {
            System.out.println("Абонемент уже зарегистрирован в одной из зон");
        } else {
            if (zone == TypeOfLocation.GYM) {
                gymSubscriptions.add(subscription);
            } else if (zone == TypeOfLocation.POOL) {
                poolSubscriptions.add(subscription);
            } else if (zone == TypeOfLocation.HALL) {
                hallSubscriptions.add(subscription);
            }

            System.out.println("Абонемент успешно добавлен в выбранную зону");
        }
    }

    private boolean isSubscriptionRegistered(Subscription subscription) {
        return gymSubscriptions.contains(subscription) ||
                poolSubscriptions.contains(subscription) ||
                hallSubscriptions.contains(subscription);
    }
}





