package Fitness;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Subscription  {  //Абонемент
    private String nameAndSurnameOwner; //имя и фамилия

    private int yearOfBirthOwner;  //год рождения

    private int numberOfSub; //номер подписки

    LocalDate dateOfReg; //дата регистрации(текущая)
    private Date expirationDate; //дата окончания регистрации

    TypeOfSub typeOfSub;

    public Subscription(String nameAndSurnameOwner, int yearOfBirthOwner, int numberOfSub, LocalDate dateOfReg, java.util.Date expirationDate, TypeOfSub typeOfSub) {
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

    public boolean canAccessGym;
    public boolean canAccessPool;
    public boolean canAccessHall;



    public boolean isExpired() {
        return expirationDate.before(new Date());
    }
}
