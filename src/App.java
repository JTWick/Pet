import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
       Pet p = new Pet("Spotted Plumpk", "Josh", LocalDate.of(2012, 7, 3), Pet.typeOfAnimal.CHICKEN);
        System.out.println(p.getBreed());
        System.out.println(p.getName());
        System.out.println(p.getDob());
        System.out.println(p.getType());
        System.out.println(p.getAge());
    }
}
