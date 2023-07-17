import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dog> Dogs = new ArrayList<>();
        Dogs.add(new Dog());
        Dogs.add(new Dog());
        Dogs.add(new Dog());
        Dogs.add(new Dog());

        Set<Animal> Animals = new HashSet<>();
        Animals.add(new Animal());
        Animals.add(new Animal());
        Animals.add(new Animal());
        Animals.add(new Animal());

        Gadget<String> gadget = new Gadget<>("Apple");
        Gadget<Integer> gadget2 = new Gadget<>(1000);
        gadget2.gadgetPrice(1000);
        String name = gadget.name;

        getAnyAnimals(Dogs);
        getAnyAnimals(Animals);
    }
    public static void getAnyAnimals(Collection<?> Dogs) {
        for (Object item : Dogs) {
            System.out.println(item);
        }

    }
}