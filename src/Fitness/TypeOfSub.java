package Fitness;

import java.time.LocalDateTime;
import java.time.LocalTime;

public enum TypeOfSub  {
    ONETIME(TypeOfLocation.GYM,LocalTime.of(22,0)),
    DAY(TypeOfLocation.GYM,TypeOfLocation.HALL,LocalTime.of(16,0)),
    FULL(TypeOfLocation.GYM, TypeOfLocation.HALL, TypeOfLocation.POOL,LocalTime.of(22,0));


    private TypeOfLocation typeOfLocation;
    private TypeOfLocation typeOfLocation2;
    private TypeOfLocation typeOfLocation3;

    private LocalTime timeBefore;

    public TypeOfLocation getTypeOfLocation() {
        return typeOfLocation;
    }


    public TypeOfLocation getTypeOfLocation2() {
        return typeOfLocation2;
    }


    public TypeOfLocation getTypeOfLocation3() {
        return typeOfLocation3;
    }

    public LocalTime getTimeBefore() {
        return timeBefore;
    }

    TypeOfSub(TypeOfLocation typeOfLocation,LocalTime timeBefore) {
        this.timeBefore = timeBefore;
        this.typeOfLocation = typeOfLocation;
    }

    TypeOfSub( TypeOfLocation typeOfLocation, TypeOfLocation typeOfLocation2,LocalTime timeBefore) {
        this.timeBefore = timeBefore;
        this.typeOfLocation = typeOfLocation;
        this.typeOfLocation2 = typeOfLocation2;
    }

    TypeOfSub( TypeOfLocation typeOfLocation, TypeOfLocation typeOfLocation2, TypeOfLocation typeOfLocation3,LocalTime timeBefore) {
        this.timeBefore = timeBefore;
        this.typeOfLocation = typeOfLocation;
        this.typeOfLocation2 = typeOfLocation2;
        this.typeOfLocation3 = typeOfLocation3;
    }
}



enum TypeOfLocation {
    GYM,
    POOL,
    HALL

}






