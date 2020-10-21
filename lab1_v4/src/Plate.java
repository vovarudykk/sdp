public class Plate  extends Dinnerware {

    public Plate(String name, Color color, String manufacturer) {
        super(name, color, manufacturer);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
