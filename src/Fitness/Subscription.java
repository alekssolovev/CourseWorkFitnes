package Fitness;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Subscription  {  //Абонемент
    private String nameAndSurnameOwner; //имя и фамилия

    private int yearOfBirthOwner;  //год рождения

    private int numberOfSub; //номер подписки

    private LocalDateTime dateOfReg; //дата начала подписки
    private LocalDateTime expirationDate; //дата окончания подписки

    private TypeOfSub typeOfSub;

    public int getYearOfBirthOwner() {
        return yearOfBirthOwner;
    }

    public String getNameAndSurnameOwner() {
        return nameAndSurnameOwner;
    }

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

    public Subscription(String nameAndSurnameOwner, int yearOfBirthOwner, int numberOfSub, LocalDateTime dateOfReg,
                        LocalDateTime expirationDate, TypeOfSub typeOfSub) {
        this.nameAndSurnameOwner = nameAndSurnameOwner;
        this.yearOfBirthOwner = yearOfBirthOwner;
        this.numberOfSub = numberOfSub;
        this.dateOfReg = dateOfReg;
        this.expirationDate = expirationDate;
        this.typeOfSub = typeOfSub;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "nameAndSurnameOwner='" + nameAndSurnameOwner + '\'' +
                ", yearOfBirthOwner=" + yearOfBirthOwner +
                ", numberOfSub=" + numberOfSub +
                ", dateOfReg=" + dateOfReg +
                ", expirationDate=" + expirationDate +
                ", typeOfSub=" + typeOfSub +
                '}';
    }





    public boolean isExpired(Subscription subscription) { // Проверка сроков подписки
        if(TypeOfSub.ONETIME==subscription.getTypeOfSub() && subscription.expirationDate.isEqual(LocalDateTime.now())) {return  true;}
        if(TypeOfSub.DAY==subscription.getTypeOfSub() && subscription.expirationDate.isEqual(LocalDateTime.now())){return true;}
        if (TypeOfSub.FULL==subscription.getTypeOfSub() && subscription.expirationDate.isEqual(LocalDateTime.now())){return true;}
        else
            return  false;

    }
}

