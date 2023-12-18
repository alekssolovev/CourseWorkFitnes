package Fitness;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Subscription  {  //Абонемент

    private int numberOfSub; //номер подписки

    private LocalDateTime dateOfReg; //дата начала подписки
    private LocalDateTime expirationDate; //дата окончания подписки

    private TypeOfSub typeOfSub;

    Subscriber subscriber;


    public int getNumberOfSub() {
        return numberOfSub;
    }

    public LocalDateTime getDateOfReg() {
        return dateOfReg;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public TypeOfSub getTypeOfSub() {
        return typeOfSub;
    }

    public Subscription(LocalDateTime dateOfReg,LocalDateTime expirationDate) {
        this.dateOfReg = dateOfReg;
        this.expirationDate = expirationDate;
    }

    public Subscription( Subscriber subscriber,int numberOfSub, LocalDateTime dateOfReg,
                        LocalDateTime expirationDate, TypeOfSub typeOfSub)
    {
        this.subscriber = subscriber;
        this.numberOfSub = numberOfSub;
        this.dateOfReg = dateOfReg;
        this.expirationDate = expirationDate;
        this.typeOfSub = typeOfSub;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                ", numberOfSub=" + numberOfSub +
                ", dateOfReg=" + dateOfReg +
                ", expirationDate=" + expirationDate +
                ", typeOfSub=" + typeOfSub +
                '}';
    }

    public  boolean isTooLate(Subscription subscription){
        if(TypeOfSub.ONETIME==subscription.getTypeOfSub() && subscription.typeOfSub.getTimeBefore().isAfter(LocalTime.now())){return true;}
        if(TypeOfSub.DAY==subscription.getTypeOfSub() && subscription.typeOfSub.getTimeBefore().isAfter(LocalTime.now())){return true;}
        if (TypeOfSub.FULL==subscription.getTypeOfSub() && subscription.typeOfSub.getTimeBefore().isAfter(LocalTime.now())){return true;}
        else
            return false;
    }



    public boolean isExpired(Subscription subscription) { // Проверка сроков подписки
        if(TypeOfSub.ONETIME==subscription.getTypeOfSub() && subscription.expirationDate.isAfter(LocalDateTime.now())) {return  true;}
        if(TypeOfSub.DAY==subscription.getTypeOfSub() && subscription.expirationDate.isAfter(LocalDateTime.now())){return true;}
        if (TypeOfSub.FULL==subscription.getTypeOfSub() && subscription.expirationDate.isAfter(LocalDateTime.now())){return true;}
        else
            return  false;

    }
}

