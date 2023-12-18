package Fitness;

public class Subscriber {
    private String nameAndSurnameOwner; //имя и фамилия

    private int yearOfBirthOwner;  //год рождения

    public int getYearOfBirthOwner() {
        return yearOfBirthOwner;
    }

    public String getNameAndSurnameOwner() {
        return nameAndSurnameOwner;
    }

    public Subscriber(String nameAndSurnameOwner, int yearOfBirthOwner) {
        this.nameAndSurnameOwner = nameAndSurnameOwner;
        this.yearOfBirthOwner = yearOfBirthOwner;
    }
}
