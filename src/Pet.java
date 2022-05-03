import java.time.LocalDate;

public class Pet {
    String breed;
    String name;
    boolean needsToBeRestrained;
    LocalDate dob;
    typeOfAnimal type;

    enum typeOfAnimal {
        DOG,
        CAT,
        CHICKEN
    }

    public Pet(String breed, String name, LocalDate dob, typeOfAnimal type) {
        this.breed = breed;
        this.name = name;
        this.dob = dob;
        this.type = type;
    }



    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNeedsToBeRestrained() {
        return needsToBeRestrained;
    }

    public void setNeedsToBeRestrained(boolean needsToBeRestrained) {
        this.needsToBeRestrained = needsToBeRestrained;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public typeOfAnimal getType() {
        return type;
    }

    public void setType(typeOfAnimal type) {
        this.type = type;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        now.getYear();
        now.getMonthValue();
        if (now.getMonthValue() >= dob.getMonthValue()) {
            return now.getYear() - dob.getYear();
        }
        return now.getYear() - dob.getYear() -1;
    }
    public boolean needsRestraint () {
        if(getAge() >= 13) {
            return false;
        }
        return true;
    }

}
