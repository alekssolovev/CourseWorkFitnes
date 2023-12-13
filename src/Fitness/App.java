package Fitness;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("$$$");
        FitClub fitClub;
        LocalDateTime localDate = LocalDateTime.of(2023,12,13,9,0);
        Subscription subscription = new Subscription(localDate,localDate );
        Subscription sub1 = new Subscription("Ann Dumm",
                1899,1, LocalDateTime.now(),localDate,TypeOfSub.ONETIME);
        Subscription sub2 = new Subscription("Mann Gurme",
                1999,2, LocalDateTime.now(),LocalDateTime.now().plusDays(7),TypeOfSub.DAY);
        Subscription sub3 = new Subscription("Barns Brom",
                1995,3, LocalDateTime.now(),LocalDateTime.now().plusDays(30),TypeOfSub.FULL);
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
