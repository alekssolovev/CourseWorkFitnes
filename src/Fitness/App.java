package Fitness;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("$$$");
        FitClub fitClub;
        Subscriber subscriber1 = new Subscriber("Mann Gurme",1899);
        Subscriber subscriber3 = new Subscriber("Barns Brom",1999);
        Subscriber subscriber2 = new Subscriber("Gorn Ferty",1995);
        LocalDateTime localDate = LocalDateTime.of(2023,12,13,19,0);

        Subscription sub1 = new Subscription(subscriber1,
                1, LocalDateTime.now(),localDate,TypeOfSub.DAY);
        Subscription sub2 = new Subscription(subscriber2,2, LocalDateTime.now(),LocalDateTime.now().plusDays(7),TypeOfSub.DAY);
        Subscription sub3 = new Subscription(subscriber3,3, LocalDateTime.now(),LocalDateTime.now().plusDays(30),TypeOfSub.FULL);
        List<Subscription> gymSubscriptions = new ArrayList<>();
        List<Subscription> poolSubscriptions = new ArrayList<>();
        List<Subscription> hallSubscriptions = new ArrayList<>();

        fitClub = new FitClub(gymSubscriptions,poolSubscriptions,hallSubscriptions);
        fitClub.addSubscription(TypeOfLocation.GYM,sub1);
        fitClub.addSubscription(TypeOfLocation.GYM,sub1);
        fitClub.addSubscription(TypeOfLocation.HALL,sub2);
        fitClub.addSubscription(TypeOfLocation.POOL,sub3);
        fitClub.printLocationVisitor(gymSubscriptions,poolSubscriptions,hallSubscriptions);
    }
}
