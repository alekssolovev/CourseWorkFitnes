package Fitness;

import java.time.LocalTime;

public enum TypeOfSub {
    ONETIME(LocalTime.now(), TypeOfLocation.GYM,LocalTime.of(22,0)),
    DAY(LocalTime.now(), TypeOfLocation.GYM,TypeOfLocation.HALL,LocalTime.of(16,0)),
    FULL(LocalTime.now(), TypeOfLocation.GYM, TypeOfLocation.HALL, TypeOfLocation.POOL,LocalTime.of(22,0));

    private LocalTime someTime; // время посещения
    private TypeOfLocation typeOfLocation;
    private TypeOfLocation typeOfLocation2;
    private TypeOfLocation typeOfLocation3;
    private final LocalTime startVisit = LocalTime.of(8, 0); // время начала визита
    private LocalTime endVisit; // конец визита

    public LocalTime getSomeTime() {
        return someTime;
    }

    public LocalTime getStartVisit() {
        return startVisit;
    }

    public LocalTime getEndVisit() {
        return endVisit;
    }

    TypeOfSub(LocalTime someTime, TypeOfLocation typeOfLocation, LocalTime endVisit) {
        this.someTime = someTime;
        this.typeOfLocation = typeOfLocation;
        this.endVisit=endVisit;

    }

    TypeOfSub(LocalTime someTime, TypeOfLocation typeOfLocation, TypeOfLocation typeOfLocation2,
            LocalTime endVisit) {
        this.someTime = someTime;
        this.typeOfLocation = typeOfLocation;
        this.typeOfLocation2 = typeOfLocation2;
        this.endVisit=endVisit;
    }

    TypeOfSub(LocalTime someTime, TypeOfLocation typeOfLocation, TypeOfLocation typeOfLocation2,TypeOfLocation typeOfLocation3, LocalTime endVisit) {
        this.someTime = someTime;
        this.typeOfLocation = typeOfLocation;
        this.typeOfLocation2 = typeOfLocation2;
        this.typeOfLocation3 = typeOfLocation3;
        this.endVisit=endVisit;
    }
}






enum TypeOfLocation {
    GYM,
    POOL,
    HALL

}



    /*public enum TypeOfSub { //Тип подписки

    LocalDate someDateTime;//время посещения


    TypeOfLocation typeOfLocation; //тип локации
    TypeOfLocation typeOfLocation2;

    TypeOfLocation typeOfLocation3;
    private final LocalTime startVisit = LocalTime.of(8,0);// время начала визита

    LocalTime endVisit;//конец визита

        TypeOfSub(LocalDate someDateTime, TypeOfLocation typeOfLocation, TypeOfLocation typeOfLocation2, TypeOfLocation typeOfLocation3, LocalTime endVisit) {
            this.someDateTime = someDateTime;
            this.typeOfLocation = typeOfLocation;
            this.typeOfLocation2 = typeOfLocation2;
            this.typeOfLocation3 = typeOfLocation3;
            this.endVisit = endVisit;
        }
        //LocalDate nowDate = LocalDate.now();


    public TypeOfLocation getTypeOfLocation() {
        return typeOfLocation;
    }

    public TypeOfLocation getTypeOfLocation2() {
        return typeOfLocation2;
    }

    public TypeOfLocation getTypeOfLocation3() {
        return typeOfLocation3;
    }

    public LocalTime getEndVisit() {
        return endVisit;
    }

    public LocalDate getNowDate() {
        return nowDate;
    }



    public void setSomeDateTime(LocalDate someDateTime) {
        this.someDateTime = someDateTime;
    }

    public void setTypeOfLocation(TypeOfLocation typeOfLocation) {
        this.typeOfLocation = typeOfLocation;
    }

    public void setTypeOfLocation2(TypeOfLocation typeOfLocation2) {
        this.typeOfLocation2 = typeOfLocation2;
    }

    public void setTypeOfLocation3(TypeOfLocation typeOfLocation3) {
        this.typeOfLocation3 = typeOfLocation3;
    }

    public void setEndVisit(LocalTime endVisit) {
        this.endVisit = endVisit;
    }
*/




 /*   LocalDate nowDate = LocalDate.now();
    TypeOfSub oneTime = new TypeOfSub(nowDate.plusDays(1),TypeOfLocation.GYM,TypeOfLocation.POOL, LocalTime.of(22,0));
    TypeOfSub day = new TypeOfSub(nowDate.plusDays(7),TypeOfLocation.GYM,TypeOfLocation.HALL,LocalTime.of(16,0));
    TypeOfSub full = new TypeOfSub(nowDate.plusDays(30),TypeOfLocation.GYM,TypeOfLocation.HALL,TypeOfLocation.POOL,LocalTime.of(22,0));*/


