//2nd task
public class Gadget<T> {

    T name;
    T price;


    public Gadget(T name) {
        this.name = name;
    }
    public void GadgetPrice(T price) {
        this.price = price;
    }

    public void gadgetPrice(T price) {
        System.out.println(price);
    }

    @Override
    public String toString() {
        return "Gadget{" +
                "name=" + name +
                ", price=" + price +
                '}';
    }
}
