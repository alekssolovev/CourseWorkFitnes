package Fitness;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class FitClub {
    private final int capasityOfLocation = 20;

    //Subscriber subscriber;


    LocalDate nowDate = LocalDate.now();

    public FitClub(List<Subscription> gymSubscriptions, List<Subscription> poolSubscriptions, List<Subscription> hallSubscriptions) {
        this.gymSubscriptions = gymSubscriptions;
        this.poolSubscriptions = poolSubscriptions;
        this.hallSubscriptions = hallSubscriptions;
    }

    private List<Subscription> gymSubscriptions;

    private List<Subscription> poolSubscriptions ;
    private List<Subscription> hallSubscriptions ;

    public void addSubscription(TypeOfLocation zone, Subscription subscription) { //добавляем посетителя в выбранную локацию
        boolean isZoneValid = false;
        boolean isSpaceAvailable = false;

        if (zone==TypeOfLocation.GYM) {
            isZoneValid = true;
            isSpaceAvailable = gymSubscriptions.size() < 20;
        } else if (zone == TypeOfLocation.POOL) {
            isZoneValid=true;
            isSpaceAvailable = poolSubscriptions.size() < 20;
        } else if (zone == TypeOfLocation.HALL) {
            isZoneValid = true;
            isSpaceAvailable = hallSubscriptions.size() < 20;
        }

        if (!isZoneValid) {
            System.out.println("Абонемент не дает доступ в выбранную зону");
        } else if (!isSpaceAvailable) {
            System.out.println("Нет свободных мест в выбранной зоне");
        } else if (subscription.isExpired(subscription)) {
            System.out.println("Абонемент просрочен");
        } else if(subscription.isTooLate(subscription)){
            System.out.println("Время не соответствует типу пабонемента");
        }
          else if (isSubscriptionRegistered(subscription)) {
            System.out.println("Абонемент уже зарегистрирован в одной из зон");
        } else {
            if (zone == TypeOfLocation.GYM) {
                gymSubscriptions.add(subscription);
            } else if (zone == TypeOfLocation.POOL) {
                poolSubscriptions.add(subscription);
            } else if (zone == TypeOfLocation.HALL) {
                hallSubscriptions.add(subscription);
            }

            System.out.println("Абонемент успешно добавлен в выбранную зону \n" + subscription.subscriber.getNameAndSurnameOwner() +
                    "\n"+zone + "\n" + LocalDateTime.now());
        }
    }

    public boolean isSubscriptionRegistered(Subscription subscription) { //метод для проверки регистрации в одной из зон
        return gymSubscriptions.contains(subscription) ||
                poolSubscriptions.contains(subscription) ||
                hallSubscriptions.contains(subscription);
    }



    public void printLocationVisitor(List<Subscription> list,List<Subscription> list2,List<Subscription> list3){
        for (Subscription subscription : gymSubscriptions) {
            System.out.println(subscription.subscriber.getNameAndSurnameOwner());// вывод информации в об абонементах
        }
        for (Subscription subscription : poolSubscriptions) {
            System.out.println(subscription.subscriber.getNameAndSurnameOwner());
        }
        for (Subscription subscription : hallSubscriptions) {
            System.out.println(subscription.subscriber.getNameAndSurnameOwner());
        }
    }
}





