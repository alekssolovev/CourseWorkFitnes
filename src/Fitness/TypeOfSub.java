package Fitness;

import java.time.LocalDateTime;

public enum TypeOfSub  {
    ONETIME(TypeOfLocation.GYM),
    DAY(TypeOfLocation.GYM,TypeOfLocation.HALL),
    FULL(TypeOfLocation.GYM, TypeOfLocation.HALL, TypeOfLocation.POOL);


    private TypeOfLocation typeOfLocation;
    private TypeOfLocation typeOfLocation2;
    private TypeOfLocation typeOfLocation3;

    public TypeOfLocation getTypeOfLocation() {
        return typeOfLocation;
    }


    public TypeOfLocation getTypeOfLocation2() {
        return typeOfLocation2;
    }


    public TypeOfLocation getTypeOfLocation3() {
        return typeOfLocation3;
    }


    TypeOfSub( TypeOfLocation typeOfLocation) {
        this.typeOfLocation = typeOfLocation;
    }

    TypeOfSub( TypeOfLocation typeOfLocation, TypeOfLocation typeOfLocation2) {
        this.typeOfLocation = typeOfLocation;
        this.typeOfLocation2 = typeOfLocation2;
    }

    TypeOfSub( TypeOfLocation typeOfLocation, TypeOfLocation typeOfLocation2, TypeOfLocation typeOfLocation3) {
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






